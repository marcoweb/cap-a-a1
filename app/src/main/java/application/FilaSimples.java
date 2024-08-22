package application;

public class FilaSimples {
    private Integer[] elementos;
    private int capacidade;
    private int inicio;
    private int fim;
    private int tamanho;

    public FilaSimples(int capacidade) {
        this.capacidade = capacidade;
        elementos = new Integer[capacidade];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enqueue(Integer elemento) {
        if(tamanho == capacidade) {
            throw new IllegalStateException(
                "A fila está cheia");
        }
        fim = (fim + 1);
        elementos[fim] = elemento;
        tamanho++;
    }

    public Integer dequeue() {
        if(tamanho == 0) {
            throw new IllegalStateException(
                "A fila está vazia");
        }
        int elementoRemovido = elementos[inicio];
        elementos[inicio] = 0;
        inicio = inicio + 1;
        tamanho--;

        return elementoRemovido;
    }
}
