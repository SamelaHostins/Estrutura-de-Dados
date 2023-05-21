package arvores.model.Arvore;

import java.util.Objects;

/*
 *  @author GABRIEL CARDOSO DE SOUZA && SÂMELA HOSTINS
 */
public class Arvore<T> {

    private NoArvore<T> raiz;

    public void setRaiz(NoArvore<T> raiz) {
        this.raiz = raiz;
    }

    public NoArvore<T> getRaiz() {
        return raiz;
    }

    public NoArvore<T> pertence(T info) {
        if (this.vazia()) {
            return null;
        }
        return raiz.pertence(info);
    }

    public boolean vazia() {
        return (this.raiz == null);
    }

    public int getAltura() {
        if (vazia()) {
            return -1;
        } else {
            return altura(getRaiz());
        }
    }

    /**
     * para achar a altura ele terá que achar a altura de cada subárvore
     * e ver qual subárvore possuirá a maior altura.
     * A altura da árvore é a da raiz até a sua folha mais longe
     */
    public int altura(NoArvore<T> no) {
        int maiorAltura = -1; // representa a altura vazia -1

        // começou pela raiz
        NoArvore<T> filhoAtual = no.getFilho(); // nó auxiliar para definir qual nó é o atual

        // eqt tiver filho
        while (filhoAtual != null) {
            // p verificar a altura da subárvore
            int alturaFilhoAtual = altura(filhoAtual);
            if (alturaFilhoAtual > maiorAltura) {
                maiorAltura = alturaFilhoAtual;
            }
            filhoAtual = filhoAtual.getIrmao();
        }

        return maiorAltura + 1;
    }

    public NoArvore<T> getPai(NoArvore<T> no) {
        return encontraPai(getRaiz(), no);
    }

    private NoArvore<T> encontraPai(NoArvore<T> atual, NoArvore<T> no) {

        NoArvore<T> filho = atual.getFilho();

        while (filho != null) {
            if (filho == no) {
                return atual; // O nó procurado é um filho do nó atual
            }
            NoArvore<T> pai = encontraPai(filho, no);
            if (pai != null) {
                return pai;
            }
            filho = filho.getIrmao();
        }

        return null; // nunca chegará aqui
    }

    // O nível de um nó é definido como a distância entre esse nó e a raiz da árvore
    public int getNivel(T info) {
        if (vazia() || Objects.isNull(this.pertence(info))) {
            return -1;
        } else {
            return getAlturaNoEspecifico(info);
        }
    }

    private int getAlturaNoEspecifico(T info) {
        return getRaiz().getNivelNo(info, -1);
    }

    private int getMenorAltura(NoArvore<T> no) {
        int menorAltura = this.altura(getRaiz());

        if (no.getFilho() == null) {
            return 0;
        }

        // começou pela raiz
        NoArvore<T> filhoAtual = no.getFilho(); // nó auxiliar para definir qual nó é o atual

        // eqt tiver filho
        while (filhoAtual != null) {
            // p verificar a altura da subárvore
            int alturaFilhoAtual = getMenorAltura(filhoAtual);
            if (alturaFilhoAtual < menorAltura) {
                menorAltura = alturaFilhoAtual;
            }

            filhoAtual = filhoAtual.getIrmao();
        }

        return menorAltura + 1;
    }

    public boolean isBalanceada() {
        if (vazia()) {
            return true;
        } else {
            return (altura(getRaiz()) - getMenorAltura(getRaiz())) <= 1;
        }
    }

    public int menorAltura() {
        if (vazia()) {
            return -1;
        } else {
            NoArvore<T> raiz = getRaiz();
            return  getMenorAltura(raiz);
        }
    }

    @Override
    public String toString() {
        return vazia() ? "<>" : getRaiz().imprimePre();
    }

}
