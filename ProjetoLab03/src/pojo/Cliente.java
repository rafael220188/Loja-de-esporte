package pojo;

public class Cliente {

	private int codCliente;
	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;

	public Cliente(String nome, String endereco, String cpf, String telefone,
			int codCliente) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.codCliente = codCliente;
	}
	


	public Cliente( String nome, String endereco, String cpf, String telefone) {
		super();
		this.codCliente = 1;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}



	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nome=" + nome
				+ ", endereco=" + endereco + ", cpf=" + cpf + ", telefone="
				+ telefone + "]";
	}

	
}
