package recursion;

public class simplerecursion {

	public static void main(String[] args) {
		
		pdiskip(5);
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
	public static void incredecre(int n)
	{
		if(n<0)
		{
			return;
		}
		System.out.println(n);
		incredecre(n-1);
		System.out.println(n);
	}
	public static void pdiskip(int n)
	{
		if(n<=0)
		{
			return;
		}
		if(n%2!=0)
		{
			System.out.println(n);
		}
		pdiskip(n-1);
		if(n%2==0)
		System.out.println(n);
	}
	
}
