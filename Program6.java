package Programs;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		int n=5;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a[]=new int[n];
		for(int i=0;i<n;++i)
		{
			System.out.println("Array before resizing : "+a[i]);
		}
		System.out.println("Enter new array size");
		n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<n;++i)
		{
			System.out.println("Array after resizing : "+a[i]);
		}
	}
}
