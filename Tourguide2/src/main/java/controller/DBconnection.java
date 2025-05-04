package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	private static String url="jdbc:mysql://localhost:3306/tour_guide";
	  private static String username="root"; 
	  private static String password="thanuja210";    
	  
	  public static Connection con;
	  public static Connection getConnection() {
	      try {
	        Class.forName("com.mtsql.jdbc.Driver");
	        con= DriverManager.getConnection(url, username, password);
	      }catch( Exception e) {
	        System.out.println("database not connect");
	      }
	  
	  return con;
	  }

}
