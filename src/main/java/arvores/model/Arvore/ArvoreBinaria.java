package arvores.model.Arvore;

public class ArvoreBinaria<T> extends ArvoreBinariaAbstract<T> {

    @Override
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        super.setRaiz(raiz);
    }

    // Calcula a altura da árvore
    public int getAlturaArvoreBinaria() {
        if (vazia()) {
            return -1;
        } else {
            return alturaArvore(getRaiz());
        }
    }

    public int alturaArvore(NoArvoreBinaria<T> no) {
        if (no == null)
            return -1;
        else {
            int alturaEsquerda = alturaArvore(no.getEsq());
            int alturaDireita = alturaArvore(no.getDir());

            return Math.max(alturaEsquerda, alturaDireita) + 1;
        }
    }

    public boolean arvoreEstaCheia() {
        int altura = alturaArvore(getRaiz());
        return this.isCheia(getRaiz(), altura, 0);
    }

    private boolean isCheia(NoArvoreBinaria<T> no, int altura, int nivel) {
        // Verifica se o nó é nulo
        if (no == null)
            return true;

        // Verifica se o nó é uma folha
        if (no.getEsq() == null && no.getDir() == null) {
            return nivel == altura;
        }

        // Verifica se os filhos estão presentes e se estão no próximo nível
        if (no.getEsq() != null && no.getDir() != null) {
            return isCheia(no.getEsq(), altura, nivel + 1) && isCheia(no.getDir(), altura, nivel + 1);
        }

        // A árvore não está cheia se um filho está presente e o outro está ausente
        return false;

    }

}
