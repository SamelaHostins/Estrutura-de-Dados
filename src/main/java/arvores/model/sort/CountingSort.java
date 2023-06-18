package arvores.model.sort;

public class CountingSort implements Sort<Integer> {

    @Override
    public void sort(Integer[] vetorOriginal) {
        int tamanho = vetorOriginal.length;
        if (tamanho == 0) {
            return;
        }
        
        // vetor que ira substituir elementos do vetor original
        int[] vetorSaida = new int[tamanho + 1];

        // encontra o maior elemento do array
        int max = vetorOriginal[0];
        for (int i = 1; i < tamanho; i++) {
            int elemento = vetorOriginal[i];
            if (elemento > max) {
                max = elemento;
            }
        }
        //cria o array contador a partir do elemento m�ximo encontrado
        int[] contador = new int[max + 1];

        // inicializa o array contador com zero
        for (int i = 0; i < max; i++) {
            contador[i] = 0;
        }

        // armazena o numero de vezes que cada numero aparece
        for (int i = 0; i < tamanho; i++) {
            int elemento = vetorOriginal[i];
            contador[elemento] = contador[elemento] + 1;
        }

        // armazena a contagem cumulativa de cada array
        // isso ajuda a ordenar os elementos no indice correto
        for (int i = 1; i <= max; i++) {
            int contagem = contador[i - 1];
            contador[i] += contagem;
        }

        // encontra o indice de cada elemento
        // do array original no array de contagem
        // e insere os elementos no array de saida
        for (int i = tamanho - 1; i >= 0; i--) {
            int elemento = vetorOriginal[i];
            int indiceContadorNvezes = contador[elemento];
            vetorSaida[indiceContadorNvezes - 1] = elemento;
            contador[elemento] = contador[elemento] - 1;
        }

        // copia os elementos do array original
        // com os elementos ordenados no array de saida
        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = vetorSaida[i];
        }

        // FIM
    }

}
