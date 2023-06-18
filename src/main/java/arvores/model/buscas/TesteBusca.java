package arvores.model.buscas;

import model.sort.CountingSort;
import model.sort.Sort;

public class TesteBusca {
    public static void main(String[] args) {

        Sort<Integer> meuAlgoritmo = new CountingSort();
        AlgoritmosDeBusca<Integer> ab = new AlgoritmosDeBusca<>();
        Integer[] vetor = { 15, 28, 36, 41, 50, 55, 76, 80, 83, 90, 98, 101, 109, 111 };
        meuAlgoritmo.sort(vetor);
        int indice = ab.buscaBinaria(vetor, 83);
        System.out.println(indice);

        ab.chavesVisitadas(vetor, 83);
        ab.chavesVisitadas(vetor, 40);
    }
}
