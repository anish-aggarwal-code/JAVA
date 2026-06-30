package firstPackage;
import java.util.ArrayList;
import java.util.Collections;
public class Array_list {
	public static void main(String[] args) {
		ArrayList<Integer> array_list = new ArrayList<>();
		array_list.add(100);
		array_list.add(500);
		array_list.add(200);
		array_list.add(150);
		ArrayList<Integer>  list2 = new ArrayList<>();
	    list2.add(34);
	    list2.add(1);
	    list2.add(89);
	    list2.add(34);
	    list2.add(-90);
	    Collections.sort(list2);
	    System.out.println(list2);
//	    ArrayList<Integer> list3 = new ArrayList<>();
	   array_list.addAll(list2);
	   System.out.println(array_list);
	   Collections.sort(array_list);
	   System.out.println(array_list);
	    
	}

}
