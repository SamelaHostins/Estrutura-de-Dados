package arvores.model.Arvore;

/*
 *  @author GABRIEL CARDOSO DE SOUZA && SÂMELA HOSTINS
 */
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

    protected int getNivelNo(T info, int alturaCorrente) {
        if (this.info.equals(info)) {
            alturaCorrente++;
        } else {
            // auxilia na verificação quando encontra o no, se encontrou o no, apenas retorna somando os niveis.
            int aux;

            if (this.getFilho() != null) {
                aux = this.getFilho().getNivelNo(info, alturaCorrente);
                if (aux != alturaCorrente) {
                    alturaCorrente = aux;
                    // incrementa somente quando é filho, quando é irmão só retorna o valor,
                    // porque irmão é do mesmo nivel, e não um nivel acima
                    return alturaCorrente +1;
                }
            }

            if ( this.getIrmao() != null) {
                aux = this.getIrmao().getNivelNo(info, alturaCorrente);
                if (aux != alturaCorrente) {
                    alturaCorrente = aux;
                    return alturaCorrente;
                }
            }
            return alturaCorrente;
        }
        return alturaCorrente;
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
