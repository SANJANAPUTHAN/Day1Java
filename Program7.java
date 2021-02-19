package Programs;

import java.util.Scanner;

public class Program7 {
	static int[] sort_ascending(int a[],int n)
	{
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	static int[] sort_descending(int a[],int n)
	{
		for(int i=0;i<n;++i)
		{
			for(int j=0;j<n;++j)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;++i)
		{
			a[i]=sc.nextInt();
		}
		b=sort_ascending(a,n);
		System.out.println("Ascending order");
		for(int i=0;i<n;++i)
		{
			System.out.println(b[i]);
		}
		b=sort_descending(a,n);
		System.out.println("descending order");
		for(int i=0;i<n;++i)
		{
			System.out.println(b[i]);
		}
	}
}
