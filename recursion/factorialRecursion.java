package recursion;

public class factorialRecursion {

	public static void main(String[] args) {
	int ans=	factorial(3);
		System.out.println(ans);
	}
	public static int factorial(int n)
	{
		if(n<1)
		{
			return 1;
		}
		int ans=factorial(n-1);
		int myans=ans*n;
		return myans;
		
	}

}
