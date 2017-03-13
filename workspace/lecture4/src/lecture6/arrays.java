package lecture6;

//import java.util.ArrayList;
import java.util.Scanner;


public class arrays {

	public static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = takeinput();
		display(array);
		//subset(array);
		//reverse(array);
		//display(array);
		//System.out.println(max(array));
		//System.out.println(linearsearch(array,5));
	//	permutations(array);
	}

	public static int[] takeinput() {
		int[] retval;
		System.out.println("Enter the number of elements : ");
		int n = reader.nextInt();
		retval = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the elements : ");
			retval[i] = reader.nextInt();
		}
		return retval;
	}

	public static void display(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}

	}

	public static void subset(int[] array)
	{
		int n=array.length;
		long num=1<<n;
		for(int i=0;i<num;i++)
		{
			long temp=i,rev=1,bin=0;
			while(temp!=0)
			{
				rev=rev*10+(temp%2);
				temp=temp/2;
			}
			while(rev/10!=0)
			{
				bin=bin*10+(rev%10);
				rev=rev/10;
			}
			System.out.println("-->"+bin+"<--");
			for(int j=0;j<n;j++)
			{
				if(bin%10==1)
					System.out.print(array[j]+", ");
				bin=bin/10;
			}
			System.out.println(" ");
		}
	}
	public static int max(int[] array)
	{
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		return max;
	}
	public static int linearsearch(int[] array , int key)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
				return i;
		}
		return -1;
	}
	public static void reverse(int[] array)
	{
		int n=array.length;
		int[] newarray=new int[n];
		for(int i=0;i<n;i++)
		{
			newarray[i]=array[n-i-1];
		}
		for(int i=0;i<n;i++)
		{
			array[i]=newarray[i];
		}
	}
	
	
}
