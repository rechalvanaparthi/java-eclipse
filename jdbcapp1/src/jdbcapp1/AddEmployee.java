package jdbcapp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddEmployee {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver, url , user , password;
		driver = "com.mysql.cj.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/edb_12980";
		user = "root";
		password = "root";
		
		String sql = "insert into employee values(?,?,?,?,?)";
		
		//1.Load the driver
		Class.forName(driver);
		
		//2.Establish Connection
		Connection con = DriverManager.getConnection(url,user,password);
		
		//3.Create PreparedStatement Object
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 5);
		ps.setString(2, "Krish");
		ps.setString(3, "Krish@gmail.com");
		ps.setLong(4, 9988776655L);
		ps.setString(5, "M");
		
		//4.Execute Insert sql query
		int status = ps.executeUpdate();          //To Process The DML Operations
		if(status >= 1) {
			System.out.println("New Employee is added");
		}else {
			System.out.println("Failed");
		}
		
		//5.Close Resources
		ps.close();
		con.close();
}
}