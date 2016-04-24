package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import adapter.BuildAuto;
import model.OptionSet;
import model.OptionSet.Option;

public class Update {
	public void insertAuto(Statement stmt,Connection conn) throws ClassNotFoundException, SQLException {
		BuildAuto B1=new BuildAuto();
		
		B1.BuildAuto("ReadSource.txt");
		B1.a1.setMake("Ford");
		B1.a1.setModel("ZTW");
		System.out.println(B1.a1);
		

			   
			   

			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql;
			      PreparedStatement preparedStmt;

			      int id = 0;
			      
					String query = " insert into AUTOMOBILE (MAKE, MODEL, BASEPRICE)"
					        + " values (?, ?, ?)";
					 
					      // create the mysql insert preparedstatement
					
					      try {
					    	  preparedStmt = conn.prepareStatement(query);
							  preparedStmt.setString (1, B1.a1.getMake());
						      preparedStmt.setString (2, B1.a1.getModel());
						      preparedStmt.setDouble (3, B1.a1.getBasePrice());
						 
						      // execute the preparedstatement
						      preparedStmt.execute();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					      
					      String query2 = " select autoid from AUTOMOBILE where MAKE = '" + B1.a1.getMake() + "' and MODEL = '" +B1.a1.getModel()+ "' ;";
					  
						    
					     
					      stmt = conn.createStatement();
					      ResultSet rs = stmt.executeQuery(query2);
					   
					      while(rs.next()){
						         //Retrieve by column name
						          id  = rs.getInt("autoid");
					      }
					      
					      ArrayList<OptionSet> sets = new ArrayList<OptionSet>();
							sets = B1.a1.getOpset();
							if (! sets.isEmpty()){
							
							for(OptionSet o : sets){
								
								
								String query3 = " insert into optionset (autoid,optionsetname)"
								        + " values (?, ?)";
								 
								      // create the mysql insert preparedstatement
								      try {
								    	  preparedStmt = conn.prepareStatement(query3);
										  preparedStmt.setInt (1, id);
									      preparedStmt.setString (2, o.getName());
									      
									     
									 
									      // execute the preparedstatement
									      preparedStmt.execute();
									} catch (SQLException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								
								
								ArrayList<Option> opt = B1.a1.getoptnarray(o);  //a.getopt((OptionSet)o);
								
								System.out.println(opt);
								for (Option opts:opt){
									//System.out.println(((Option)opts).getName());
									String queryt = " insert into OPTIONS ( autoid,optionsetname,optionname,price)"
							        + " values (?,?, ?,?)";
							 
							      // create the mysql insert preparedstatement
							      try {
							    	  preparedStmt = conn.prepareStatement(queryt);
							    	  preparedStmt.setInt (1, id);
									  preparedStmt.setString (2, o.getName());
								      preparedStmt.setString (3, opts.getName());
								      preparedStmt.setDouble (4, opts.getPrice());
								     
								 
								      // execute the preparedstatement
								      preparedStmt.execute();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								}
					      
							}
			   }

}
	public void deleteAuto(Connection conn, int autoid) throws ClassNotFoundException, SQLException {
		
		
		
		
	      Statement stmt;    
	      stmt = conn.createStatement();
	      
			String query = " delete from OPTIONS where autoid="+Integer.toString(autoid);
			 
			      // create the mysql insert preparedstatement
			
			    
				     stmt.execute(query);
				
			      
				     String query2 = " delete from optionset where autoid="+Integer.toString(autoid);
					 
				      // create the mysql insert preparedstatement
				
				    
					     stmt.execute(query2);
					     
					     String query3 = " delete from AUTOMOBILE where autoid="+Integer.toString(autoid);
						 
					      // create the mysql insert preparedstatement
					
					    
						     stmt.execute(query3);
}
	public void updateAuto(Connection conn,int autoid, Statement stmt) throws ClassNotFoundException, SQLException{
		deleteAuto(conn,autoid);
		insertAuto(stmt,conn);
	}
	
}