package recursion;

public class printss {

	public static void main(String[] args) {
		String str="abc";
		String res="";
printss(str, res);
	}
	public static void printss(String str,String res)
	{
		if(str.length()==0)
		{    
			System.out.print(res+" , ");
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printss(ros,res);
		printss(ros, res+cc);
		
	}

}
