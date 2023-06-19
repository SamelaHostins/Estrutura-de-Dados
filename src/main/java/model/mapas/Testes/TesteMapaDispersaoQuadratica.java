package mapas.Testes;

import mapas.MapaDispersaoQuadratica;

public class TesteMapaDispersaoQuadratica {

    public static void main(String[] args) {
        // Criando um mapa de dispersão
        MapaDispersaoQuadratica<Integer, Integer> mapa = new MapaDispersaoQuadratica<>(10);

        // Inserindo pares chave-valor no mapa
        System.out.println("inserir 10: " + mapa.inserir(10, 10));
        System.out.println("inserir 10 dnv: " + mapa.inserir(10, 10));
        System.out.println("inserir 56: " + mapa.inserir(56, 56));
        mapa.inserir(79, 79);
        mapa.inserir(102, 102);

        // Obtendo valores a partir das chaves
        System.out.println("Buscar 10: " + mapa.buscar(10)); // Saída: 10
        System.out.println("Buscar 30 (não existe): " + mapa.buscar(20)); // Saída: null
        System.out.println("");

        mapa.imprimirMapa();
        System.out.println("");

        // Atualizando valor de uma chave existente
        mapa.inserir(25, 25);

        // Removendo uma chave do mapa
        Integer valorRemovido = mapa.remover(10);

        // Verificando se a chave foi removida e obtendo o valor removido
        if (valorRemovido != null) {
            System.out.println("Valor removido: " + valorRemovido);
        } else {
            System.out.println("Chave não encontrada");
        }
        System.out.println("");
        mapa.imprimirMapa();
    }
}
