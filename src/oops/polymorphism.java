package oops;

public class polymorphism {
	public static void main(String[] args) {
		float volume = volume(3,2);
		System.out.println(volume);
	}
	public static float volume(int side)//cube
	{
		float volume = side*side*side;
		return volume;
	}
	public static float volume(int l,int b,int h) //cuboid
	{
		float volume = l*b*h;
		return volume;
	}
	public static float volume(int r,int h)//cone
	{
		float volume = (1f/3)*(22f/7)*(r*r)*h;
		return volume;
	}
	

}
