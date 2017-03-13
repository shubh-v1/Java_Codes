package lecture4;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to inverse");
		Scanner reader=new Scanner(System.in);
		int a=reader.nextInt();
		int temp=a,n=0,rem;
		System.out.println(a);
		while(temp!=0)
		{
			n++;
			temp=temp/10;
		}
		
		System.out.println(n);
		temp=a;
		int array[]=new int[n];
		for(int i=n;i>0;i--)
		{
			rem=temp%10;
			array[rem-1]=i;
			temp=temp/10;
		}
		for(int i=0;i<n;i++)
			System.out.print(array[i]);

	}

}
