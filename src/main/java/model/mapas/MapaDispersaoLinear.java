package mapas;

import java.util.ArrayList;
import java.util.List;

public class MapaDispersaoLinear<K, T extends Comparable<T>> {

    private ObjetoMapa<K, T>[] tabela;
    private int capacidade;

    public MapaDispersaoLinear(int quantidade) {
        this.capacidade = (this.nextPrime(quantidade * 2));
        this.tabela = new ObjetoMapa[this.capacidade];
    }

    public int tamanhoMapa() {
        return capacidade;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int nextPrime(int num) {
        num++;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    private int calcularHash(K chave) {
        return Math.floorMod(chave.hashCode(), tabela.length);
    }

    public boolean inserir(K chave, T valor) {
        int indice = calcularHash(chave);

        while (tabela[indice] != null) {
            if (tabela[indice].getChave().equals(chave)) {
                return false; // Chave já existe, inserção não realizada
            }

            indice = (indice + 1) % tabela.length; // Exploração linear
        }

        tabela[indice] = new ObjetoMapa<>();
        tabela[indice].setChave(chave);
        tabela[indice].setValor(valor);
        return true; // Inserção bem-sucedida
    }

    public T buscar(K chave) {
        int indice = calcularHash(chave);

        while (tabela[indice] != null) {
            if (tabela[indice].getChave().equals(chave)) {
                return tabela[indice].getValor();
            }
            indice = (indice + 1) % tabela.length;
        }

        return null;
    }

    public T remover(K chave) {
        int indice = calcularHash(chave);

        while (tabela[indice] != null) {
            if (tabela[indice].getChave().equals(chave)) {
                T valorRemovido = tabela[indice].getValor();
                tabela[indice] = null;
                return valorRemovido;
            }
            indice = (indice + 1) % tabela.length;
        }
        return null;
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

    public boolean alterarChave(K chaveAntiga, K novaChave) {
        // Verifica se a chave antiga existe no mapa
        T valor = buscar(chaveAntiga);
        if (valor == null) {
            return false; // A chave antiga não existe no mapa, alteração não realizada
        }

        // Verifica se a nova chave já existe no mapa
        T valorNovaChave = buscar(novaChave);
        if (valorNovaChave != null) {
            return false; // A nova chave já existe no mapa, alteração não realizada
        }

        // Remove o elemento com a chave antiga
        remover(chaveAntiga);

        // Insere o elemento com a nova chave
        inserir(novaChave, valor);
        return true; // Alteração bem-sucedida
    }

    public boolean alterarValor(K chave, T novoValor) {
        int indice = calcularHash(chave);

        while (tabela[indice] != null) {
            if (tabela[indice].getChave().equals(chave)) {
                tabela[indice].setValor(novoValor);
                return true; // Alteração bem-sucedida
            }
            indice = (indice + 1) % tabela.length;
        }

        return false; // Chave não encontrada, alteração não realizada
    }

    public int encontrarQuantidadeElementosRepetidos(T valor) {
        int quantidade = 0;

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null && tabela[i].getValor().equals(valor)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public void recalcularPosicoes(MapaDispersaoLinear<K, T> novoMapa) {
        int capacidadeOriginal = this.tamanhoMapa();
        for (int i = 0; i < capacidadeOriginal; i++) {
            if (this.tabela[i] != null) {
                K chave = this.tabela[i].getChave();
                T valor = this.tabela[i].getValor();
                novoMapa.inserir(chave, valor);
            }
        }
    }

    public T encontrarMaiorValor() {
        T maiorValor = null;

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null) {
                T valor = tabela[i].getValor();
                if (maiorValor == null || valor.compareTo(maiorValor) > 0) {
                    maiorValor = valor;
                }
            }
        }

        return maiorValor;
    }

    public T encontrarMenorValor() {
        T menorValor = null;

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null) {
                T valor = tabela[i].getValor();
                if (menorValor == null || valor.compareTo(menorValor) < 0) {
                    menorValor = valor;
                }
            }
        }

        return menorValor;
    }

    public List<Integer> buscarPosicoesElementosPares() {
        List<Integer> posicoes = new ArrayList<>();

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null) {
                T valor = tabela[i].getValor();
                if (valor instanceof Integer && ((Integer) valor) % 2 == 0) {
                    posicoes.add(i);
                }
            }
        }

        return posicoes;
    }

    public List<Integer> buscarPosicoesElementosImpares() {
        List<Integer> posicoes = new ArrayList<>();

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null) {
                T valor = tabela[i].getValor();
                if (valor instanceof Integer && ((Integer) valor) % 2 != 0) {
                    posicoes.add(i);
                }
            }
        }

        return posicoes;
    }

    public MapaDispersaoLinear<K, T> separarElementos() {
        MapaDispersaoLinear<K, T> mapaPares = new MapaDispersaoLinear<>(capacidade);
        MapaDispersaoLinear<K, T> mapaImpares = new MapaDispersaoLinear<>(capacidade);

        for (int i = 0; i < tabela.length; i++) {
            if (tabela[i] != null) {
                T valor = tabela[i].getValor();
                if (valor instanceof Integer) {
                    if (((Integer) valor) % 2 == 0) {
                        mapaPares.inserir(tabela[i].getChave(), valor);
                    } else {
                        mapaImpares.inserir(tabela[i].getChave(), valor);
                    }
                }
            }
        }

        System.out.println("Mapa com elementos pares:");
        mapaPares.imprimirMapa();

        System.out.println("Mapa com elementos ímpares:");
        mapaImpares.imprimirMapa();

        return mapaPares;
    }
}
