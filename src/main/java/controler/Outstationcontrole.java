package controler;

import java.sql.Connection;
import java.sql.DriverManager;

public class Outstationcontrole {
	static String dbUrl="jdbc:mysql://localhost:3306/taxidb";
	static String dbUname="root";
	static String dbPassword="";
	static String dbDriver="com.mysql.cj.jdbc.Driver";
	String pick,dest;


	public  Outstationcontrole(String p,String d){
		pick=p;
		dest=d;
		
	}
	public void Store() {
		//  System.out.println(name+"\n"+pass+"\n"+email+"\n"+phno);
		  Connection con = null;
	   		try{
	   			Class.forName(dbDriver);  //class not found exception
	 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
	 			String sql = "insert into outstation (pick,dest)"
	 					+ "values('"+pick+"','"+dest+"')";
	 			java.sql.Statement s = con.createStatement();
	 			s.execute(sql);
	 		   	con.close();
			} catch(Exception e){      
				e.printStackTrace();
			}
		
	   
	}
		


}
