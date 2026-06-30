package package3;

public class Stack {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static class NodeClass {
		static Node head;
		static Node tail;

		public static void push(int val) {
			Node node = new Node(val);
			if (isEmpty() == true) {
				head = node;
				tail = node;
				return;
			} else {
				head.next = node;
				head = node;
			}

		}

		public static void pop() {
			if (isEmpty()) {
				System.out.println("Empty list! nothing to pop");
				return;
			}
			if (head == tail) {
				// only 1 element in list
				head = null;
				tail = null;
			}
			int poppedValue = head.data;
			Node priorToPop = tail;
			while (priorToPop.next != head) {
				priorToPop = priorToPop.next;
			}
			head = priorToPop;
			head.next = null;
		}

		public static int peek() {
			if (isEmpty()) {
				System.out.println("Empty Stack!");
				return -1;
			}
			return head.data;

		}

		public static void display() {
			Node currentNode = tail;
			if (isEmpty()) {
				System.out.println("Empty stack! Nothing to display");
				return;
			}

			do {
				System.out.print(currentNode.data + " --> ");
				currentNode = currentNode.next;
			} while (currentNode != null);
			System.out.println("END");

		}

		public static boolean isEmpty() {
			if (head == null) {
				return true;
			} else {
				return false;
			}
		}

	}

	public static void main(String[] args) {
		NodeClass.push(1);
		NodeClass.push(2);
		NodeClass.push(3);
		NodeClass.push(4);
		NodeClass.push(5);

		NodeClass.pop();
		NodeClass.display();
	}

}
