package mapas;

import java.math.BigInteger;

/*
 * ALUNA: Sâmela Hostins
 */

public class MapaDispersao<K, T> {

	private ObjetoMapa<K, T>[] tabela;

	public MapaDispersao(int quantidade) {
		BigInteger bi = BigInteger.valueOf(quantidade * 2);
		this.tabela = new ObjetoMapa[bi.nextProbablePrime().intValue()];
	}

	private int calcularHash(K chave) {
		return Math.floorMod(chave.hashCode(), tabela.length);
	}

	private int hashDuplo(K chave) {
		// passo = (chave % 7) + 1
		return ((chave.hashCode() & 0x7fffffff) % 7) + 1;
	}

	public boolean inserir(K chave, T valor) {
		int index = calcularHash(chave);

		T objeto = this.buscar(chave);
		if (tabela[index] == null) { // se posi��o estiver vazia, guarda o par<chave,valor>
			if (objeto == null) // se n�o encontrou nada, pode inserir
			{
				ObjetoMapa<K, T> om = new ObjetoMapa<K, T>();
				om.setChave(chave);
				om.setValor(valor);
				tabela[index] = om;
				return true;
			} else {
				return false;
			}
		} else { // j� possui um objeto na posi��o (colis�o)
			if (objeto == null) // se o objeto nao existe na tabela
			{
				ObjetoMapa<K, T> om = new ObjetoMapa<K, T>();
				om.setChave(chave);
				om.setValor(valor);
				tabela[this.hashDuplo(chave)] = om;
				return true;
			} else {
				return false;
			}
		}

	}

	public int buscarPosicaoDoVetorPelaChave(K chave) {
		int hash = calcularHash(chave);
		int posicao = hash;
		int passo = hashDuplo(chave);

		while (tabela[posicao] != null && !tabela[posicao].getChave().equals(chave)) {
			posicao = (posicao + passo) % tabela.length;
		}

		return posicao;
	}

	public T buscar(K chave) {
		int posicao = buscarPosicaoDoVetorPelaChave(chave);
		if (tabela[posicao] != null) {
			return tabela[posicao].getValor();
		}
		return null;
	}

	public T remover(K chave) {
		int posicao = buscarPosicaoDoVetorPelaChave(chave);
		if (tabela[posicao] != null) {
			T valorRemovido = tabela[posicao].getValor();
			tabela[posicao] = null;
			return valorRemovido;
		}
		return null; // Retorna null se o elemento não for encontrado
	}

	public void imprimirMapa() {
		for (int i = 0; i < tabela.length; i++) {
			if (tabela[i] != null) {
				System.out.println("Posição " + i + ": " + tabela[i].getChave() + " -> " + tabela[i].getValor());
			} else {
				System.out.println("Posição " + i + ": Vazio");
			}
		}
	}

	public boolean verificarFatorCarga() {
		double fatorCarga = (double) this.size() / this.tabela.length;
		if (fatorCarga == 0.5) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		int count = 0;
		for (ObjetoMapa<K, T> objeto : tabela) {
			if (objeto != null) {
				count++;
			}
		}
		return count;
	}
}