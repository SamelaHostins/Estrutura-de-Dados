package testes;

import model.Arvore.ArvoreBST;
import model.Arvore.ArvoreBinaria;
import model.Arvore.NoArvoreBinaria;

public class TestandoArvoreBinaria {

    public static void main(String args[]) {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
        // NoArvoreBinaria<Integer> no8 = new NoArvoreBinaria<>(8);

        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7, null, null);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, null, null);

        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no7, no6);

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.toString());
        System.out.println(arvore.pertence(6).getInfo());
        int altura = arvore.getAlturaArvoreBinaria();
        System.out.println(" A altura da árvore binária é: " + altura);
        boolean isCheia = arvore.arvoreEstaCheia();
        System.out.println(" A arvore está cheia: " + isCheia);

        ArvoreBST<Integer> arvore2 = new ArvoreBST<Integer>();
        arvore2.inserir(50);
        arvore2.inserir(80);
        arvore2.inserir(70);
        arvore2.inserir(30);
        arvore2.inserir(35);
        System.out.println(arvore2.toString());
    }
}
