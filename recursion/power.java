package recursion;

public class power {

	public static void main(String[] args) {
	int ans=power(2,1);
System.out.println(ans);
	}
	public static int power(int x,int y)
	{
		if(y<=0)
		{
			return 1;
		}
		int recresult=power(x, y-1);
		int myres=x*recresult;
		return myres;
	}

}
