package queue;

public class Testingqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myqueue<Integer>i = new Myqueue<>();
		i.inqueue(237);
		i.inqueue(370);
		i.inqueue(137);
		 i.dequeue();
		i.show();
	}

}
