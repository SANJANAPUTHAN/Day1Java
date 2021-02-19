package Programs;

import java.util.Scanner;

public class Program4 {
	static String primeNumber(int num)
	{
		if(num==1)
		{
			return "not prime";
		}
		for(int i=2;i<num/2;++i)
		{
			if(num%i==0)
			{
				return "Not prime";
			}
		}
		return "Prime";
	}
	public static void main(String[] args) {
		int num;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("The given number is : "+primeNumber(num));
	}
}
