package lecture4;

import java.util.Scanner;

public class f_to_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the minimum fahrenheight temperature");
		int minf=reader.nextInt();
		int maxf=reader.nextInt();
		int interval=reader.nextInt();
		for(int i=minf;i<=maxf;i=i+interval)
		{
			int result=(i-32)*5/9;
			System.out.println(i+"\t"+result);
		}

	}

}
