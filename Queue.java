
public interface Queue<T> { //<T> means we can take any data type
	
	public T dequeue();
	public void enqueue(T item);
	public boolean empty();

}
