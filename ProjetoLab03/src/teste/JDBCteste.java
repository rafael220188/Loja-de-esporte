package teste;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCteste {

	// String url = "jdbc:postgresql://localhost:5432/Loja";
	// String username = "postgres";
	// String password = "1234";

	// http://jdbc.postgresql.org/documentation/head/connect.html
	public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
		Properties props = new Properties();
		props.load(new FileInputStream("lojaEsporte.properties"));
		String url = props.getProperty("url");

		Connection db = DriverManager.getConnection(url, props);
		System.out.println("Conectado!");
		
		
		//String cpf = "01565498723";
		String cmd = "select * from cliente";// where cpf = ?";
		PreparedStatement st = db.prepareStatement(cmd);
		//st.setString(1, cpf);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
		    System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5)+"\n");
		}	

		rs.close();
		st.close();
	}
}
