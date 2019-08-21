package recursion;

import java.util.ArrayList;

public class printboardpath {

	public static void main(String[] args) {
		printbp(0, 10, "");
	
	}
	public static void printbp(int cp,int ep,String res)
	{
		if(cp==ep)
		{
			System.out.println(res);
			return;
		}
		if(cp>ep)
		{
			return ;
		}
		for(int i=1;i<=6;i++)
		{
			printbp(cp+i, ep,res+i);
		}
		
	}

}
