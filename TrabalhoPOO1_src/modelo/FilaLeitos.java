package modelo;

public class FilaLeitos {
	private NoLeitos primeiro;
	
	public FilaLeitos (NoLeitos primeiro) {
	super();
	this.primeiro = primeiro;
}

	public boolean estaVazia(){ //retorna se a fila está vazia
		if(this.primeiro == null){
			return true;
		}
		return false;
	}
	
	public int tamanho(){//retorna o tamanho da fila
		int cont = 0;
		for(NoLeitos a = this.primeiro; a != null; a=a.getProximo()){
			cont++;
		}
		return cont;
	}
	
	public void enfileirar(int valor){ //insere o elemento valor no final
		if(estaVazia()){
			this.primeiro = new NoLeitos(valor, primeiro);
		}else {
			NoLeitos novoNo = new NoLeitos(valor);
			NoLeitos aux = this.primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoNo);
		}
	}
				
	public NoLeitos desinfileirar(){ //remove e retorna o elemento do início da fila, mas retorna null se a fila estiver vazia
		if (estaVazia()){
			return null;
		}
		else this.primeiro=primeiro.getProximo();
			return this.primeiro;
		}
	
	public NoLeitos topo(){ // retorna, mas não remove, o elemento do topo da fila, retorna null se a fila estiver vazia
		if (estaVazia()){
			return null;
		}
		else 
			return this.primeiro;
		}
	
	public void esvaziar(){ //para esvaziar a fila
		this.primeiro = null;
	} 
	
}