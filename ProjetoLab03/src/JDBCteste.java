
import java.sql.*;

public class JDBCteste {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/Loja";
		String username = "postgres";
		String password = "1234";

		Connection db = DriverManager.getConnection(url, username, password);
		System.out.println("Conectado!");
	}
}
