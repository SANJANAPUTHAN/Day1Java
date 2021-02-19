package Programs;

import java.util.Scanner;

public class Program8 {
	static int index(int a[],int n,int key)
	{
		for(int i=0;i<n;++i)
		{
			if(a[i]==key)
			{
				return i+1;
			}
		}
		return -1;
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
		System.out.println("Enter key");
		int key=sc.nextInt();
		System.out.println("Index of element in the array : "+index(a,n,key));
	}
}
