package arvores.testes;

import arvores.model.Arvore.Arvore;
import arvores.model.Arvore.NoArvore;

public class TestandoArvores {

    public static void main(String args[]) {
//        NoArvore<String> nAA = new NoArvore<String>("AA");
//        NoArvore<String> nBB = new NoArvore<String>("BB");
//        NoArvore<String> nCC = new NoArvore<String>("CC");
//        NoArvore<String> nDD = new NoArvore<String>("DD");
//        NoArvore<String> nEE = new NoArvore<String>("EE");
//        NoArvore<String> nM = new NoArvore<String>("M");
//        nBB.inserirFilho(nAA);
//        nCC.inserirFilho(nBB);
//        nDD.inserirFilho(nCC);
//        nEE.inserirFilho(nDD);
//        nM.inserirFilho(nEE);
//
//        NoArvore<String> nA = new NoArvore<String>("A");
//        NoArvore<String> nB = new NoArvore<String>("B");
//        NoArvore<String> nC = new NoArvore<String>("C");
//        NoArvore<String> nD = new NoArvore<String>("D");
//
//        nB.inserirFilho(nA);
//        nC.inserirFilho(nB);
//        nD.inserirFilho(nC);
//        nM.inserirFilho(nD);
//
//        NoArvore<String> nXX = new NoArvore<String>("XX");
//        nM.inserirFilho(nXX);
//
//        NoArvore<String> nR = new NoArvore<String>("R");
//        NoArvore<String> nH = new NoArvore<String>("H");
//        nH.inserirFilho(nR);
//        nH.inserirFilho(nM);
//
//        Arvore<String> a = new Arvore<>();
//        a.setRaiz(nH);
//        a.pertence("EE");
//        int nivel = a.getNivel("CC");
//        System.out.println(" O nível de CC deve ser 4: " + nivel);
//        // NoArvore<String> pai = a.getPai("XX");
//        // System.out.println(" O pai de XX, deve ser M: " + pai.getInfo());
//        int m = a.menorAltura();
//        System.out.println(" A ALTURA DA MENOR SUBARVORE " + m);
//        boolean isBalanceada = a.isBalanceada();
//        System.out.println("Não deve estar balanceada: " + isBalanceada);
//        int b = a.getAltura();
//        System.out.println(" A altura da árvore deve ser 6: " + b);
//        System.out.println("");
//
//        Arvore<String> a2 = new Arvore<>();
//        int b2 = a2.getAltura();
//        boolean r2 = a2.isBalanceada();
//        System.out.println("Deve estar balanceada: " + r2);
//        System.out.println(" A altura da árvore deve ser -1: " + b2);
//        System.out.println("");
//
//        Arvore<String> a3 = new Arvore<>();
//        NoArvore<String> nS = new NoArvore<String>("M");
//        a3.setRaiz(nS);
//        boolean r3 = a3.isBalanceada();
//        System.out.println("Deve estar balanceada: " + r3);
//        int b3 = a3.getAltura();
//        System.out.println(" A altura da árvore deve ser zero: " + b3);
//        System.out.println("");
//
//        Arvore<String> a4 = new Arvore<>();
//        NoArvore<String> nZ = new NoArvore<String>("Z");
//        NoArvore<String> nU = new NoArvore<String>("U");
//        NoArvore<String> nY = new NoArvore<String>("Y");
//        NoArvore<String> nX = new NoArvore<String>("X");
//        NoArvore<String> nHH = new NoArvore<String>("HH");
//        NoArvore<String> nJ = new NoArvore<String>("J");
//        a4.setRaiz(nZ);
//        nZ.inserirFilho(nU);
//        nZ.inserirFilho(nY);
//        nY.inserirFilho(nX);
//        nY.inserirFilho(nHH);
//        nHH.inserirFilho(nJ);
//        int b4 = a4.getAltura();
//        System.out.println(" A altura da árvore deve ser 3: " + b4);

// ---------------------------------------------------------------------
//        NoArvore<Integer> n22 = new NoArvore<>(22);
//        NoArvore<Integer> n21 = new NoArvore<>(21);
//        NoArvore<Integer> n20 = new NoArvore<>(20);
//        NoArvore<Integer> n19 = new NoArvore<>(19);
//        NoArvore<Integer> n18 = new NoArvore<>(18);
//        NoArvore<Integer> n17 = new NoArvore<>(17);
//        NoArvore<Integer> n16 = new NoArvore<>(16);
//        NoArvore<Integer> n15 = new NoArvore<>(15);
//        NoArvore<Integer> n14 = new NoArvore<>(14);
//        NoArvore<Integer> n13 = new NoArvore<>(13);
//        NoArvore<Integer> n12 = new NoArvore<>(12);
//        NoArvore<Integer> n11 = new NoArvore<>(11);
//        NoArvore<Integer> n10 = new NoArvore<>(10);
//        NoArvore<Integer> n9 = new NoArvore<>(9);
//        NoArvore<Integer> n8 = new NoArvore<>(8);
//        NoArvore<Integer> n7 = new NoArvore<>(7);
//        NoArvore<Integer> n6 = new NoArvore<>(6);
//        NoArvore<Integer> n5 = new NoArvore<>(5);
//        NoArvore<Integer> n4 = new NoArvore<>(4);
//        NoArvore<Integer> n3 = new NoArvore<>(3);
//        NoArvore<Integer> n2 = new NoArvore<>(2);
//        NoArvore<Integer> n1 = new NoArvore<>(1);
//
//        // raiz tem 2 filhos
//        n1.inserirFilho(n3);
//        n1.inserirFilho(n2);
//
//        n2.inserirFilho(n6);
//        n2.inserirFilho(n5);
//        n2.inserirFilho(n4);
//
//        n5.inserirFilho(n8);
//        n5.inserirFilho(n9);
//
//        n6.inserirFilho(n7);
//
//        n3.inserirFilho(n10);
//        n3.inserirFilho(n11);
//        n3.inserirFilho(n12);
//        n3.inserirFilho(n13);
//
//        n12.inserirFilho(n14);
//        n12.inserirFilho(n15);
//
//        n10.inserirFilho(n16);
//        n10.inserirFilho(n17);
//        n10.inserirFilho(n18);
//
//        n17.inserirFilho(n19);
//
//        n19.inserirFilho(n21);
//        n19.inserirFilho(n20);
//
//        n21.inserirFilho(n22);
//
//        Arvore<Integer> a = new Arvore<>();
//        a.setRaiz(n1);
//
//        // get altura
//        System.out.println("Altura deve ser 6, resposta: " + a.getAltura());
//        System.out.println("Nivel do 16 deve ser 3: " + a.getNivelV2(16));
//        System.out.println("Nivel do 20 deve ser 5: " + a.getNivelV2(20));
//        System.out.println("Não é balanceada: " + a.isBalanceada());


                NoArvore<String> nAA = new NoArvore<String>("AA");
        NoArvore<String> nBB = new NoArvore<String>("BB");
        NoArvore<String> nCC = new NoArvore<String>("CC");
        NoArvore<String> nDD = new NoArvore<String>("DD");
        NoArvore<String> nEE = new NoArvore<String>("EE");
        NoArvore<String> nM = new NoArvore<String>("M");
        nBB.inserirFilho(nAA);
        nCC.inserirFilho(nBB);
        nDD.inserirFilho(nCC);
        nEE.inserirFilho(nDD);
        nM.inserirFilho(nEE);

        NoArvore<String> nA = new NoArvore<String>("A");
        NoArvore<String> nB = new NoArvore<String>("B");
        NoArvore<String> nC = new NoArvore<String>("C");
        NoArvore<String> nD = new NoArvore<String>("D");

        nB.inserirFilho(nA);
        nC.inserirFilho(nB);
        nD.inserirFilho(nC);
        nM.inserirFilho(nD);

        NoArvore<String> nXX = new NoArvore<String>("XX");
        nM.inserirFilho(nXX);

        NoArvore<String> nR = new NoArvore<String>("R");
        NoArvore<String> nH = new NoArvore<String>("H");
        nH.inserirFilho(nR);
        nH.inserirFilho(nM);

        Arvore<String> a = new Arvore<>();
        a.setRaiz(nH);
        int b = a.getAltura();
        System.out.println(" A altura da árvore deve ser 6: " + b);

        Arvore<String> a2 = new Arvore<>();
        int b2 = a2.getAltura();
        System.out.println(" A altura da árvore deve ser -1: " + b2);

        Arvore<String> a3 = new Arvore<>();
        NoArvore<String> nS = new NoArvore<String>("M");
        a3.setRaiz(nS);
        int b3 = a3.getAltura();
        System.out.println(" A altura da árvore deve ser zero: " + b3);

        Arvore<String> a4 = new Arvore<>();
        NoArvore<String> nZ = new NoArvore<String>("Z");
        NoArvore<String> nU = new NoArvore<String>("U");
        NoArvore<String> nY = new NoArvore<String>("Y");
        NoArvore<String> nX = new NoArvore<String>("X");
        NoArvore<String> nW = new NoArvore<String>("W");
        a4.setRaiz(nZ);
        nZ.inserirFilho(nU);
        nZ.inserirFilho(nY);
        nY.inserirFilho(nX);
        nX.inserirFilho(nW);
        int b4 = a4.getAltura();
        System.out.println(" A altura da árvore deve ser 2: " + b4);


        System.out.println(a4.isBalanceada());
        Arvore<Integer> arvore = new Arvore<>();

        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no4 = new NoArvore<>(4);
        no3.inserirFilho(no4);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no2 = new NoArvore<>(2);
        no2.inserirFilho(no5);
        no2.inserirFilho(no3);

        NoArvore<Integer> no6 = new NoArvore<>(6);

        NoArvore<Integer> no10 = new NoArvore<>(10);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        no9.inserirFilho(no10);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        no7.inserirFilho(no9);
        no7.inserirFilho(no8);

        NoArvore<Integer> no1 = new NoArvore<>(1);
        no1.inserirFilho(no7);
        no1.inserirFilho(no6);
        no1.inserirFilho(no2);
        arvore.setRaiz(no1);
//
        System.out.println("Árvore completa = " + arvore);
        System.out.println("Altura da árvore = " + arvore.getAltura());
        System.out.println("1 = nível esperado: 0 | nível retornado: " + arvore.getNivel(1));
        System.out.println("2 = nível esperado: 1 | nível retornado: " + arvore.getNivel(2));
        System.out.println("3 = nível esperado: 2 | nível retornado: " + arvore.getNivel(3));
        System.out.println("4 = nível esperado: 3 | nível retornado: " + arvore.getNivel(4));
        System.out.println("5 = nível esperado: 2 | nível retornado: " + arvore.getNivel(5));
        System.out.println("6 = nível esperado: 1 | nível retornado: " + arvore.getNivel(6));
        System.out.println("7 = nível esperado: 1 | nível retornado: " + arvore.getNivel(7));
        System.out.println("8 = nível esperado: 2 | nível retornado: " + arvore.getNivel(8));
        System.out.println("9 = nível esperado: 2 | nível retornado: " + arvore.getNivel(9));
        System.out.println("10 = nível esperado: 3 | nível retornado: " + arvore.getNivel(10));

        System.out.println("Árvore balanceada = esperado: false | retornado: " + arvore.isBalanceada());

        NoArvore<Integer> n9 = new NoArvore<Integer>(9);
        NoArvore<Integer> n10 = new NoArvore<Integer>(10);
        NoArvore<Integer> n4 = new NoArvore<Integer>(4);
        n4.inserirFilho(n10);
        n4.inserirFilho(n9);
        NoArvore<Integer> n8 = new NoArvore<Integer>(8);
        NoArvore<Integer> n3 = new NoArvore<Integer>(3);
        n3.inserirFilho(n8);
        NoArvore<Integer> n5 = new NoArvore<Integer>(5);
        NoArvore<Integer> n6 = new NoArvore<Integer>(6);
        NoArvore<Integer> n7 = new NoArvore<Integer>(7);
        NoArvore<Integer> n2 = new NoArvore<Integer>(2);
        n2.inserirFilho(n7);
        n2.inserirFilho(n6);
        n2.inserirFilho(n5);
        NoArvore<Integer> n1 = new NoArvore<Integer>(1);
        n1.inserirFilho(n4);
        n1.inserirFilho(n3);
        n1.inserirFilho(n2);
        Arvore<Integer> arvore2 = new Arvore<>();
        arvore2.setRaiz(n1);

        System.out.println();
        System.out.println("Árvore completa = " + arvore2);
        System.out.println("Altura da árvore = " + arvore2.getAltura());
        System.out.println("1 = nível esperado: 0 | nível retornado: " + arvore2.getNivel(1));
        System.out.println("2 = nível esperado: 1 | nível retornado: " + arvore2.getNivel(2));
        System.out.println("3 = nível esperado: 1 | nível retornado: " + arvore2.getNivel(3));
        System.out.println("4 = nível esperado: 1 | nível retornado: " + arvore2.getNivel(4));
        System.out.println("5 = nível esperado: 2 | nível retornado: " + arvore2.getNivel(5));
        System.out.println("6 = nível esperado: 2 | nível retornado: " + arvore2.getNivel(6));
        System.out.println("7 = nível esperado: 2 | nível retornado: " + arvore2.getNivel(7));
        System.out.println("8 = nível esperado: 2 | nível retornado: " + arvore2.getNivel(8));
        System.out.println("9 = nível esperado: 2 | nível retornado: " + arvore2.getNivel(9));
        System.out.println("10 = nível esperado: 2 | nível retornado: " + arvore2.getNivel(10));

        System.out.println("Árvore balanceada = esperado: true | retornado: " + arvore2.isBalanceada());

        Arvore<Integer> arvore3 = new Arvore<>();

        NoArvore<Integer> noRaiz = new NoArvore<>(1);
        arvore3.setRaiz(noRaiz);

        System.out.println();
        System.out.println("Árvore completa: " + arvore3);
        System.out.println("Altura da árvore = esperado: 0 | retornado: " + arvore3.getAltura());
        System.out.println("1 = nível esperado: 0 | nível retornado: " + arvore3.getNivel(1));
        System.out.println("Árvore balanceada = esperado: true | retornado: " + arvore3.isBalanceada());


    }
}
