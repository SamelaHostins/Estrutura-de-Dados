package mapas.Testes;

import mapas.MapaDispersaoLinear;

public class TesteMapaDispersaoLinear {

    public static void main(String[] args) {
        // Criando um mapa de dispersão
        MapaDispersaoLinear<Integer, Integer> mapa = new MapaDispersaoLinear<>(10);

        MapaDispersaoLinear<Integer, Integer> mapaNovo = new MapaDispersaoLinear<>(5);

        // Inserindo pares chave-valor no mapa
        System.out.println("inserir 10: " + mapa.inserir(10, 1));
        System.out.println("inserir 10 dnv: " + mapa.inserir(10, 10));
        System.out.println("inserir 56: " + mapa.inserir(56, 56));
        mapa.inserir(79, 1);
        mapa.inserir(102, 102);
        System.out.println("");
        // mapa.imprimirMapa();

        // mapa.alterarChave(56, 2);
        // System.out.println("");
        // System.out.println("--MAPA PÓS ALTERAÇÃO DE CHAVE 56 PARA 2--");
        // mapa.imprimirMapa();

        // mapa.alterarValor(2, 40);
        // System.out.println("");
        // System.out.println("--MAPA PÓS ALTERAÇÃO DE VALOR DA CHAVE 2--");
        // mapa.imprimirMapa();
        // System.out.println("");
        // System.out.println("Elementos pares: " + mapa.buscarPosicoesElementosPares());
        // System.out.println("");

        // System.out.println(mapa.encontrarQuantidadeElementosRepetidos(1));
        // mapa.recalcularPosicoes(mapaNovo);
        // System.out.println("");
        // System.out.println("-----MAPA NOVO ---");
        // System.out.println("");
        // mapaNovo.imprimirMapa();

        // System.out.println(mapa.encontrarMaiorValor());
        // System.out.println(mapa.encontrarMenorValor());

        mapa.separarElementos();

        // Obtendo valores a partir das chaves
        // System.out.println("Buscar 10: " + mapa.buscar(10)); // Saída: 10
        // System.out.println("Buscar 30 (não existe): " + mapa.buscar(20)); // Saída:
        // null
        // System.out.println("");

        // mapa.imprimirMapa();
        // System.out.println("");

        // // Atualizando valor de uma chave existente
        // mapa.inserir(25, 25);

        // // Removendo uma chave do mapa
        // Integer valorRemovido = mapa.remover(10);

        // // Verificando se a chave foi removida e obtendo o valor removido
        // if (valorRemovido != null) {
        // System.out.println("Valor removido: " + valorRemovido);
        // } else {
        // System.out.println("Chave não encontrada");
        // }
        // System.out.println("");
        // mapa.imprimirMapa();
    }
}
