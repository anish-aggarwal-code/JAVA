package firstPackage;
import java.util.*;
public class towerOfHanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disks");
		int n = sc.nextInt();
		steps(n,1,2,3);
		
	}
	public static void steps(int n,int a,int b, int c)//a is source b is helper c is dest
	{
		if(n==0)
		{
			return;
		}
		steps(n-1,a,c,b);
		if(n==1)
		{
			System.out.println("Move "+n+"st disk from tower "+a+" to tower "+c);
		}
		else if(n==2)
		{
			System.out.println("Move "+n+"nd disk from tower "+a+" to tower "+c);
		}
		else if(n==3)
		{
			System.out.println("Move "+n+"rd disk from tower "+a+" to tower "+c);
		}
		else
		{
		System.out.println("Move "+n+"th disk from tower "+a+" to tower "+c);}
		steps(n-1,b,a,c);
			
			
	}

}
