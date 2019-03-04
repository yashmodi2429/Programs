import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.Connection;
public class DBUtil {

	public static void main(String[] args) throws Exception
	{
		String query="insert into emp values(?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","yash");
		PreparedStatement stmt=con.prepareStatement(query);
		Scanner s=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("enter id");
			int id = s.nextInt();
			stmt.setInt(1,id);
			System.out.println("enter name");
			String name = s.next();
			stmt.setString(2,name);
			int i=stmt.executeUpdate();
			System.out.println("press 1 for another record");
			int userinput=s.nextInt();
			if(userinput==1)
			{}
			else
			{
				System.exit(0);
			}
		}
	}

}
