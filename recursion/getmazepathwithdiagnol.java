package recursion;

import java.util.ArrayList;

public class getmazepathwithdiagnol {

	public static void main(String[] args) {
	
		ArrayList<String> ans=getmpwd(0, 0, 2, 2);
		System.out.println(ans);

	}
	public static ArrayList<String> getmpwd(int cr,int cc,int er,int ec)
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
		 ArrayList<String> rrh=getmpwd(cr, cc+1, er, ec);
		 for(int i=0;i<rrh.size();i++)
		 {
			 myres.add("H"+rrh.get(i));
		 }
		 ArrayList<String>  rrv=getmpwd(cr+1, cc, er, ec);
		 for(int i=0;i<rrv.size();i++)
		 {
			 myres.add("V"+rrv.get(i));
		 }
		 ArrayList<String> rrd=getmpwd(cr+1, cc+1, er, ec);
		 for(int i=0;i<rrd.size();i++)
		 {
			 myres.add("D"+rrd.get(i));
		 }
		 return myres;
	}

}
