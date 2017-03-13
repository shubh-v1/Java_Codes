package lecture7;

import java.util.Scanner;

public class array2d {

	public static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]array=takeinput();
		//display(array);
		//System.out.println("******************");
		//waveprint(array);
		System.out.println("******************");
		spiralprint(array);

	}
	public static int[][] takeinput(){
		int[][] retval=null;
		System.out.println("Enter the number of rows : ");
		retval=new int[reader.nextInt()][];
		for(int i=0;i<retval.length;i++)
		{
			System.out.println("Enter the number of columns in "+i+" row :");
			retval[i]=new int[reader.nextInt()];
			for(int j=0;j<retval[i].length;j++)
			{
				System.out.println("Enter the value for "+j+" column : ");
				retval[i][j]=reader.nextInt();
			}
		}
		return retval;
	}
	public static void display(int[][] array){
		if(array==null)
			{
			System.out.println("No rows No columns ");
			return;
			}
		else
		{
			for(int i=0;i<array.length;i++)
			{
				if(array[i]==null)
					System.out.println("Blank row");
				else
				{
					for(int j=0;j<array[i].length;j++)
					{
						System.out.print(array[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
		
	}
	public static void waveprint(int[][] array)
	{
		int flag=0;
		for(int i=0;i<array.length;i++)
		{
			if(flag==0)
			{
				for(int j=0;j<array[i].length;j++)
					{
					System.out.print(array[j][i]+" ");
					}
			}
			if(flag==1)
			{
				for(int j=array[i].length-1;j>=0;j--)
				{
				System.out.print(array[j][i]+" ");
				}
			}
			flag=1-flag;
			System.out.println();
		}
	}
	public static void spiralprint(int[][] array)
	{
		int mincol=0,minrow=0,maxrow=array.length-1,maxcol=array[0].length-1;
		int counter=array.length*array[0].length;
		while(counter>0)
		{
			for(int i=minrow;i<=maxrow;i++)
			{
				System.out.println(array[i][mincol]);
				counter--;
			}
			mincol++;
			for(int i=mincol;i<=maxcol;i++)
			{
				System.out.println(array[maxrow][i]);
				counter--;
			}
			maxrow--;
			for(int i=maxrow;i>=minrow;i--)
			{
				System.out.println(array[i][maxcol]);
				counter--;
			}
			maxcol--;
			for(int i=maxcol;i>=mincol;i--)
			{
				System.out.println(array[minrow][i]);
				counter--;
			}
			minrow++;
		}
	}
}
