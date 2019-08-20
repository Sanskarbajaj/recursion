package recursion;

public class lastIndexarraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,3,4,5,4,7};
	int asn=	lastindex(arr, 0, 4);
		System.out.println(asn);

	}
	public static int lastindex(int[] arr,int i,int data)
	{
		if(i==arr.length)
		{
			return -1;
		}
		int index=lastindex(arr, i+1, data);
		if(index==-1)
		{
			if(data==arr[i])
			{
				return i;
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return index;
		}
		
		
	}

}
