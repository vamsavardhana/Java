package driver;

import java.io.BufferedReader;
import java.sql.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;

import adapter.BuildAuto;
import database.Create;
import database.Delete;
import database.Update;
import except.AutoException;
import model.Automobile;
import model.OptionSet;
import model.OptionSet.Option;
import scale.EditOptions;
import server.BuildCarModelOptions;
import server.CarModelOptionsIO;
import util.FileIO;

public class Driver2 {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/AUTO";

	   //  Database credentials1
	   static final String USER = "root";
	   static final String PASS = "123";

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Connection conn = null;
		Statement stmt = null;
	      //STEP 2: Register JDBC driver
	      Class.forName(JDBC_DRIVER);

	      //STEP 3: Open a connection
	      System.out.println("Connecting to datdabase...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Create createAuto=new Create();
		Delete del = new Delete();
		Update up = new Update();
		up.updateAuto(conn, 3, stmt);
		//del.deleteAuto(conn, 2);
//		BuildAuto B1=new BuildAuto();
//		
//		B1.BuildAuto("ReadSource.txt");
//		B1.a1.setMake("Ford");
//		B1.a1.setModel("ZTW");
//		System.out.println(B1.a1);
//		
//Connection conn = null;
//Statement stmt = null;
//			   
//			      //STEP 2: Register JDBC driver
//			      Class.forName(JDBC_DRIVER);
//
//			      //STEP 3: Open a connection
//			      System.out.println("Connecting to datd;abase...");
//			      conn = DriverManager.getConnection(DB_URL,USER,PASS);
//			   
//
//			      //STEP 4: Execute a query
//			      System.out.println("Creating statement...");
//			      stmt = conn.createStatement();
//			      String sql;
//			      PreparedStatement preparedStmt;
//
//			      int id = 0;
//			      
//					String query = " insert into AUTOMOBILE (MAKE, MODEL, BASEPRICE)"
//					        + " values (?, ?, ?)";
//					 
//					      // create the mysql insert preparedstatement
//					
//					      try {
//					    	  preparedStmt = conn.prepareStatement(query);
//							  preparedStmt.setString (1, B1.a1.getMake());
//						      preparedStmt.setString (2, B1.a1.getModel());
//						      preparedStmt.setDouble (3, B1.a1.getBasePrice());
//						 
//						      // execute the preparedstatement
//						      preparedStmt.execute();
//						} catch (SQLException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					      
//					      String query2 = " select autoid from AUTOMOBILE where MAKE = '" + B1.a1.getMake() + "' and MODEL = '" +B1.a1.getModel()+ "' ;";
//					  
//						    
//					     
//					      stmt = conn.createStatement();
//					      ResultSet rs = stmt.executeQuery(query2);
//					   
//					      while(rs.next()){
//						         //Retrieve by column name
//						          id  = rs.getInt("autoid");
//					      }
//					      
//					      ArrayList<OptionSet> sets = new ArrayList<OptionSet>();
//							sets = B1.a1.getOpset();
//							if (! sets.isEmpty()){
//							
//							for(OptionSet o : sets){
//								
//								
//								String query3 = " insert into optionset (autoid,optionsetname)"
//								        + " values (?, ?)";
//								 
//								      // create the mysql insert preparedstatement
//								      try {
//								    	  preparedStmt = conn.prepareStatement(query3);
//										  preparedStmt.setInt (1, id);
//									      preparedStmt.setString (2, o.getName());
//									      
//									     
//									 
//									      // execute the preparedstatement
//									      preparedStmt.execute();
//									} catch (SQLException e) {
//										// TODO Auto-generated catch block
//										e.printStackTrace();
//									}
//								
//								
//								ArrayList<Option> opt = B1.a1.getoptnarray(o);  //a.getopt((OptionSet)o);
//								
//								System.out.println(opt);
//								for (Option opts:opt){
//									//System.out.println(((Option)opts).getName());
//									String queryt = " insert into OPTIONS ( autoid,optionsetname,optionname,price)"
//							        + " values (?,?, ?,?)";
//							 
//							      // create the mysql insert preparedstatement
//							      try {
//							    	  preparedStmt = conn.prepareStatement(queryt);
//							    	  preparedStmt.setInt (1, id);
//									  preparedStmt.setString (2, o.getName());
//								      preparedStmt.setString (3, opts.getName());
//								      preparedStmt.setDouble (4, opts.getPrice());
//								     
//								 
//								      // execute the preparedstatement
//								      preparedStmt.execute();
//								} catch (SQLException e) {
//									// TODO Auto-generated catch block
//									e.printStackTrace();
//								}
//								}
//					      
//			   //   System.out.println(id);
			      
//			      sql = "SELECT  FROM Employees";
//			      ResultSet rs = stmt.executeQuery(sql);
//
//			      //STEP 5: Extract data from result set
//			      while(rs.next()){
//			         //Retrieve by column name
//			         int id  = rs.getInt("id");
//			         int age = rs.getInt("age");
//			         String first = rs.getString("first");
//			         String last = rs.getString("last");
//
//			         //Display values
//			         System.out.print("ID: " + id);
//			         System.out.print(", Age: " + age);
//			         System.out.print(", First: " + first);
//			         System.out.println(", Last: " + last);
//			      }
			      //STEP 6: Clean-up environment
//			      rs.close();
//			      stmt.close();
//			      conn.close();
//			   }catch(SQLException se){
//			      //Handle errors for JDBC
//			      se.printStackTrace();
//			   }catch(Exception e){
//			      //Handle errors for Class.forName
//			      e.printStackTrace();
//			   }finally{
//			      //finally block used to close resources
//			      try{
//			         if(stmt!=null)
//			            stmt.close();
//			      }catch(SQLException se2){
//			      }// nothing we can do
//			      try{
//			         if(conn!=null)
//			            conn.close();
//			      }catch(SQLException se){
//			         se.printStackTrace();
//			      }//end finally try
//			   }//end try
//			   System.out.println("Goodbye!");
							}
			   
			   }
	
