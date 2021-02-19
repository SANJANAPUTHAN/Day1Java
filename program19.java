package Programs;

import java.util.Scanner;

public class program19 {
	static int[][] reversecolumn(int a[][],int row,int column)
	{
		int b[][]=new int[row][column];
		int k=0;
		for(int i=0;i<row;++i)
		{
			k=0;
			for(int j=column-1;j>=0;--j)
			{
				b[i][k++]=a[i][j];
			}
		}
		return b;
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int column=sc.nextInt();
	int a[][]=new int[row][column];
	for(int i=0;i<row;++i)
	{
		for(int j=0;j<column;++j)
		{
			a[i][j]=sc.nextInt();
		}
	}
	a=reversecolumn(a,row,column);
	for(int i=0;i<row;++i)
	{
		for(int j=0;j<column;++j)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}
