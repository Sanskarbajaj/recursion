package recursion;

public class printmazepathwithdiagnal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		getmazepath(cr+1, cc+1, er, ec,res+"D");
	}
}
