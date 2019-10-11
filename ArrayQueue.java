public class ArrayQueue<T> implements Queue<T> {
    private int tailInd;
    private int headInd;
    private T[] arr;

    public ArrayQueue() {
        tailInd = 0;
        headInd = 0;
        Object[] nArr = new Object[10];
        arr = (T[]) nArr;
    }

    public T dequeue() {
        if(empty()) {
            return null;
        }
        return arr[headInd++];
    }

    public void enqueue(T item) {
        if (tailInd == arr.length) {
            growArray();
        }
        arr[tailInd++] = item;
    }


    public boolean empty() {
        return headInd == tailInd;
    }

    private void growArray() {
        Object[] nArr = new Object[arr.length * 2];
        T[] gArr = (T[]) nArr;
        System.arraycopy(arr, 0, gArr, 0, arr.length);
        arr = gArr;
    }
}

