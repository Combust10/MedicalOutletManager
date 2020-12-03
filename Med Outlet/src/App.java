import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		SQLite test=new SQLite();
		ResultSet rs;
	    try {
			rs=test.displayUsers();
			   while(rs.next())
			    {
			    	System.out.println(rs.getString("fname")+" "+rs.getString("lname"));
			    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			Login ob=new Login();
			ob.main(args);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	}

}
