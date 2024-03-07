
package controler;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Signupcontrol {
	static String dbUrl="jdbc:mysql://localhost:3306/taxidb";
    static String dbUname="root";
    static String dbPassword="";
    static String dbDriver="com.mysql.cj.jdbc.Driver";
	String name,pass,email,phno;
	public Signupcontrol(String n,String ps,String em,String ph){
		name=n;
		pass=ps;
		email=em;
		phno=ph;
	}
	public void toStore() {
		  System.out.println(name+"\n"+pass+"\n"+email+"\n"+phno);
		  Connection con = null;
	   		try{
	   			Class.forName(dbDriver);  //class not found exception
	 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
	 			String sql = "insert into signup (uname,pass,email,phno)"
	 					+ "values('"+name+"','"+pass+"','"+email+"','"+phno+"')";
	 			java.sql.Statement s = con.createStatement();
	 			s.execute(sql);
	 		   	con.close();
			} catch(Exception e){      
				e.printStackTrace();
			}
		
	   
	}


}
