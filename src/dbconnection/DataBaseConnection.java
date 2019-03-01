package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Register SQL driver class And Create and Return SQL database connection
 * @author SHIVAM JAMAIWAR
 *
 */
public class DataBaseConnection {

	/**
	 * register SQL driver class and create data base connection
	 * @return connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/softtronix","root","this4now");
		return conn;
	}
}

