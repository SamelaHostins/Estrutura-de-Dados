package arvores.testes;

import arvores.model.Arvore.ArvoreBST;
import arvores.model.Arvore.ArvoreBinaria;
import arvores.model.Arvore.NoArvoreBinaria;

public class TestandoArvoreBinaria {

    public static void main(String args[]) {
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);

        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);

        NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);

        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        arvore.setRaiz(no1);
        System.out.println(arvore.toString());
        System.out.println(arvore.pertence(6).getInfo());

        ArvoreBST<Integer> arvore2 = new ArvoreBST<Integer>();
        arvore2.inserir(50);
        arvore2.inserir(80);
        arvore2.inserir(70);
        arvore2.inserir(30);
        arvore2.inserir(35);
        System.out.println(arvore2.toString());
    }
}
