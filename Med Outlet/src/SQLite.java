	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

public class SQLite {


		static Connection con;
		private static boolean hasData = false;
		public ResultSet displayUsers() throws SQLException, ClassNotFoundException
		 {
			 if (con==null)
				 getConnection();
			 Statement state=con.createStatement();
			 ResultSet res=state.executeQuery("SELECT fname,lname FROM user");
			 return res;
		 }
	public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:Database.db");
			initialise();
			return con;
		}
		static void initialise() throws SQLException {
			if(!hasData)
				hasData=true;
			Statement state=con.createStatement();
			ResultSet res=state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='user'");
			if(!res.next())
			{
				state.execute("CREATE  TABLE user(id integer,"+"fName varchar(60),"+"lName varchar(60),"+"primary key(id));");
				state.execute("CREATE  TABLE login(id integer,"+"username varchar(60),"+"password varchar(60));");
				PreparedStatement prep4=con.prepareStatement("INSERT INTO login values(?,?,?);");
				prep4.setString(2, "admin");
				prep4.setString(3, "password");
				prep4.execute();
			}

		}
	}


