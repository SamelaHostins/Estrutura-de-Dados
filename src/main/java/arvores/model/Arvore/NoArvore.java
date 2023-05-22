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

    public String imprimeEmOrdem() {
        String result = "";

        NoArvore<T> filho = this.getFilho();
        if (filho != null) {
            result += filho.imprimeEmOrdem();
        }

        result += this.info.toString() + " ";

        NoArvore<T> irmao = this.getIrmao();
        while (irmao != null) {
            result += irmao.imprimeEmOrdem();
            irmao = irmao.getIrmao();
        }

        return result;
    }

    public String imprimePosOrdem() {
        String result = "";

        NoArvore<T> filho = this.getFilho();
        while (filho != null) {
            result += filho.imprimePosOrdem();
            filho = filho.getIrmao();
        }

        result += this.info.toString() + " ";

        return result;
    }

    public void inserirFilho(NoArvore<T> filho) {
        filho.setIrmao(this.getFilho());
        this.filho = filho;
    }

    public NoArvore<T> pertence(T info) {
        if (this.info.equals(info)) {
            return this;
        } else {
            NoArvore<T> no = null;
            if (this.getFilho() != null) {
                no = this.getFilho().pertence(info);
            }
            if (no == null && this.getIrmao() != null) {
                no = this.getIrmao().pertence(info);
            }
            return no;
        }
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
