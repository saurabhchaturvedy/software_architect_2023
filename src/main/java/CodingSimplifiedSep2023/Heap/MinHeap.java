package CodingSimplifiedSep2023.Heap;

public class MinHeap {


    int capacity;
    int currentSize;
    int[] heap;

    MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity + 1];
        this.currentSize = 0;
    }


    public void createHeap(int[] arr) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                insert(arr[i]);
            }
        }
    }


    public void display(int[] heap) {
        for (int i = 1; i < heap.length; i++) {
            System.out.print(" " + heap[i]);
        }
        System.out.println(" ");
    }


    public void insert(int x) {
        if (currentSize == capacity) {
            return;
        }

        currentSize++;
        int idx = currentSize;
        heap[idx] = x;
        bubbleUp(idx);
    }

    private void bubbleUp(int idx) {

        int parentIndex = idx / 2;
        int currentIndex = idx;

        while (currentIndex > 0 && heap[parentIndex] > heap[currentIndex]) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = parentIndex / 2;
        }
    }

    private void swap(int currentIndex, int parentIndex) {

        int temp = heap[currentIndex];
        heap[currentIndex] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    public int min() {
        int min = heap[1];
        heap[1] = heap[currentSize];
        heap[currentSize] = 0;
        sinkDown(1);
        currentSize--;
        return min;
    }

    private void sinkDown(int k) {

        int smallest = k;
        int leftIndex = 2 * k;
        int rightIndex = 2 * k + 1;

        while (leftIndex < size() && heap[smallest] > heap[leftIndex]) {
            smallest = leftIndex;
        }

        while (rightIndex < size() && heap[smallest] > heap[rightIndex]) {
            smallest = rightIndex;
        }

        if (smallest != k) {

            swap(k, smallest);
            sinkDown(smallest);
        }
    }


    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public static void main(String[] args) {

        int[] arr = {8,10,32,5};

        MinHeap minHeap = new MinHeap(10);
        minHeap.createHeap(arr);

        minHeap.display(minHeap.heap);

        System.out.println(" Extract min : " + minHeap.min());

        minHeap.display(minHeap.heap);
    }
}
