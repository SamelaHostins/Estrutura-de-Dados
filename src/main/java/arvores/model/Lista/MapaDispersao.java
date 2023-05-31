package arvores.model.Lista;

public class MapaDispersao<K, T> {
    private ListaEncadeada<MapaDispersaoItem<K, T>>[] tabela;

    public MapaDispersao(int quantidade) {
        this.tabela = new ListaEncadeada[quantidade * 2];
    }

    private int calcularHash(K chave) {
        return Math.floorMod(chave.hashCode(), tabela.length);
    }

    public boolean inserir(K chave, T dado) {
        int hash = calcularHash(chave);
        ListaEncadeada<MapaDispersaoItem<K, T>> lista = tabela[hash];
        MapaDispersaoItem<K, T> item = null;

        if (lista == null) {
            lista = new ListaEncadeada<>();
        }

        item = new MapaDispersaoItem<K, T>(chave, dado);
        int indice = lista.buscar(item);

        if (indice > -1) {
            return false;
        }

        lista.inserir(item);
        tabela[hash] = lista;

        return true;
    }

    public T remover(K chave) {
        int hash = calcularHash(chave);
        ListaEncadeada<MapaDispersaoItem<K, T>> lista = tabela[hash];
        MapaDispersaoItem<K, T> item = null;
        if (lista != null && !lista.estaVazia()) {
            for (int i = 0; i < lista.getTamanho(); i++) {
                MapaDispersaoItem<K, T> mItem = lista.pegar(i);
                if (mItem != null && mItem.getChave().equals(chave)) {
                    item = mItem;
                    break;
                }
            }
            lista.retirar(item);
            if (lista.estaVazia()) {
                tabela[hash] = null;
            }
        }
        return item == null ? null : item.getValor();
    }

    public T buscar(K chave) {
        ListaEncadeada<MapaDispersaoItem<K, T>> lista = tabela[calcularHash(chave)];
        if (lista != null && !lista.estaVazia()) {
            for (int i = 0; i < lista.getTamanho(); i++) {
                MapaDispersaoItem<K, T> mItem = lista.pegar(i);
                if (mItem.getChave().equals(chave)) {
                    return mItem.getValor();
                }
            }
        }
        return null;
    }

    public int quantosElementos() {
        int elementos = 0;
        if (!estaVazia()) {
            for (int i = 0; i < tabela.length; i++) {
                ListaEncadeada<MapaDispersaoItem<K, T>> lista = tabela[i];
                if (lista != null) {
                    for (int k = 0; k < lista.getTamanho(); k++) {
                        if (lista.pegar(k) != null) {
                            elementos++;
                        }
                    }
                }
            }
        }
        return elementos;
    }

    public boolean estaVazia() {
        return tabela.length == 0;
    }
}

class MapaDispersaoItem<K, T> {
    private K chave;
    private T valor;

    public MapaDispersaoItem(K chave, T valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public T getValor() {
        return valor;
    }

}