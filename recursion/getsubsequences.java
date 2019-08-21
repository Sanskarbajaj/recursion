package recursion;

import java.util.ArrayList;

public class getsubsequences {

	public static void main(String[] args) {
		String str="abc";
		ArrayList<String> ans=getss(str);
System.out.println(ans);
	}
	public static ArrayList<String> getss(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> br=new ArrayList<String>();
			 br.add(" ");
			 return br;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myres=new ArrayList<String>();
		ArrayList<String> rr=getss(ros);
		for(int i=0;i<rr.size();i++)
		{
			myres.add(rr.get(i));
			myres.add(cc+rr.get(i));
		}
		return myres;
		
		
		
		
	}

}
