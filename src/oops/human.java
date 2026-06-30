package oops;

public class human {
	String name;
	int age;
	 int salary;
	  boolean dieSomeday = true;
	   static int population=0;
	 public human(String name, int age, int salary, boolean dieSomeday)
	 {
		 this.name = name.toUpperCase();
		 this.age = age;
		 this.salary = salary;
		 this.dieSomeday = true;
		 population =  population+1;
		
		 
		 
	 }

}
