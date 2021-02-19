package Programs;

import java.util.Scanner;

public class Program9 {
	static int[] reverse(int a[],int n)
	{
		for(int i=n-1;i>=0;--i)
		{
			for(int j=i;j>=0;--j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int a[]=new int[n];
		for(int i=0;i<n;++i)
		{
			a[i]=sc.nextInt();
		}
		a=reverse(a,n);
		System.out.println("reverse order");
		for(int i=0;i<n;++i)
		{
			System.out.println(a[i]);
		}
	}
}

