package MedOut;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class SQLite {


		static Connection con;
		private static boolean hasData = false;
	public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite::resource:MedOut/Database.db");
			initialise();
			return con;
		}
		static void initialise() throws SQLException {
			if(!hasData)
				hasData=true;
				Statement state=con.createStatement();
				state.execute("CREATE TABLE IF NOT EXISTS login(id integer,"+"username varchar(60),"+"password varchar(60));");
				state.execute("CREATE TABLE IF NOT EXISTS stock(id integer,"+"medname varchar(60),"+"q integer);");
				state.execute("CREATE TABLE IF NOT EXISTS sales(id integer,"+"accname varchar(60),"+"medname varchar(60),"+"q integer);");
				state.execute("CREATE TABLE IF NOT EXISTS company(id integer,"+"compname varchar(60),"+"compdets varchar(200));");
				PreparedStatement prep4=con.prepareStatement("INSERT INTO login values(?,?,?);");
				prep4.setString(2, "admin");
				prep4.setString(3, "password");
				prep4.execute();
				prep4.setString(2, "test1");
				prep4.setString(3, "pass");
				prep4.execute();
				con.close();
		}
	}


