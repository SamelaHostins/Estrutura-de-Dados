package mapas;

import java.math.BigInteger;
import java.util.Arrays;

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
		int hash = chave.hashCode();
		int passo = 1 + (hash % (tabela.length - 2));
		return passo;
	}

	public boolean inserir(K chave, T valor) {
		int posicao = buscarPosicaoDoVetorPelaChave(chave);
		if (tabela[posicao] != null) {
			return false;
		}
		ObjetoMapa<K, T> novoObjeto = new ObjetoMapa<>();
		novoObjeto.setChave(chave);
		novoObjeto.setValor(valor);
		tabela[posicao] = novoObjeto;
		return true;
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
}