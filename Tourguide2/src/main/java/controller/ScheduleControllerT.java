package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;



public class ScheduleControllerT {
	//database connection      
		private static boolean isSuccess;
		private static Connection con=null;
		private static Statement stmt=null;   
		private static ResultSet rs=null;
		
		//insert function 
		
		public static boolean SchedInsertdata(int schedule_id,int guide_id,Date  tour_date,String description, String location,String status) {
			
			boolean isSuccess=false;
			
			try {
				//database connection call
				con=DBconnection.getConnection();
				stmt=con.createStatement();
				
				//sql quary
				String sql="insert into schedule values(0,'"+guide_id+"','"+tour_date+"','"+location+"','"+description+"','"+status+"')";
				int rs=stmt.executeUpdate(sql);
				if(rs>0) {
					isSuccess=true;
				}else {
					isSuccess=false;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return isSuccess;
		}

}
