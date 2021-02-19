package Programs;

import java.util.Scanner;

public class program20 {
	static void greatestElement(int a[][],int row,int column)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<row;++i)
		{
			max=Integer.MIN_VALUE;
			for(int j=0;j<column;++j)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
			System.out.println(max);
		}
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
	greatestElement(a,row,column);
}
}
