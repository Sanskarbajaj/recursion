package recursion;

public class simplerecursion {

	public static void main(String[] args) {
		
		decreasing(5);
		increasing(5);
	}
	public static void decreasing(int n)
	{
		if(n<0)
		{
			return;
		}
		System.out.println(n);
		decreasing(n-1);
	}
	public static void increasing(int n)
	{
		if(n<0)
		{
			return;
		}
		increasing(n-1);
		System.out.println(n);
		
	}
	
}
