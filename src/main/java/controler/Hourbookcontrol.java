
package controler;

import java.sql.Connection;
import java.sql.DriverManager;

public class Hourbookcontrol {
static String dbUrl="jdbc:mysql://localhost:3306/taxidb";	
static String dbUname="root";
static String dbPassword="";
static String dbDriver="com.mysql.cj.jdbc.Driver";
String hour, pick,dest,type;


public  Hourbookcontrol(String p,String d,String ty,String h){
	
	
	pick=p;
	dest=d;
	type=ty;
	hour=h;
}
public void Store() {
	//  System.out.println(name+"\n"+pass+"\n"+email+"\n"+phno);
	  Connection con = null;
   		try{
   			Class.forName(dbDriver);  //class not found exception
 			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
 			String sql = "insert into booking (pick,dest,type,hour)"
 					+ "values('"+pick+"','"+dest+"','"+type+"','"+hour+"')";
 			java.sql.Statement s = con.createStatement();
 			s.execute(sql);
 		   	con.close();
		} catch(Exception e){      
			e.printStackTrace();
		}
	
   
}
	

}
