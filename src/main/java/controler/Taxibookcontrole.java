package controler;

import java.sql.Connection;
import java.sql.DriverManager;

public class Taxibookcontrole {
	static String dbUrl="jdbc:mysql://localhost:3306/taxidb";	
	static String dbUname="root";
	static String dbPassword="";
	static String dbDriver="com.mysql.cj.jdbc.Driver";
	String data, pick,dest,type;
	public Taxibookcontrole(String dt,String p,String d,String t){
		data=dt;
		pick=p;
		dest=d;
		type =t;
	}
	public void Store() {
		  Connection con = null;
	   		try{
	   			Class.forName(dbDriver);  //class not found exception
	 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
	 			String sql = "insert into hour (data,pick,dest,type)"
	 					+ "values('"+data+"','"+pick+"','"+dest+"','"+type+"')";
	 			java.sql.Statement s = con.createStatement();
	 			s.execute(sql);
	 		   	con.close();
			} catch(Exception e){      
				e.printStackTrace();
			}
	}
	
}
