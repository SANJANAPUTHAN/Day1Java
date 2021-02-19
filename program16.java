package Programs;

import java.util.Scanner;

public class program16 {
	static int[] searchIndex(int arr[],int n,int key)
	{
		int[] a=new int[2];
		int count=0;
		for(int i=0;i<n;++i)
		{
			if(arr[i]==key)
			{
				a[0]=i+1;
				break;
			}
		}
		if(a[0]==0)
		{
			return a;
		}
		for(int i=0;i<n;++i)
		{
			if(arr[i]==key)
			{
				count++;
			}
		}
		a[1]=count;
		return a;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;++i)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key");
		int key=sc.nextInt();
		int a[]=new int[2];
		a=searchIndex(arr,n,key);
		System.out.println(a[0]+" "+a[1]);
	}
}
