package lecture10;

public class recursion_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//decinc(5);
		//p2(5);
		//int[] array={1,2,3,1,2,3,1,2,3};
		//bubblesort(array,4,0,1);
		//System.out.println(checksort(array));
		//System.out.println(find(array,111));
		//for(int i=0;i<5;i++)
			//System.out.print(array[i]+" ");
		//printp(100,1,1);
		//pastri(7,0,0,1);
		//ss(array,1,1);
		//int[] a=retallindex(array,3,0,0);
		//for(int i=0;i<a.length;i++)
		//System.out.print(a[i]+" ");
		//boarddiceperm(10,0,0,0);
		int[] arr=new int[11];
		System.out.println(boarddiceperm(10,0,arr,0));
		//int[] arr2=prime(20,0);
		//for(int i=0;i<arr2.length;i++)
			//System.out.print(arr2[i]+" ");
		//System.out.println(bpath(10,0,prime(10,0)));
	}
	public static void decinc(int num)
	{
		if(num==0)
			return;
		System.out.println(num);
		decinc(--num);
		System.out.println(num);
	}
	public static void p2(int num)
	{
		if(num==0)
			return;
		if(num%2==1)
		System.out.println(num);
		decinc(--num);
		if(num%2==0)
		System.out.println(num);
	}
	public static void bubblesort(int[] array,int n,int i,int j)
	{
		if(n==0)
			return;
		if(j>n)
		{
			bubblesort(array,n-1,0,1);
			return;
		}
		if(array[i]>array[j])
		{
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		}
		bubblesort(array,n,i+1,j+1);
	}
	
	public static boolean checksort(int[] array)
	{
		if(array.length==1)
			return true;
		if(array[0]>array[1])
		{
			return false;
		}
		else
		{
			int[] narr=new int[array.length-1];
			for(int i=1;i<array.length;i++)
			{
				narr[i-1]=array[i];
			}
			return checksort(narr);
		}
	}
	public static boolean find(int[] array,int n)
	{
		if(array.length==0)
			return false;
		if(array[0]==n)
			return true;
		else
		{
			int[] narr=new int[array.length-1];
			for(int i=1;i<array.length;i++)
			{
				narr[i-1]=array[i];
			}
			return find(narr,n);
		}
	}
	public static void printp(int n,int r,int c)
	{
		if(r>n)
			return;
		if(r<c)
		{
			System.out.println();
			printp(n,r+1,1);
			return;
		}
		System.out.print("* ");
		printp(n,r,c+1);
	}
	
	public static void pastri(int n,int r,int c,int value)
	{
		if(r==n)
			return;
		if(r<c)
		{
			System.out.println();
			pastri(n,r+1,0,1);
			return;
		}
		System.out.print(value+" ");
		if(r==c-1)
			value=1;
		else
		value=value*(r-c)/(c+1);
		pastri(n,r,c+1,value);
	}
	
	public static void ss(int[] array,int counter,int i)
	{
		if(counter==array.length)
		{
			return;
		}
		if(array.length==i)
		{
			ss(array,counter+1,counter+1);
			return;
		}
		if(array[i]<array[counter-1])
		{
			int temp=array[counter-1];
			array[counter-1]=array[i];
			array[i]=temp;
		}
		ss(array,counter,i+1);
		
	}
	public static int[] retallindex(int[] array,int num,int si,int counter)
	{
		if(si==array.length)
		{
			int[] in=new int[counter+1];
			return in;
		}
		if(num==array[si])
		{
			counter++;
		}
		int[] arr=retallindex(array,num,si+1,counter);
		if(array[si]==num)
		{
			arr[counter]=si;
			counter--;
		}
		return arr;
	}
	
	public static int boarddiceperm(int size ,int current)
	{
		if(size<current)
		{
			return 0;
		}
		if(size==current)
			return 1;
		return boarddiceperm(size,current+1)+boarddiceperm(size,current+2)+boarddiceperm(size,current+3)
		+boarddiceperm(size,current+4)+boarddiceperm(size,current+5)+boarddiceperm(size,current+6);
	}
	public static int boarddiceperm(int size ,int current ,int[] array ,int index)
	{
		if(index!=0)
		array[index]=current;
		else
		array[index]=current;
		if(size<current)
		{
			return 0;
		}
		if(size==current)
			{
				for(int i=1;i<=index;i++)
					System.out.print(array[i]-array[i-1]+" ");
				System.out.println();
				return 1;
			}
		return boarddiceperm(size,current+1,array,index+1)+boarddiceperm(size,current+2,array,index+1)
		+boarddiceperm(size,current+3,array,index+1)
		+boarddiceperm(size,current+4,array,index+1)+boarddiceperm(size,current+5,array,index+1)
		+boarddiceperm(size,current+6,array,index+1);

	}
	public static boolean isprime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int[] prime(int n,int counter)
	{
		if(n==1)
		{
			int[] array=new int[counter+1];
			return array;
		}
		int flag=1;
		for(int i=2;i<n/2;i++)
		{
			flag=i;
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		int arr[];
		if(flag!=0)
		{
			arr = prime(n-1,counter+1);
			arr[counter]=n;
			counter--;
		}
		else
		{
			arr = prime(n-1,counter);
		}
		
		return arr;
	}
	public static int bpath(int n,int fn,int[] array)
	{
		if(n<fn)
		{
			return 0;
		}
		if(n==fn)
			return 1;
		if(isprime(fn)==true)
		{
			for(int i=array.length-1;i>=(array.length-1)/2;i--)
			{
				if(array[i]==fn)
				{
					fn=fn+array[0+array.length-i-2];
				}
			}
		}
		if(n==fn)
			return 1;
		
		return bpath(n,fn+1,array)+bpath(n,fn+2,array)+bpath(n,fn+3,array)
		+bpath(n,fn+4,array)+bpath(n,fn+5,array)+bpath(n,fn+6,array);
	}
}
