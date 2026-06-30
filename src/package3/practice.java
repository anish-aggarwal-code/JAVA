package package3;

public class practice {
	public static void main(String[] args) {
		LL list = new LL();
		list.insertFirst(0);
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertFirst(3);
		list.insertLast(4);
		list.insertAtIndex(7, 3);
		list.display();
		System.out.println();
		System.out.println(list.size);
		System.out.println(list.tail.value);
		
		
	}

}
