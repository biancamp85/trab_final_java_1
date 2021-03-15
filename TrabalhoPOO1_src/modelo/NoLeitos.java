package modelo;

public class NoLeitos {
	private int numero;
	private NoLeitos proximo;
	public Object getProximo;
	
	public NoLeitos(int numero, NoLeitos proximo) {
		super();
		this.numero = numero;
		this.proximo = proximo;
	}

	public NoLeitos (int numero){
		this.numero = numero;
		this.proximo = null;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public NoLeitos getProximo() {
		return proximo;
	}

	public void setProximo(NoLeitos proximo) {
		this.proximo = proximo;
	}
}