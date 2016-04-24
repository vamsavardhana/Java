package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import adapter.BuildAuto;
import model.OptionSet;
import model.OptionSet.Option;

public class Delete {

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
}}
