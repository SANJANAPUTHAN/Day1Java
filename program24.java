package Programs;

import java.util.Scanner;

public class program24 {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter the values of a,b,c");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	quadratic q=new quadratic(a,b,c);
	q.setValues(q);
	System.out.println(q.calculate());
}
}
