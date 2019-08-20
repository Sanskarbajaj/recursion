package recursion;

public class firstindexArraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
	int ans=	firstindex(arr, 0, 9);
System.out.println(ans);
	}
 
	public static int firstindex(int[] arr,int i,int data)
	{  
	  int ans=0;
		if(i==arr.length)
		{
			return -1;
		}
		if(data==arr[i])
		{
			return i;
		}
		else
		{
			 ans=firstindex(arr, i+1, data);
		}
		return ans;
	}
}
