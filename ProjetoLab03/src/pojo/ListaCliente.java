package pojo;

public class ListaCliente {
	
	private String nome;
	private String Cpf;
	private String telefone;
	
	public ListaCliente(String nome, String cpf, String telefone) {
		super();
		this.nome = nome;
		Cpf = cpf;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "ListaCliente [nome=" + nome + ", Cpf=" + Cpf + ", telefone="
				+ telefone + "]";
	}

	public Object getCodCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}
