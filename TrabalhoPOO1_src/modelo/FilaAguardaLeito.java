package modelo;

public class FilaAguardaLeito {
	private NoAtendimento primeiro;

	public FilaAguardaLeito(NoAtendimento primeiro) {
		super();
		this.primeiro = primeiro;
	}
	
	public FilaAguardaLeito () {
		
	}
	
	public int tamanho() {
		int cont = 0;
			for(NoAtendimento na = this.primeiro; na != null; na = na.getProximo()) {
				cont ++;
			}
			return cont;
	}
	
	public boolean estaVazia() {
		if(this.primeiro == null) {
			return true;
		}
		return false ;
	}
	
	public void enfileirar(AtendimentoEnfermaria ae){
		if(estaVazia()){
			this.primeiro = new NoAtendimento(ae, primeiro);
		}else {
			NoAtendimento novoNo = new NoAtendimento(ae);
			NoAtendimento aux = this.primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoNo);
		}
	}
	
	public NoAtendimento desinfileirar(){ 
		NoAtendimento aux = null;
		if (estaVazia()){
			return null;
		}
		else 
			aux = this.primeiro;
			this.primeiro=primeiro.getProximo();
			return aux;
		}

	
	public NoAtendimento topo() { 
		if (estaVazia()){
			return null;
		}
		else 
			return this.primeiro;
		}
	
	
	public void esvaziar(){ 
		this.primeiro = null;
	} 
	

	public void imprimir(){
		for (NoAtendimento novo = this.topo(); novo.getProximo != null; novo = novo.getProximo()){
			System.out.println(novo.getAe().getP().getNome());
		}
	}
}
