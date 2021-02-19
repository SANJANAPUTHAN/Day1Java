package Programs;

import java.util.Scanner;

public class program_15b {
	static String checkArmstrong(int n)
	{
		int total=0;
		int temp=n;
		while(n!=0)
		{
			int rem=n%10;
			total+=(rem*rem*rem);
			n=n/10;
		}
		if(total==temp)
		{
			return "Armstrong";
		}
		else
		{
			return "Non-Armstrong";
		}
	}
	static String checkPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n-1;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			return "Perfect number";
		}
		else
		{
			return "Non-Perfect number";
		}
	}
	static String checkPalindrome(int n)
	{
		String temp="";
		int t=n;
		while(n!=0)
		{
			temp=temp+String.valueOf(n%10);
			n=n/10;
		}
		int random=Integer.parseInt(temp);
		if(random==t)
		{
			return "Palindrome";
		}
		else
		{
			return "Not-Palindrome";
		}
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(checkArmstrong(num));
		System.out.println(checkPerfect(num));
		System.out.println(checkPalindrome(num));
	}

}
