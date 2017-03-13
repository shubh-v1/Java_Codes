package lecture4;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		int num=reader.nextInt();
		int temp=num,newnum=0;
		while(temp!=0)
		{
			int mul=temp%10;
			newnum=(mul)*(mul)*(mul)+newnum;
			temp=temp/10;
		}
		if(newnum==num)
			System.out.println("armstrong number");
		else
			System.out.println("not an armstrong number");
	}

}
