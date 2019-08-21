package recursion;

import java.util.ArrayList;

public class printmazepath {

	public static void main(String[] args) {

getmazepath(0 ,0, 2,2,"");
	}
	public static void getmazepath(int cr,int cc,int er,int ec,String res)
	{
		if(cr==er&&cc==ec)
		{
			System.out.println(res);
		}
		if(cr>er||cc>ec)
		{
			
			return ;
		}

		getmazepath(cr, cc+1, er, ec,res+"H");
		getmazepath(cr+1, cc, er, ec,res+"V");
	}

}
