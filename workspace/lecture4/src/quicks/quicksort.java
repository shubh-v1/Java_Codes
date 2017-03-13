package quicks;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]={25,12,43,1,23,78};
		//quicksorting(arr,0,5);
		//for(int i=0;i<arr.length;i++)
			//System.out.print(arr[i]+" ");
		System.out.println(power(9,3));
	}
	public static void quicksorting(int[] array,int lo,int hi)
	{
		if(lo>=hi)
			return;
		int mid=(lo+hi)/2;
		int pivot=array[mid];
		int right=hi;
		int left=lo;
		while(left<=right)
		{
			while(array[left]<pivot)
			{
				left++;
			}
			while(array[right]>pivot)
			{
				right--;
			}
			
			if(left<=right){
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			left++;
			right--;
			}
		}
		quicksorting(array,lo,right);
		quicksorting(array,left,hi);
	}
	public static int power(int x,int y)
	{
		int res=1;
		while(y!=0)
		{
			if((y%2==1))
				res=res*x;
			x=x*x;
			y=y>>>1;
			
		}
		return res;
	}

}
