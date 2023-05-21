package arvores.testes;

import arvores.model.Arvore.Arvore;
import arvores.model.Arvore.NoArvore;

public class TestandoArvores {

    public static void main(String args[]) {
        // NoArvore<String> nAA = new NoArvore<String>("AA");
        // NoArvore<String> nBB = new NoArvore<String>("BB");
        // NoArvore<String> nCC = new NoArvore<String>("CC");
        // NoArvore<String> nDD = new NoArvore<String>("DD");
        // NoArvore<String> nEE = new NoArvore<String>("EE");
        // NoArvore<String> nM = new NoArvore<String>("M");
        // nBB.inserirFilho(nAA);
        // nCC.inserirFilho(nBB);
        // nDD.inserirFilho(nCC);
        // nEE.inserirFilho(nDD);
        // nM.inserirFilho(nEE);

        // NoArvore<String> nA = new NoArvore<String>("A");
        // NoArvore<String> nB = new NoArvore<String>("B");
        // NoArvore<String> nC = new NoArvore<String>("C");
        // NoArvore<String> nD = new NoArvore<String>("D");

        // nB.inserirFilho(nA);
        // nC.inserirFilho(nB);
        // nD.inserirFilho(nC);
        // nM.inserirFilho(nD);

        // NoArvore<String> nXX = new NoArvore<String>("XX");
        // nM.inserirFilho(nXX);

        // NoArvore<String> nR = new NoArvore<String>("R");
        // NoArvore<String> nH = new NoArvore<String>("H");
        // nH.inserirFilho(nR);
        // nH.inserirFilho(nM);

        // Arvore<String> a = new Arvore<>();
        // a.setRaiz(nH);
        // a.pertence("EE");
        // int nivel = a.getNivel("CC");
        // System.out.println(" O nível de CC deve ser 4: " + nivel);
        // // NoArvore<String> pai = a.getPai("XX");
        // // System.out.println(" O pai de XX, deve ser M: " + pai.getInfo());
        // int m = a.menorAltura();
        // System.out.println(" A ALTURA DA MENOR SUBARVORE " + m);
        // boolean isBalanceada = a.isBalanceada();
        // System.out.println("Não deve estar balanceada: " + isBalanceada);
        // int b = a.getAltura();
        // System.out.println(" A altura da árvore deve ser 6: " + b);
        // System.out.println("");

        // Arvore<String> a2 = new Arvore<>();
        // int b2 = a2.getAltura();
        // boolean r2 = a2.isBalanceada();
        // System.out.println("Deve estar balanceada: " + r2);
        // System.out.println(" A altura da árvore deve ser -1: " + b2);
        // System.out.println("");

        // Arvore<String> a3 = new Arvore<>();
        // NoArvore<String> nS = new NoArvore<String>("M");
        // a3.setRaiz(nS);
        // boolean r3 = a3.isBalanceada();
        // System.out.println("Deve estar balanceada: " + r3);
        // int b3 = a3.getAltura();
        // System.out.println(" A altura da árvore deve ser zero: " + b3);
        // System.out.println("");

        // Arvore<String> a4 = new Arvore<>();
        // NoArvore<String> nZ = new NoArvore<String>("Z");
        // NoArvore<String> nU = new NoArvore<String>("U");
        // NoArvore<String> nY = new NoArvore<String>("Y");
        // NoArvore<String> nX = new NoArvore<String>("X");
        // NoArvore<String> nHH = new NoArvore<String>("HH");
        // NoArvore<String> nJ = new NoArvore<String>("J");
        // a4.setRaiz(nZ);
        // nZ.inserirFilho(nU);
        // nZ.inserirFilho(nY);
        // nY.inserirFilho(nX);
        // nY.inserirFilho(nHH);
        // nHH.inserirFilho(nJ);
        // int b4 = a4.getAltura();
        // System.out.println(" A altura da árvore deve ser 3: " + b4);

        Arvore<Integer> a5 = new Arvore<>();
        NoArvore<Integer> n1 = new NoArvore<Integer>(1);
        NoArvore<Integer> n2 = new NoArvore<Integer>(2);
        NoArvore<Integer> n3 = new NoArvore<Integer>(3);
        NoArvore<Integer> n4 = new NoArvore<Integer>(4);
        NoArvore<Integer> n5 = new NoArvore<Integer>(5);
        NoArvore<Integer> n6 = new NoArvore<Integer>(6);
        NoArvore<Integer> n7 = new NoArvore<Integer>(7);
        NoArvore<Integer> n8 = new NoArvore<Integer>(8);
        NoArvore<Integer> n9 = new NoArvore<Integer>(9);
        NoArvore<Integer> n10 = new NoArvore<Integer>(10);
        a5.setRaiz(n1);
        n1.inserirFilho(n2);
        n1.inserirFilho(n6);
        n1.inserirFilho(n7);
        n2.inserirFilho(n3);
        n3.inserirFilho(n4);
        n3.inserirFilho(n4);
        n7.inserirFilho(n8);
        n7.inserirFilho(n9);
        n9.inserirFilho(n10);
        NoArvore<Integer> no2 = a5.pertence(12);
        System.out.println(no2);
        // NoArvore<Integer> no = a5.pertence(2);
        // System.out.println(no.getInfo());
        // a5.caminho(5);
        // int grauArvore = a5.getGrau();
        // System.out.println("O grau da árvore é: " + grauArvore);
    }
}
