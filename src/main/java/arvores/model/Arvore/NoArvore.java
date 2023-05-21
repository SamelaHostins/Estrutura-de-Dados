package arvores.model.Arvore;

public class NoArvore<T> {
    private T info;
    private NoArvore<T> filho;
    private NoArvore<T> irmao;

    public NoArvore(T info) {
        this.info = info;
    }

    public String imprimePre() {
        String result = "<" + this.info.toString();

        if (this.getFilho() != null) {
            result += filho.imprimePre();
        }

        result += ">";

        if (this.getIrmao() != null) {
            result += irmao.imprimePre();
        }

        return result;
    }

    public void inserirFilho(NoArvore<T> filho) {
        filho.setIrmao(this.getFilho());
        this.filho = filho;
    }

    public NoArvore<T> pertence(T info) {
        if (getInfo().equals(info)) {
            return this;
        }
        NoArvore<T> filho = getFilho();
        if (filho != null) {
            NoArvore<T> retornoFilho = filho.pertence(info);
            if (retornoFilho != null) {
                return retornoFilho;
            }
        }
        return getIrmao() == null ? null : getIrmao().pertence(info);
    }

    public NoArvore<T> getFilho() {
        return filho;
    }

    public NoArvore<T> getIrmao() {
        return irmao;
    }

    public void setFilho(NoArvore<T> filho) {
        this.filho = filho;
    }

    public void setIrmao(NoArvore<T> irmao) {
        this.irmao = irmao;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}
