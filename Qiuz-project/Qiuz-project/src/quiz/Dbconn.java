package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconn {
	public static Connection getConn() throws ClassNotFoundException, SQLException{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String user = "root";
		String password = "mysql";
		String url = "jdbc:mysql://localhost:3306/quiz_program?characterEncoding=utf-8&serverTimezone=Asia/Seoul";
		
		//접속
		return DriverManager.getConnection(url, user, password);
	}
}
