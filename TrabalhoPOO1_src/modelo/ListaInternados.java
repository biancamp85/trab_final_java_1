package modelo;

public class ListaInternados { //criar no
	private int CPF;
	private String nome;
	private String ala;
	
	public ListaInternados(int cPF, String nome, String ala) {
		super();
		CPF = cPF;
		this.nome = nome;
		this.ala = ala;
	}
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAla() {
		return ala;
	}
	public void setAla(String ala) {
		this.ala = ala;
	}
}