package Programs;

import java.util.Scanner;

public class program21 {
	static int checkLeapyear(int year)
	{
		if(year%4==0)
		{
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	String str=new String();
	str=sc.nextLine();
	if(str!=null)
	{
	switch(str)
	{
	case "January":
		System.out.println("31 days");
		break;
	case "February":
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if(checkLeapyear(year)==1)
		{
		System.out.println("29 days");
		}
		else
		{
			System.out.println("28 days");
		}
		break;
	case "March":
		System.out.println("31 days");
		break;
	case "April":
		System.out.println("30 days");
		break;
	case "May":
		System.out.println("31 days");
		break;
	case "June":
		System.out.println("30 days");
		break;
	case "July":
		System.out.println("31 days");
		break;
	case "August":
		System.out.println("31 days");
		break;
	case "September":
		System.out.println("30 days");
		break;
	case "October":
		System.out.println("31 days");
		break;
	case "November":
		System.out.println("30 days");
		break;
	case "December":
		System.out.println("31 days");
		break;
	}
	}
	}
}
