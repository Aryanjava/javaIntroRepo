package queue;

public class Myqueue<E> {
	 PersanalLL<E>ll = new PersanalLL<>();
	
	public void inqueue(E e){
		ll.add( e);
		
	}
	void show() {
		ll.print();
	}
	void dequeue() {
		ll.remove();
	}

}
