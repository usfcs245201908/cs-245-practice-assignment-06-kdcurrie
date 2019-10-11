public class ArrayStack<T> implements Stack<T> {
    private T[] arr;
    private int head = -1;

    public ArrayStack() {
        Object[] temp = (T[])(new Object[10]);
        arr = (T[]) temp;
    }

    private void growArray() {
        Object[] tArr = new Object[arr.length * 2];
        T[] cArr = (T[]) tArr;
        System.arraycopy(arr, 0, cArr, 0, arr.length);
        arr = cArr;
    }

    public void push(T item) {
        if (head == arr.length - 1)
            growArray();
        arr[++head] = item;
    }

    public T pop() {
        if (empty())
            return null;

        return arr[head--];
    }

    public T peek() {
        if (empty())
            return null;
        return arr[head];
    }

    public boolean empty() {
        return head == -1;

    }
}