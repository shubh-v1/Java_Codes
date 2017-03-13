package lecture8;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int binarysearch(int[] array,int key)
	{
		int start=0,end=array.length-1,mid=(start+end)/2;
		while(start<=end)
		{
			if(array[mid]==key)
				return mid;
			if(array[mid]<key)
			{
				start=mid;
				mid=(start+end)/2;
			}
			if(array[mid]>key)
			{
				end=mid;
				mid=(start+end)/2;
			}
		}
		return -1;
	}

}
