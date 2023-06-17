package buscas;

public class AlgoritmosDeBusca<T extends Comparable<T>> {

	public int buscaLinear(T[] info, T valorBuscar) {
		for (int i=0; i < info.length; i++) {
			if (valorBuscar.equals(info[i])) {
				return i;
			}
		}
		return -1;
	}


	public int buscaBinaria(T[] info, T valorBuscar) {
        int inicio = 0;
        int fim = info.length - 1;
        int meio;
        while(inicio<=fim) {
            meio = (inicio + fim)/2;
            if (valorBuscar.compareTo(info[meio]) < 0) {
                fim = meio - 1;
            } else {
                if (valorBuscar.compareTo(info[meio]) > 0) {
                    inicio = meio + 1;
                } else {
                    return meio;
                }
            }
        }
        return -1;
	}
}
