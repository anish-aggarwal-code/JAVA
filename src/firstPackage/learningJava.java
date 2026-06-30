package firstPackage;

import java.util.Scanner;

//import java.util.*;

public class learningJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] keypadValues = {
				"",    //0
				"",       
				"abc",
				"def",
				"ghi",
				"jkl",
				"mno",
				"pqrs",
				"tuv",
				"wxyz"  //9
				
		};
		int n = sc.nextInt();
		System.out.println(keypadValues[n]);
		
	}

}
