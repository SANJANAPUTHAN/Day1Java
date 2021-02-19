package Programs;

import java.util.Scanner;

public class Program5 {
	static int average(int n,int arr[])
	{
		int total=0,avg=0;
		for(int i=0;i<n;++i)
		{
			total+=arr[i];
		}
		avg=total/n;
		return avg;
	}
	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Average of n numbers is : "+average(n,arr));
	}
}
