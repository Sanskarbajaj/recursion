package recursion;

import java.util.ArrayList;

public class getmazepath {

	public static void main(String[] args) {
ArrayList<String> ans=getmazepath(0,0,2,2);
System.out.println(ans);

	}
	public static ArrayList<String> getmazepath(int cr,int cc,int er,int ec)
	{
		if(cr==er&&cc==ec)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		if(cr>er||cc>ec)
		{
			ArrayList<String> br=new ArrayList<String>();
			return br;
		}
		ArrayList<String> myres=new ArrayList<String>();
		ArrayList<String> rrh=getmazepath(cr, cc+1, er, ec);
		for(int i=0;i<rrh.size();i++)
		{
			myres.add("H"+rrh.get(i));
		}
		ArrayList<String>rrv=getmazepath(cr+1, cc, er, ec);
		for(int i=0;i<rrv.size();i++)
		{
			myres.add("V"+rrv.get(i));
		}
		return myres;
	}

}
