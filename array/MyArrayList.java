package array;

public class MyArrayList {

    private int[] items;
    private int size;

    // Construtor
    public MyArrayList(int capacity) {
        items = new int[capacity];
        size = 0;
    }

    // ======================
    // INSERÇÃO
    // ======================

    public void addFirst(int value) {
        for (int i = size; i > 0; i--) {
            items[i] = items[i - 1];
        }
        items[0]= value;

        size++

    }

    public void addLast(int value) {
       items[size] = value;
        size++;
    }

    public void insertAt(int index, int value) {
        // 1. validar
        if (index < 0 || index > size) {
            System.out.println("Índice inválido");
            return;
        }

        // 2. shift pra direita
        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }

        // 3. inserir
        items[index] = value;

        // 4. atualizar tamanho
        size++;
    }

    // ======================
    // REMOÇÃO
    // ======================

    public int removeFirst() {
        if (size == 0) {
            return -1;
        }

        int removed = items[0]; // guarda o primeiro

        // shift pra esquerda
        for (int i = 0; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        size--; // diminui tamanho

    }

    public int removeLast() {
        if (size == 0) {
            return -1;
        }

        int removed = items[size - 1]; // último
        size--;

        return removed;
    }

    public int removeAt(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        int removed = items[index];

        // shift pra esquerda
        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }

        size--;

        return removed;
    }

    public boolean remove(int value) {
        int index = find(value);

        if (index == -1) {
            return false;
        }

        removeAt(index);
        return true;
    }

    // ======================
    // BUSCA
    // ======================

    public int find(int value) {
        for (int i = 0; i < size; i++) {
            if (items[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        return items[index];
    }

    // ======================
    // ATUALIZAÇÃO
    // ======================

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            return;
        }

        items[index] = value;
    }

    // ======================
    // AUXILIAR
    // ======================

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}