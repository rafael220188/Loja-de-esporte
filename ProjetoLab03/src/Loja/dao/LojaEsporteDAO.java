package Loja.dao;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import pojo.Cliente;
import pojo.Produto;


public class LojaEsporteDAO {

	public Cliente findClienteByCPF(String cpf) {
		Cliente cliente = null;
		String cmd = "select * from cliente where cpf= ?";
		//String cmd = "select * from cliente";
		
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
			st.setString(1, cpf);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				int codCliente = rs.getInt(1);
				String cpfBD = rs.getString(2);
				String endereco = rs.getString(3);
				String nome = rs.getString(4);
				String telefone = rs.getString(5);
				cliente = new Cliente(nome, endereco, cpfBD, telefone,
						codCliente);

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
		String cmd = "insert into cliente(cpf, endereco, nome, telefone) values (?, ?, ?, ?)";

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
			st.setString(3, cliente.getNome());
			st.setString(4, cliente.getTelefone());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir cliente!");
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
	
	public Produto findProdutoByCPF(String codigo) {
		Produto produto = null;
		String cmd = "select * from produto";

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
			// st.setString(1, cpf);
			rs = st.executeQuery();

			while (rs.next()) {
				// copiar dados para POJO
				String codProduto = rs.getString(1);
				String nome = rs.getString(2);
				String preco = rs.getString(3);
				String quantidade = rs.getString(4);
				produto = new Produto(codProduto, nome, preco, quantidade);
				
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
		return produto;
	}
	
	public void insertProduto(Produto produto) {
		String cmd = "insert into produto(codigo, nome, preco, quantidade) values (?, ?, ?, ?)";

		Connection db = null;
		PreparedStatement st = null;

		try {
			// abrir conexão
			Properties props = new Properties();
			props.load(new FileInputStream("lojaEsporte.properties"));
			String url = props.getProperty("url");

			db = DriverManager.getConnection(url, props);

			st = db.prepareStatement(cmd);
			st.setString(1, produto.getCodigo());
			st.setString(2, produto.getNome());
			st.setString(3, produto.getPreco());
			st.setString(4, produto.getQuantidade());
			int r = st.executeUpdate();

			if (r != 1) {
				throw new RuntimeException("Erro ao inserir produto!");
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