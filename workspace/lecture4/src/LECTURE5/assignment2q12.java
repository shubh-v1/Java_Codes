package LECTURE5;

import java.util.Scanner;
//integral square root of a number
public class assignment2q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=reader.nextInt();
		for(int i=0;i<num/2+1;i++)
		{
			if(i*i<num)
				continue;
			if(i*i==num)
			{
				System.out.println("Square root of num is "+i);
				break;
			}
			if(i*i>num)
			{
				System.out.println("Square root of num is "+(i-1));
				break;
			}
		}
		

	}

}
