package modelo;

public class NoAtendimento {
	
	private AtendimentoEnfermaria ae;
	private NoAtendimento proximo;
	private NoAtendimento anterior;
	public Object getProximo;
	
	public NoAtendimento(AtendimentoEnfermaria ae) {
		this.ae = ae;
		this.proximo = null;
		this.anterior =null;
	}
	
	public NoAtendimento(AtendimentoEnfermaria a, NoAtendimento proximo) {
		this.ae = ae;
		this.proximo = proximo;
		
	}

	public AtendimentoEnfermaria getAe() {
		return ae;
	}

	public void setAe(AtendimentoEnfermaria ae) {
		this.ae = ae;
	}

	public NoAtendimento getProximo() {
		return proximo;
	}

	public void setProximo(NoAtendimento proximo) {
		this.proximo = proximo;
	}

	public NoAtendimento getAnterior() {
		return anterior;
	}

	public void setAnterior(NoAtendimento anterior) {
		this.anterior = anterior;
	}

	public Object getGetProximo() {
		return getProximo;
	}

	public void setGetProximo(Object getProximo) {
		this.getProximo = getProximo;
	}
}