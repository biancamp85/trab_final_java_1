package modelo;

public class Leitos {
	private String ala;
	private int qnt; //quantidade
	
	public Leitos(String ala, int qnt) {
		super();
		this.ala = ala;
		this.qnt = qnt;
	}

	public String getAla() {
		return ala;
	}

	public void setAla(String ala) {
		this.ala = ala;
	}

	public int getQnt() {
		return qnt;
	}

	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
}