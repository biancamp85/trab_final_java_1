package modelo;

public class ListaPacientes {
	
		private NoPaciente primeiro;
		private int totalElementos;
		private NoPaciente ultima;

		public ListaPacientes() {
			this.primeiro = null;
		}

		public void addInicio(Paciente p) {
			NoPaciente novo = new NoPaciente(p, this.primeiro);
			this.primeiro = novo;

			if (this.totalElementos == 0) {
				this.ultima = this.primeiro;
			}
			this.totalElementos++;
		}

		private boolean posOcupada(int posicao) {
			return posicao >= 0 && posicao < this.totalElementos;
		}
	
		private NoPaciente pegaPosicao(int posicao) {
			if (!this.posOcupada(posicao)) {
				System.out.println("Posição não existe");
			}

			NoPaciente atual = primeiro;
			for (int i = 0; i < posicao; i++) {
				atual = atual.getProximo();
			}
			return atual;
		}

		public void addEmPos(int posicao, Paciente p) {
			if (posicao == 0) {
				this.addInicio(p);
			} else if (posicao == this.totalElementos) { // No fim.
				this.addEmPos(posicao, p);
			} else {
				NoPaciente anterior = this.pegaPosicao(posicao - 1);
				NoPaciente novo = new NoPaciente(p);
				anterior.setProximo(novo);
				this.totalElementos++;
			}
		}

		public boolean estaVazia() {
			if (this.primeiro == null) {
				return true;
			}
			return false;
		}

		public Paciente busca(String cpf)
		{
			NoPaciente novo = null;
			for (novo = this.primeiro; novo != null; novo = novo.getProximo()){
				if(novo.getP().getCpf().equals(cpf))
				{
					return novo.getP();
				}
			}
			
			return null;
		}
		
		public NoPaciente getPrimeiro() {
			return primeiro;
		}

		public void setPrimeiro(NoPaciente primeiro) {
			this.primeiro = primeiro;
		}

		public NoPaciente buscarNo(String cpf) {
			NoPaciente aux = null;
			for (aux = primeiro; aux != null; aux = aux.getProximo()) {
				if (aux.getP().getCpf().equals(cpf)) {
					return aux;
				}
			}
			return null;

		}
		
		public void addFim(Paciente p) {
			if (estaVazia()) {
				this.primeiro = new NoPaciente(p);
			} else {
				NoPaciente novoNodo = new NoPaciente(p);
				NoPaciente aux = this.primeiro;
				while (aux.getProximo() != null) {
					aux = aux.getProximo();
				}
				aux.setProximo(novoNodo);
			}
		}

		public void alterarNome(String cpf, String novoNome) {
			NoPaciente aux = buscarNo(cpf);
			if (aux != null) {
				aux.getP().setNome(novoNome);
			}
		}

		public void print() {
			NoPaciente auxiliar;
			for (auxiliar = primeiro; auxiliar != null; auxiliar = auxiliar.getProximo()) {
				System.out.println("\nNome: " +auxiliar.getP().getNome());
				System.out.println("\nCPF: " +auxiliar.getP().getCpf());
				System.out.println("\nData Nascimento: " +auxiliar.getP().getDataNascimento());
				System.out.println("\nEndereço: "+auxiliar.getP().getEndereco());
				System.out.println("\nTipo Sanguíneo: "+auxiliar.getP().getTipoSangue());
				System.out.println("\nNome da mãe: "+auxiliar.getP().getNomemae());
				System.out.println("\nNome do pai: "+auxiliar.getP().getNomepai());	
			}
		}

		public void removeNome(String removeCPF) {
			NoPaciente noTemp = primeiro;
			NoPaciente noAnt = null;

			if (primeiro.getP().getCpf() == removeCPF) {
				primeiro = primeiro.getProximo();
			} else {
				while (noTemp != null && noTemp.getP().getNome() != removeCPF) {
					noAnt = noTemp;
					noTemp = noTemp.getProximo();
				}

				if (noTemp != null) {
					noAnt.getProximo = noTemp.getProximo;
				}
				NoPaciente ultimo = null;
				if (noTemp == ultimo) {
					ultimo = noAnt;
				}
			}
		}

		public void removeDaPosi(int posicao) {
			if (!this.posOcupada(posicao)) {
				System.out.println("Posição não existe");
			}

			if (posicao == 0) {
				if (!this.posOcupada(0)) {
					throw new IllegalArgumentException("Posição não existe");
				}

				this.primeiro = this.primeiro.getProximo();
				this.totalElementos--;

				if (this.totalElementos == 0) {
					this.ultima = null;
				}
			} else if (posicao == this.totalElementos - 1) {
				if (!this.posOcupada(this.totalElementos - 1)) {
					System.out.println("Posição não existe");
				}
				if (this.totalElementos == 1) {
					if (!this.posOcupada(posicao)) {
						System.out.println("Posição não existe");
					}

					if (posicao == 0) {
						if (!this.posOcupada(0)) {
							throw new IllegalArgumentException("Posição não existe");
						}

						this.primeiro = this.primeiro.getProximo();
						this.totalElementos--;

						if (this.totalElementos == 0) {
							this.ultima = null;
						}
					} else {
						NoPaciente penultima = this.ultima.getAnterior();
						penultima.setProximo(null);
						this.ultima = penultima;
						this.totalElementos--;
					}
				} else {
					NoPaciente anterior = this.pegaPosicao(posicao - 1);
					NoPaciente atual = anterior.getProximo();
					NoPaciente proxima = atual.getProximo();

					anterior.setProximo(proxima);
					proxima.setAnterior(anterior);

					this.totalElementos--;
				}
			}
		}
	}
