package ordenacao;

public class CountingSort implements Sort<Integer> {

    @Override
    public void sort(Integer[] vetorOriginal) {
        int tamanho = vetorOriginal.length;
        if (tamanho == 0) {
            return;
        }
        
        int[] vetorSaida = new int[tamanho + 1];

        int max = vetorOriginal[0];
        for (int i = 1; i < tamanho; i++) {
            int elemento = vetorOriginal[i];
            if (elemento > max) {
                max = elemento;
            }
        }

        int[] contador = new int[max + 1];

        for (int i = 0; i < max; i++) {
            contador[i] = 0;
        }

        for (int i = 0; i < tamanho; i++) {
            int elemento = vetorOriginal[i];
            contador[elemento] = contador[elemento] + 1;
        }

        for (int i = 1; i <= max; i++) {
            int contagem = contador[i - 1];
            contador[i] += contagem;
        }

        for (int i = tamanho - 1; i >= 0; i--) {
            int elemento = vetorOriginal[i];
            int indiceContadorNvezes = contador[elemento];
            vetorSaida[indiceContadorNvezes - 1] = elemento;
            contador[elemento] = contador[elemento] - 1;
        }

        for (int i = 0; i < tamanho; i++) {
            vetorOriginal[i] = vetorSaida[i];
        }
    }

}
