package recursion;

import java.util.ArrayList;

public class getboardpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ans=getbp(0,10);
		System.out.println(ans);
	}
	public static ArrayList<String> getbp(int cp,int ep)
	{
		if(cp==ep)
		{
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		if(cp>ep)
		{
			ArrayList<String> br=new ArrayList<String>();
			return br;
			
		}
		ArrayList<String> myres=new ArrayList<String>();
		
		for(int i=1;i<=6;i++)
		{ ArrayList<String> rr=getbp(cp+i, ep);
		
         for(int j=0;j<rr.size();j++)
         {
        	 myres.add(i+rr.get(j));
         }
        
			
		}
		 return myres;
	}

}
