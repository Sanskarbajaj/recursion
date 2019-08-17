package recursion;

public class nthfibonacci {

	public static void main(String[] args) {
		
 System.out.println(fibbonacci(5));
	}
public static int fibbonacci(int n)
{
	if(n==0)
	{
		return 0;
	}
	if(n==1)
	{
		return 1;
	}
	int f=fibbonacci(n-1);
	int s=fibbonacci(n-2);
	int myres=f+s;
	return myres;
}
}
