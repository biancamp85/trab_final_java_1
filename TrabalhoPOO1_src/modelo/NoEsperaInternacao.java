package modelo;

public class NoEsperaInternacao {
	private FilaEsperaInternacao ei;
	private NoEsperaInternacao proximo;
	private NoEsperaInternacao anterior;
	public Object getProximo;
	
	public NoEsperaInternacao(FilaEsperaInternacao ei, NoEsperaInternacao proximo, NoEsperaInternacao anterior,
			Object getProximo) {
		super();
		this.ei = ei;
		this.proximo = null;
		this.anterior = null;
		
	}
	
	public NoEsperaInternacao (FilaEsperaInternacao ei, NoEsperaInternacao proximo) {
		this.ei = ei;
		this.proximo = proximo;
		
	}
	
	public FilaEsperaInternacao getEi() {
		return ei;
	}
	public void setEi(FilaEsperaInternacao ei) {
		this.ei = ei;
	}
	public NoEsperaInternacao getProximo() {
		return proximo;
	}
	public void setProximo(NoEsperaInternacao proximo) {
		this.proximo = proximo;
	}
	public NoEsperaInternacao getAnterior() {
		return anterior;
	}
	public void setAnterior(NoEsperaInternacao anterior) {
		this.anterior = anterior;
	}
	public Object getGetProximo() {
		return getProximo;
	}
	public void setGetProximo(Object getProximo) {
		this.getProximo = getProximo;
	}
	
}
