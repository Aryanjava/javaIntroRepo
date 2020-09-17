package stack;
import linkedList.MyLinkedlist;

public class myStack<E> {

	  private MyLinkedlist<E> ll = new MyLinkedlist<>();
		
		public void push(E e){
			ll.add(e);
		   }
		  void printi() {
			  ll.print();
		  }
		  void pop() {
			  ll.remove();
		  }
		  void peek() {
			  ll.last();
		  }
		// TODO Auto-generated method stub

	}


