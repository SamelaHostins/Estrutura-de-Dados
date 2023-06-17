package mapas;

public class MapaDispersaoLinear<K, T> {

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

}
