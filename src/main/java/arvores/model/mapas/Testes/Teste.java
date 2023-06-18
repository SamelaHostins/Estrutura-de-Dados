package mapas.Testes;

import mapas.MapaDispersao;

public class Teste {

    public static void main(String[] args) {

        MapaDispersao<Integer, Integer> mapa = new MapaDispersao<>(10);

        // Inserção de elementos
        System.out.println("inserir 1: " + mapa.inserir(10, 1));
        int posicaoChave1 = mapa.buscarPosicaoDoVetorPelaChave(10);
        System.out.println("Posição da chave1: " + posicaoChave1); // Saída: Posição da chave1: 0

        System.out.println("inserir 1 dnv: " + mapa.inserir(10, 1));

        System.out.println("inserir 2: " + mapa.inserir(56, 2));
        int posicaoChave2 = mapa.buscarPosicaoDoVetorPelaChave(56);
        System.out.println("Posição da chave2: " + posicaoChave2); // Saída: Posição da chave2:

        mapa.inserir(79, 3);
        int posicaoChave3 = mapa.buscarPosicaoDoVetorPelaChave(79);
        System.out.println("Posição da chave3: " + posicaoChave3); // Saída: Posição da chave3:

        mapa.inserir(102, 4);
        int posicaoChave4 = mapa.buscarPosicaoDoVetorPelaChave(40);
        System.out.println("Posição da chave4: " + posicaoChave4); // Saída: Posição da chave4:

        System.out.println("");
        System.out.println("fator de carga: " + mapa.verificarFatorCarga());

        System.out.println("");

        mapa.imprimirMapa();
        System.out.println("");

        // Busca de elementos
        System.out.println(mapa.buscar(10)); // Saída: 1

        // Remoção de elementos
        System.out.println(mapa.remover(56));
        System.out.println(mapa.buscar(20)); // Saída: null

    }
}
