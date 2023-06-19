package mapas;

public class MapaDispersaoQuadratica<K, T> {

    private ObjetoMapa<K, T>[] tabela;
    private int capacidade;

    public MapaDispersaoQuadratica(int quantidade) {
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
        int opcao = 0;

        while (tabela[indice] != null) {
            if (tabela[indice].getChave().equals(chave)) {
                return false; // Chave já existe, inserção não realizada
            }

            opcao++;
            indice = (indice + opcao * opcao) % tabela.length; // Exploração quadrática
        }

        tabela[indice] = new ObjetoMapa<>();
        tabela[indice].setChave(chave);
        tabela[indice].setValor(valor);
        return true; // Inserção bem-sucedida
    }

    public T buscar(K chave) {
        int indice = calcularHash(chave);
        int opcao = 0;

        while (tabela[indice] != null) {
            if (tabela[indice].getChave().equals(chave)) {
                return tabela[indice].getValor();
            }
            opcao++;
            indice = (indice + opcao * opcao) % tabela.length; // Exploração quadrática
        }

        return null;
    }

    public T remover(K chave) {
        int indice = calcularHash(chave);
        int opcao = 0;
        while (tabela[indice] != null) {
            if (tabela[indice].getChave().equals(chave)) {
                T valorRemovido = tabela[indice].getValor();
                tabela[indice] = null;
                return valorRemovido;
            }
            opcao++;
            indice = (indice + opcao * opcao) % tabela.length; // Exploração quadrática
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

}
