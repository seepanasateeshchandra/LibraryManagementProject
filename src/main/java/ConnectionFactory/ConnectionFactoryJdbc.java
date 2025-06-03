package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryJdbc {
	
	static Connection con = null;
	
	static String url = "jdbc:mysql://localhost:3306/librarydb";
	
	static String un = "root";
	
	static String pwd = "admin1234";
	
	public static Connection requestConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		con = DriverManager.getConnection(url, un, pwd);
		
		return con;
		
	}
	
	

}
