package oops;

public class acessingClasses {
	public static void main(String[] args) {
		human h1 = new human("Anish",20,100000,true);
		human h2 = new human("amit",20,1000000,false);
		human h3 = new human("rahul",35,1300000,true);

		System.out.println(human.population);

	}

}
