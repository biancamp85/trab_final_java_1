package modelo;

public class ListaAtendimentoEncerrado {
	private NoAtendimento primeiro;
	private NoAtendimento ultima;
	private int totalElementos;
	
	public ListaAtendimentoEncerrado() {
		this.primeiro = null;
	}
	
	public void adicionarInicio(AtendimentoEnfermaria ae){ 
		NoAtendimento novo = new NoAtendimento(ae, this.primeiro);
		this.primeiro = novo;
	}
	
	public NoAtendimento topo()
	{
		return this.primeiro;
	}

	
	public boolean estaVazia() {
		if (this.primeiro == null) {
			return true;
		}
		return false;
	}
	
	public void adicionarIni(AtendimentoEnfermaria ae) {
		NoAtendimento novo = new NoAtendimento(ae, this.primeiro);
		this.primeiro = novo;

		if (this.totalElementos == 0) {
			this.ultima = this.primeiro;
		}
		this.totalElementos++;
	}

		
	private NoAtendimento pegaPosicao(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			System.out.println("Posição não existe");
		}

		NoAtendimento atual = primeiro;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	public void adicionaEmPosi(int posicao, AtendimentoEnfermaria ae) {
		if (posicao == 0) {
			this.adicionarIni(ae);
		} else if (posicao == this.totalElementos) {
			this.adicionaEmPosi(posicao, ae);
		} else {
			NoAtendimento anterior = this.pegaPosicao(posicao - 1);
			NoAtendimento novo = new NoAtendimento(ae);
			anterior.setProximo(novo);
			this.totalElementos++;
		}
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalElementos;
	}

	

	public NoAtendimento buscar(String cpf) {
		for (NoAtendimento aux = primeiro; aux != null; aux = aux.getProximo()) {
			if (aux.getAe().getP().getCpf() == cpf) {
				return aux;
			}
		}
		return null;

	}

	public void addInEnd(AtendimentoEnfermaria ae) {
		if (estaVazia()) {
			this.primeiro = new NoAtendimento(ae);
		} else {
			NoAtendimento novoNodo = new NoAtendimento(ae);
			NoAtendimento aux = this.primeiro;
			while (aux.getProximo() != null) {
				aux = aux.getProximo();
			}
			aux.setProximo(novoNodo);
		}
	}

	public void alterarNome(String nome, String novoNome) {
		NoAtendimento aux = buscar(nome);
		if (aux != null) {
			aux.getAe().getP().setNome(novoNome);
		}
	}
 //COLOCAR TIPO SANGUINEO
	public void print() {
		NoAtendimento auxiliar;
		for (auxiliar = primeiro; auxiliar != null; auxiliar = auxiliar.getProximo()) {
			
			System.out.println("Nome: " +auxiliar.getAe().getP().getNome());
			System.out.println("CPF: " + auxiliar.getAe().getP().getCpf());
			System.out.println("Data de nascimento: " + auxiliar.getAe().getP().getDataNascimento());
			System.out.println("Hora de chegada: " + auxiliar.getAe().getHoraChegada());
			System.out.println("Data de chegada: " + auxiliar.getAe().getDataChegada());
			System.out.println("Hora de saída: " + auxiliar.getAe().getHoraSaida());
			System.out.println("Data de saída: " + auxiliar.getAe().getDataSaida() );
			
		}
	}

	public void removeNome(String removeCpf) {
		NoAtendimento noAnt = null;
		NoAtendimento noTemp = primeiro;
		

		if (primeiro.getAe().getP().getCpf() == removeCpf) {
			primeiro = primeiro.getProximo();
		} else {
			while (noTemp != null && noTemp.getAe().getP().getNome() != removeCpf) {
				noAnt = noTemp;
				noTemp = noTemp.getProximo();
			}

			if (noTemp != null) {
				noAnt.getProximo = noTemp.getProximo;
			}
			NoAtendimento ultimo = null;
			if (noTemp == ultimo) {
				ultimo = noAnt;
			}
		}
	}

	public void removeDaPosicao(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			System.out.println("Posição não existe");
		}

		if (posicao == 0) {
			if (!this.posicaoOcupada(0)) {
				throw new IllegalArgumentException("Posição não existe");
			}

			this.primeiro = this.primeiro.getProximo();
			this.totalElementos--;

			if (this.totalElementos == 0) {
				this.ultima = null;
			}
		} else if (posicao == this.totalElementos - 1) {
			if (!this.posicaoOcupada(this.totalElementos - 1)) {
				System.out.println("Posição não existe");
			}
			if (this.totalElementos == 1) {
				if (!this.posicaoOcupada(posicao)) {
					System.out.println("Posição não existe");
				}

				if (posicao == 0) {
					if (!this.posicaoOcupada(0)) {
						throw new IllegalArgumentException("Posição não existe");
					}

					this.primeiro = this.primeiro.getProximo();
					this.totalElementos--;

					if (this.totalElementos == 0) {
						this.ultima = null;
					}
				} else {
					NoAtendimento penultima = this.ultima.getAnterior();
					penultima.setProximo(null);
					this.ultima = penultima;
					this.totalElementos--;
				}
			} else {
				NoAtendimento anterior = this.pegaPosicao(posicao - 1);
				NoAtendimento atual = anterior.getProximo();
				NoAtendimento proxima = atual.getProximo();

				anterior.setProximo(proxima);
				proxima.setAnterior(anterior);

				this.totalElementos--;
			}
		}
	}
}