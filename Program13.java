package Programs;

import java.util.Scanner;

public class Program13 {
	static void calculateResult(int marks[][],int n)
	{
		int total=0;
		float avg=0;
		for(int i=0;i<n;i++)
		{
			total=0;
			for(int j=0;j<5;j++)
			{
				total+=marks[i][j];
			}
			avg=(float)total/(float)5;
			System.out.println("Average of "+(i+1)+" person is : "+ avg);
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n=sc.nextInt();
		int marks[][]=new int[n][5];
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<5;++j)
			{
				marks[i][j]=sc.nextInt();
			}
		}
		calculateResult(marks,n);		
	}
}
