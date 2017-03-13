package LECTURE5;

import java.util.Scanner;

public class assignment2q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the number : ");
		double num=reader.nextDouble();
		System.out.println("Enter the precision : ");
		int pre=reader.nextInt();
		double sqrt=0;
		for(int i=0;i<num/2+1;i++)
		{
			if(i*i==num)
			{
				sqrt=i;
				break;
			}
			if(i*i<num)
				continue;
			if(i*i>num)
			{
				//System.out.println(i);
				sqrt=i-1;
				double temp=sqrt;
				double div=1;
			
				while(pre>0)
				{
					int flag=0;
					div=div*10;
					for(int j=1;j<10;j++)
					{
						//System.out.println(sqrt+j/div);
						if((sqrt+j/div)*(sqrt+j/div)==num)
						{
							//System.out.println("here");
							sqrt=sqrt+j/div;
							flag=1;
							break;
						}
							if((sqrt+j/div)*(sqrt+j/div)<num)
							continue;
						if((sqrt+j/div)*(sqrt+j/div)>num)
						{
							sqrt=sqrt+(j-1)/div;
							break;
						}
					}
					pre--;
					if(flag==1)
						break;
				}
			}
		}
		System.out.println(sqrt);

}
}
