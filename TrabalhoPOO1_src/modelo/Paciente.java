package modelo;

public class Paciente {

	private String cpf;
	private String nome;
	private String dataNascimento;
	private String endereco;
	private Object tipoSangue;
	private String nomepai;
	private String nomemae;

	public Paciente() {
		super();
	}

	public Paciente(String cpf, String nome, String dataNascimento,
			String endereco, Object tipoSangue, String nomepai, String nomemae) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.tipoSangue = tipoSangue;
		this.nomepai = nomepai;
		this.nomemae = nomemae;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Object getTipoSangue() {
		return tipoSangue;
	}

	public void setTipoSangue(Object tipoSangue) {
		this.tipoSangue = tipoSangue;
	}

	
	public String getNomepai() {
		return nomepai;
	}

	public void setNomepai(String nomepai) {
		this.nomepai = nomepai;
	}

	public String getNomemae() {
		return nomemae;
	}

	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}

	public String toString() {

		return "" + cpf + "#" + nome + "#" + dataNascimento + "#" + endereco + "#" + tipoSangue + "#" + nomepai + "#" + nomemae + "\n";
	}

}