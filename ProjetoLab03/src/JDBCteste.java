import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
	}
}
