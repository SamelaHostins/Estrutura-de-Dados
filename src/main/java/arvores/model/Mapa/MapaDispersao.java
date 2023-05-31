package arvores.model.Mapa;
// lembrar de tirar os pacotes

//Não utilize pacotes, ou seja, deixe todas as suas classes no pacote default

public class MapaDispersao<K, T> {

    private ListaEncadeada<K, T>[] tabela;
    private int tamanhoMapa;

    public MapaDispersao(int quantidade) {
        this.tabela = new ListaEncadeada[(this.nextPrime(quantidade * 2))];
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

    // precisa garantir que o valor será positivo
    private int calcularHash(K chave) {
        return Math.floorMod(chave.hashCode(), tabela.length);
    }

    public boolean inserir(K chave, T info) {
        // para calcular aonde o elemento deve ser inserido
        int indice = calcularHash(chave);

        // cria a lista (endereçamento separado)
        if (tabela[indice] == null) {
            tabela[indice] = new ListaEncadeada<K, T>();
        }

        // para verificar se já existe algum elemento com a mesma chave
        if (tabela[indice].buscarPorChave(chave) == -1) {
            tabela[indice].inserir(chave, info);
            tamanhoMapa++;
            return true;
        }

        return false;
    }

    public T remover(K chave) {
        int indice = this.calcularHash(chave);

        if (this.tabela[indice] != null) {
            int posicaoObjeto = this.tabela[indice].buscarPorChave(chave);

            if (posicaoObjeto != -1) {
                this.tamanhoMapa--;
                return this.tabela[indice].retirarPorChave(chave).getInfo();
            }
        }
        return null;
    }

    public T buscar(K chave) {
        int indice = this.calcularHash(chave);

        if (this.tabela[indice] != null) {
            return this.tabela[indice].pegarPorChave(chave).getInfo();
        }

        return null;
    }

    public int quantosElementos() {
        return this.tamanhoMapa;
    }

    public boolean estaVazia() {
        return tabela.length == 0;
    }
}