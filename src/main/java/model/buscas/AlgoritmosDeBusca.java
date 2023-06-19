package model.buscas;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmosDeBusca<T extends Comparable<T>> {

    public int buscaLinear(T[] info, T valorBuscar) {
        for (int i = 0; i < info.length; i++) {
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
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
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

    public int chavesVisitadas(T[] info, T valorBuscar) {
        List<T> chavesVisitadas = new ArrayList<>();
        int inicio = 0;
        int fim = info.length - 1;
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            chavesVisitadas.add(info[meio]); // Adiciona a chave visitada à lista

            if (valorBuscar.compareTo(info[meio]) < 0) {
                fim = meio - 1;
            } else {
                if (valorBuscar.compareTo(info[meio]) > 0) {
                    inicio = meio + 1;
                } else {
                    // Chave encontrada
                    System.out.println("Chaves visitadas: " + chavesVisitadas);
                    return meio;
                }
            }
        }

        // Chave não encontrada
        System.out.println("Chaves visitadas: " + chavesVisitadas);
        return -1;
    }
}
