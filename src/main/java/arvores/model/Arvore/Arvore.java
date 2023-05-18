package arvores.model.Arvore;

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
        int menorNo = -1; // representa a altura vazia -1

        // começou pela raiz
        NoArvore<T> filhoAtual = no.getFilho(); // nó auxiliar para definir qual nó é o atual

        // eqt tiver filho
        while (filhoAtual != null) {
            // p verificar a altura da subárvore
            int alturaFilhoAtual = altura(filhoAtual);
            if (alturaFilhoAtual > menorNo) {
                menorNo = alturaFilhoAtual;
            }
            filhoAtual = filhoAtual.getIrmao();
        }

        return menorNo + 1;
    }

    // public int getNivel(T info) {
    // NoArvore<T> noPassado = this.pertence(info); // para verificar se existe o
    // valor
    // if (noPassado.getInfo() == getRaiz().getInfo()) {
    // return 0;
    // } else {
    // int contador = 0;
    // NoArvore<T> filhoAtual = getRaiz().getFilho();
    // while (filhoAtual != null) {
    // contador++;
    // filhoAtual = filhoAtual.getFilho();
    // }
    // // int resposta = (alturaDoNoPassado - contador);
    // return 0;
    // }
    // }

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
        if (vazia()) {
            return -1;
        } else {
            int nivel = 0; // nível inicial sempre é zero
            NoArvore<T> noAtual = getRaiz();

            while (noAtual != null) {
                // se for ele mesmo então achou o nível
                if (noAtual.getInfo().equals(info)) {
                    return nivel;
                }

                // se tiver filho, tem p percorrer
                if (noAtual.getFilho() != null) {
                    nivel++;
                    noAtual = noAtual.getFilho();
                    // se não tiver filho, precisa ver se tem irmão e ai p loop se inicia p ver os
                    // filhos do irmão
                } else if (noAtual.getIrmao() != null) {
                    noAtual = noAtual.getIrmao();
                } else {
                    // se o nó pai não tem filhos nem irmão ele
                    // Retrocede até encontrar um nó pai com irmãos ou até chegarmos à raiz.
                    // e vai decrementando os níveis contados
                    while (noAtual != null && noAtual.getIrmao() == null) {
                        noAtual = getPai(noAtual);
                        nivel--;
                    }
                    // O irmão do noPai passará a ser o noAtual
                    if (noAtual != null) {
                        noAtual = noAtual.getIrmao();
                    }
                }
            }
            return nivel;
        }
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
            int menorAltura = getMenorAltura(raiz);

            return menorAltura;
        }
    }

    @Override
    public String toString() {
        if (this.vazia()) {
            return "<>";
        }
        return raiz.imprimePre();
    }

}
