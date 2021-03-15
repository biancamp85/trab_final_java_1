package modelo;

public class NoPaciente {
	
	private Paciente p;
	private NoPaciente proximo;
	private NoPaciente anterior;
	public Object getProximo;
	
	public NoPaciente(Paciente p) {
		this.p = p;
		this.proximo = null;
		this.anterior =null;
	}
	
	public NoPaciente(Paciente p, NoPaciente proximo) {
		this.p = p;
		this.proximo = proximo;
		
	}
	
	public NoPaciente getAnterior() {
		return anterior;
	}
	public void setAnterior(NoPaciente anterior) {
		this.anterior = anterior;
	}
	public Paciente getP() {
		return p;
	}

	public void setP(Paciente p) {
		this.p = p;
	}

	public NoPaciente getProximo() {
		return proximo;
	}

	public void setProximo(NoPaciente proximo) {
		this.proximo = proximo;
	}
	
	

}
