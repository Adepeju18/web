import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet; 

public class DBConnection {
	public int insert(String uname, String email, String pass, int uid) 
	{
		String DriveName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tta?autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "root";
		
		int row_update = 0;
		try
		{
			Class.forName(DriveName);
			Connection con = DriverManager.getConnection(url, user, password);
			
			Statement stmt = con.createStatement();
			
			 row_update = stmt.executeUpdate("insert into users(uid,uname,email,pass) values("+uid+",'"+uname+"','"+pass+"','"+email+"')");	
					
//					System.out.println("Row update :"+row_update);
					return row_update;
		}
		catch(Exception ex)
		{
					System.out.println("DB Error :"+ex);
		}
		return row_update;
	}
	}


