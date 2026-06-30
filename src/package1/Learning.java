package package1;
import java.util.*;
public class Learning {
	public static void main(String[] args) {
	Stack<Integer> s = new Stack<>();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	s.push(5);
	s.push(6);
	while(!s.isEmpty())
	{
		System.out.print(s.peek()+" --> ");
		s.pop();
		}
	System.out.println("End");
	}

}
