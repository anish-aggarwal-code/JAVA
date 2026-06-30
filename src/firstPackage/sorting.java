package firstPackage;

import java.util.*;
public class sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to Sort");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+(i+1)+ " number");
			arr[i] = sc.nextInt();

		}
		
		insertionSort(arr);
		System.out.print("Sorted numbers are: ");
		System.out.println(Arrays.toString(arr));
		
	}
	public static void insertionSort(int array[])
	{
		for (int i = 1; i < array.length; i++) {
			int CurrentValue = array[i];
			int j = i-1;
			while(j>=0 && array[j]>CurrentValue)
			{
				array[j+1] = array[j];
				array[j] = CurrentValue;
				j--;
			}
		}
	}

}
