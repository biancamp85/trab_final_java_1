package modelo;

public class AtendimentoEnfermaria {

	private Paciente p;
	private String CPF;
	private String dataChegada;
	private String horaChegada;
	private String horaSaida;
	private String dataSaida;
	
	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public AtendimentoEnfermaria()
	{
		
	}
	
	public AtendimentoEnfermaria(Paciente p, java.lang.String dataChegada, java.lang.String horaChegada) {
		super();
		this.p = p;
		this.dataChegada = dataChegada;
		this.horaChegada = horaChegada;
	}

	public Paciente getP() {
		return p;
	}
	public void setP(Paciente p) {
		this.p = p;
	}
	public String getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(String dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	
}