package package1;
import java.util.*;
public class StackQuesion {
	public static void main(String[] args) {
		///////////////////////////////////////////////////////////
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		//////////////////////////////////////////////////////////
		
//		pushAtBottom(s,7);
		reverseStack(s);
		
		
		
		//////////////////////////////////////////////////////////
		while(!s.isEmpty())
		{
			System.out.println(s.peek() +"|");
			System.out.println("--");
			s.pop();
		}
		////////////////////////////////////////////////////////////
		
	}
	public static void pushAtBottom(Stack<Integer>s,int data)
	{
		while(s.isEmpty())
			
		{
			s.push(data);
			return;
		}
		
		int top = s.pop();
		pushAtBottom(s,data);
		s.push(top);
	}
	
	public static void reverseStack(Stack<Integer>s)
	{
		while(s.isEmpty())
		{
			return;
		}
		int top = s.peek();
		s.pop();
		reverseStack(s);
		pushAtBottom(s,top);
		
	}

}
