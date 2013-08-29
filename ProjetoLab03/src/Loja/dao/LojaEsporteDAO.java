
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import pojo.Cliente;


public class LojaEsporteDAO {

	public Cliente findContaByCPF(String cpf) {
		Cliente cliente = null;
		String cmd = "select * from cliente";

		Connection db = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("lojaEsporte.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			//st.setString(1, cpf);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				int codCliente = rs.getInt(1);
				String cpfBD = rs.getString(2);
				String endereco = rs.getString(3);
				String nome = rs.getString(4);
				String telefone = rs.getString(5);
				cliente = new Cliente(nome, endereco, cpfBD, telefone, codCliente);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cliente;
	}

	public void insertCliente(Cliente cliente) {
		String cmd = "insert into pdr_contas(cpf, nome, numero) values (?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("lojaEsporte.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, cliente.getCpf());
			st.setString(2, cliente.getEndereco());
			st.setString(2, cliente.getNome());
			st.setString(3, cliente.getTelefone());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir conta!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null) {
					st.close();
				}
				if (db != null) {
					db.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}