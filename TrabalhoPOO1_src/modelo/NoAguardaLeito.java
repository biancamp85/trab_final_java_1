package modelo;

public class NoAguardaLeito {
	
	private FilaAguardaLeito al;
	private NoAguardaLeito proximo;
	private NoAguardaLeito anterior;
	public Object getProximo;
	
	public NoAguardaLeito(FilaAguardaLeito al, NoAguardaLeito proximo, NoAguardaLeito anterior, Object getProximo) {
		super();
		this.al = al;
		this.proximo = null;
		this.anterior = null;
		
	}

	public NoAguardaLeito (FilaAguardaLeito al, NoAguardaLeito proximo) {
		this.al = al;
		this.proximo = proximo;
		
	}
	
	public FilaAguardaLeito getAl() {
		return al;
	}

	public void setAl(FilaAguardaLeito al) {
		this.al = al;
	}

	public NoAguardaLeito getProximo() {
		return proximo;
	}

	public void setProximo(NoAguardaLeito proximo) {
		this.proximo = proximo;
	}

	public NoAguardaLeito getAnterior() {
		return anterior;
	}

	public void setAnterior(NoAguardaLeito anterior) {
		this.anterior = anterior;
	}

	public Object getGetProximo() {
		return getProximo;
	}

	public void setGetProximo(Object getProximo) {
		this.getProximo = getProximo;
	}
	
}
