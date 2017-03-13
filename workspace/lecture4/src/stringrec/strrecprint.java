package stringrec;

import java.util.ArrayList;

public class strrecprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subsequence("abc","");
		//for(int i=0;i<4;i++)
		//permutations("123","");
		//System.out.println(countmazepath(3,3,0,0));
		//int[] array={-25 ,- 20 , 40};
		//maxsum(array);
		//qq(array);
		//System.out.println(getmazepath(2,2,0,0));
		
		//helper(1000);
		//lexio2(1000,0);
		printNQueens(5);
	}
	public static void subsequence(String str,String osf)
	{
		if(str.length()==0)
		{
			System.out.println(osf);
			return;
		}
		char cc=str.charAt(0);
		str=str.substring(1);
		subsequence(str,osf);
		subsequence(str,osf+cc);
	}
	public static void permutations(String str,String osf)
	{
		if(str.length()==0)
		{
			System.out.println(osf);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			String ros=str.substring(0,i)+str.substring(i+1,str.length());
			permutations(ros,osf+str.charAt(i));
			
		}
	}
	public static int countmazepath(int endrow,int endcol,int currow,int curcol)
	{
		if(curcol==endcol&&endrow==currow)
			return 1;
		if(curcol>endcol||currow>endrow)
			return 0;
		return countmazepath(endrow,endcol,currow+1,curcol)+
				countmazepath(endrow,endcol,currow,curcol+1)+
				countmazepath(endrow,endcol,currow+1,curcol+1);
	}
	public static ArrayList<String> getmazepath(int endrow,int endcol,int currow,int curcol)
	{
		if(currow==endrow&&curcol==endcol)
		{
			ArrayList<String> baseresult = new ArrayList<>();
			baseresult.add("");
			return  baseresult;
		}
		if(curcol>endcol||currow>endrow)
		{
			ArrayList<String> baseresult = new ArrayList<>();
			return  baseresult;
		}
		
		ArrayList<String> myresult = new ArrayList<>();
		ArrayList<String> hresult = getmazepath(endrow,endcol,currow,curcol+1);
		ArrayList<String> vresult = getmazepath(endrow,endcol,currow+1,curcol);
		ArrayList<String> dresult = getmazepath(endrow,endcol,currow+1,curcol+1);
		
		for(int i=0;i<hresult.size();i++)
		{
			myresult.add("H"+hresult.get(i));
		}
		for(int i=0;i<vresult.size();i++)
		{
			myresult.add("V"+vresult.get(i));
		}
		for(int i=0;i<dresult.size();i++)
		{
			myresult.add("D"+dresult.get(i));
		}
		return myresult;
	}
	
	
	public static void maxsum(int[] array)
	{
		int sum=0,max=-9999,sin=0,lin=0;
		for(int i=0;i<array.length;i++)
		{
			sum=array[i];
			
			if(max<sum)
			{
				sin=i;
				lin=i;
				max=sum;
			}
			for(int j=i+1;j<array.length;j++)
			{
				sum=sum+array[j];
				if(max<sum)
				{
					lin=j;
					max=sum;
				}
			}
		}
		System.out.println("starting : "+sin+ "ending" + lin);
	}

	
	public static void qq(int[] array)

	
	{
		int one=0,two=0,five=0,max=array[0];
		int dif;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
				max=array[i];
		}
		for(int i=0;i<array.length;i++)
		{
			dif=max-array[i];
			five=five+dif/5;
			dif=dif%5;
			two=two+dif/2;
			dif=dif%2;
			one=one+dif/1;
		}
		System.out.println(five + " " + two + " "+ one);
	}
	public static void helper(int n)
	{
		for(int i=1;i<=9;i++)
		lexio(n,i);
		return;
	}
	public static void lexio(int n,int osf)
	{
		if(osf<=n)
		{
			
			System.out.println(osf);
			for(int i=0;i<=9;i++)
			{
				lexio(n,osf*10+i);
			}
		}
		if(osf>n)
			return;
		
		
	}
	
	public static void lexio2(int n,int osf)
	{
		if(osf<=n)
		{
			
			System.out.println(osf);
			for(int k=1;k<=9;k++)
			for(int i=0;i<=9;i++)
			{
				lexio(n,k*10+i);
			}
		}
		if(osf>n)
			return;
		
		
	}
/*	public static boolean isitsafe(boolean arr[][],int row ,int col)
	{
		for(int i=row-1;i>=0;i--)
		{
			if(arr[i][col]==1)
				return false;
		}
		//for
	}*/
	public static int countqueens(boolean[][] board,int row)
	{
		if(row==board.length)
		{
			return 1;
		}
		
		for(int col=0;col<board[row].length;col++)
		{
		//	isitsafe(board ,row,col);
		}
		return 1;
	}
	//public static void afterwordlexico(String str,String ans)
	{
		
	}
	public static void printNQueens(boolean[][] board, int row, String osf) {
		if (row == board.length) {
			System.out.println(osf + "END");
			System.out.println();
			return;
		}

		for (int col = 0; col < board.length; col++) {
			if (isSafeTPQ(board, row, col)) {
				board[row][col] = true;
				String num="";
				for(int i=0;i<col;i++)
					num=num+"0";
				num=num+"1";
				for(int i=col+1;i<board.length;i++)
					num=num+"0";
				printNQueens(board, row + 1, osf +num+'\n');
				board[row][col] = false;
			}
		}
	}
	public static void printNQueens(int N) {
		boolean[][] board = new boolean[N][N];
		printNQueens(board, 0, "");
	}
	public static boolean isSafeTPQ(boolean[][] board, int row2test, int col2test) {
		// test column
		for (int row = row2test; row >= 0; row--) {
			if (board[row][col2test]) {
				return false;
			}
		}

		// test diag 1
		

		// test diag 2
		

		return true;
	}

}
