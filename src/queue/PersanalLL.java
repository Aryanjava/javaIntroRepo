package queue;

public class PersanalLL<E> {
	Node<E> head;
	  void add(E data) {
		  Node<E> toadd = new Node<>(data);
		  if(head == null ) {
			  head = toadd;
			  return;
		  }
		  Node<E> temp = head;
		  while(temp.next != null) {
			  temp = temp.next;
		  }
		  temp.next = toadd;
	  }
	    void print(){
	    	Node<E>temp = head;
	    	while(temp != null) {
	    		System.out.print(temp.data+" ");
	    		temp = temp.next;
	    	}
	    }
	    void remove() {
	    	if(head == null ) {
	    		System.out.print("queue is empty ");
	    	}
	    	E removed = head.data;
	    	 head = head.next;
	    	
	    }
	
	
	     static class Node<E>{
		 E data;
		 Node<E> next ;
		 public Node(E data) {
			 this.data = data;
			 next = null;
		 }
		 
		}

}
