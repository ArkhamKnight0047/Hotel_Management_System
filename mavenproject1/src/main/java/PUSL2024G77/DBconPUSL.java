package PUSL2024G77;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBconPUSL {
	private static final String DB_DRIVER_CLASS="com.mysql.jdbc.Driver";
	
	private static Connection connection = null;
	static{
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pusl2024g77","root","");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return connection;
	}
}
