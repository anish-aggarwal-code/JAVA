package firstPackage;

public class chocolates {
	public static void main(String[] args) {
		int count = countChocolates(15,0,1,3,0);
		System.out.println(count);
		
	}
	public static int countChocolates(int money,int wrappers, int price, int wrap,int number)
	{
		if(wrappers<wrap && money <= 0 )
		{
			return number;
		}
		if(money>0)
		{
		return countChocolates(money-price,wrappers+1,price,wrap,number+1);
		
		
		}
		if(money<=0 && wrappers>0)
		{
			return countChocolates(money,wrappers-wrap+1,price,wrap,number+1);
			
		}
		return number;
	}

}
