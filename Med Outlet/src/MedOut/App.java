package MedOut;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		SQLite test=new SQLite();
	    try {
	    	test.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    Login ob=new Login(45);
		ob.main(args);
	 
	}

}
