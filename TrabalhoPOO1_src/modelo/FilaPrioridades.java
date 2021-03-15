package modelo;
//import modelo.AtendimentoEnfermaria;

public class FilaPrioridades {
	private NoAtendimento topo;

	public FilaPrioridades() {
		this.topo = null;
	}
		
	public int tamanho(){
			int tamanho = 0;
			for (NoAtendimento aux = this.topo; aux != null; aux = aux.getProximo()){
				tamanho++;
			}
			return tamanho;
		}
		
	public boolean estaVazia() {
			return (this.topo == null);
		}	
	
	public void enfileirar(AtendimentoEnfermaria ae){ 
			NoAtendimento novo = new NoAtendimento(ae);
			if (estaVazia())
				this.topo = novo;
			else{
				NoAtendimento aux = this.topo;
				while(aux.getProximo() != null)
				aux = aux.getProximo();
				aux.setProximo(novo);
			}
		}
		
	public void enfileirarNo(NoAtendimento na){ 
			NoAtendimento novo = na;
			if (estaVazia())
				this.topo = novo;
			else{
				NoAtendimento aux = this.topo;
				while(aux.getProximo() != null)
				aux = aux.getProximo();
				aux.setProximo(novo);
			}
		}
		
		
	public NoAtendimento desenfileirar(){ 
			NoAtendimento aux = null;
			if (estaVazia()){
				return null;
			}
			else 
				aux = this.topo;
				this.topo=topo.getProximo();
				return aux;
			}
		
	public AtendimentoEnfermaria desenfileirar2(){ 
			NoAtendimento aux = null;
			if (estaVazia()){
				return null;
			}
			else 
				aux = this.topo;
				this.topo=topo.getProximo();
				return aux.getAe();
			}
		
		
	public NoAtendimento topo(){
			return this.topo;
		}

		
	public void esvaziar(){
			this.topo = null;
		}
		
		
	public void imprimir(){
			for (NoAtendimento aux = this.topo; aux != null; aux = aux.getProximo())
				System.out.println("Imprimindo");
				
		}
	
}