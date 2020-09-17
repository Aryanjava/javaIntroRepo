package linkedList;

public class MyLinkedlist<E> {
	Node<E> head;
	public void add(E data) {
		Node<E> toadd = new Node<>(data);
        if (head == null) {
        	head = toadd; 
        	return ;
        }
		Node<E> temp = head;
		while(temp.next != null) {
			  temp = temp.next ;
		}
		temp.next = toadd ; 
		
	}
	public void print() {
		Node<E> temp = head;
		while(temp!= null) {
			System.out.print(temp.data+" ");
			  temp = temp.next ;
		}
		//System.out.print(temp+"");
		
	}
	public void remove() {
		//Node<E> toremove = null;
		Node<E> temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		    temp.next = null;
	         
		
	}
	public void last() {
		
		Node<E> temp = head ;
		while(temp.next != null) {
			temp = temp.next;
		}
		 System.out.println(temp.data);
		 
	}
	


       static class Node<E> {
    	   E data;
    	   Node<E> next;
         
    	   public  Node(E data) {
    		   this.data = data;
    		       next = null;
    	   }
       }
       }