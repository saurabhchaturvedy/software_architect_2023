package CodingSimplifiedSep2023.Heap;

public class MaxHeap {


    int capacity;
    int currentSize;
    int[] heap;

    MaxHeap(int capacity) {
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

        while (currentIndex > 0 && heap[parentIndex] < heap[currentIndex]) {

            if (parentIndex != 0) {
                swap(currentIndex, parentIndex);
            }
            currentIndex = parentIndex;
            parentIndex = parentIndex / 2;

        }
    }

    private void swap(int currentIndex, int parentIndex) {

        int temp = heap[currentIndex];
        heap[currentIndex] = heap[parentIndex];
        heap[parentIndex] = temp;
    }

    public int max() {
        int min = heap[1];
        heap[1] = heap[currentSize];
        heap[currentSize] = 0;
        sinkDown(1);
        currentSize--;
        return min;
    }

    private void sinkDown(int k) {

        int greatest = k;
        int leftIndex = 2 * k;
        int rightIndex = 2 * k + 1;

        while (leftIndex < size() && heap[greatest] < heap[leftIndex]) {
            greatest = leftIndex;
        }

        while (rightIndex < size() && heap[greatest] < heap[rightIndex]) {
            greatest = rightIndex;
        }

        if (greatest != k) {

            swap(k, greatest);
            sinkDown(greatest);
        }
    }


    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public static void main(String[] args) {
        int[] arr = {8, 10, 32, 5};

        MaxHeap maxHeap = new MaxHeap(11);
        maxHeap.createHeap(arr);

        maxHeap.display(maxHeap.heap);

        System.out.println(" Extract max : " + maxHeap.max());
    }
}
