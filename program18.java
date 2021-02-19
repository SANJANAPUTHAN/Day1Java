package Programs;

import java.util.HashMap;
import java.util.Scanner;

public class program18 {
	static int reversenumber(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=(rev*10)+(n%10);
			n=n/10;
		}
		return rev;
	}
	static String wordsTonumbers(int rev)
	{
		String temp="";
		HashMap<Integer,String> map=new HashMap<>();
		map.put(0, "zero");
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		while(rev!=0)
		{
			int t=rev%10;
			temp=temp+map.get(t);
			temp=temp+" ";
			rev=rev/10;			
		}
		return temp;
	}
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rev=reversenumber(num);
	String str=wordsTonumbers(rev);
	System.out.println(str);
}
}
