package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Signincontrol {
	static String dbUrl="jdbc:mysql://localhost:3306/taxidb";
    static String dbUname="root";
    static String dbPassword="";
    static String dbDriver="com.mysql.cj.jdbc.Driver";
    String pass,email ;
    public Signincontrol(String e, String p){
    	email=e;
    	pass=p;
    	
    }
    public boolean tolog() throws SQLException  {
    	 Connection con = null;
    	 try {
			Class.forName(dbDriver);
			con=DriverManager.getConnection(dbUrl,dbUname,dbPassword);
			String sql="select * from signup where email='"+email+"'and pass='"+pass+"'";
			java.sql.Statement s=con.createStatement();
			ResultSet rs=s.executeQuery(sql);
			if(rs.next()) {
				return true;
			}
			con.close();
			return false;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
    	 
    }

}
