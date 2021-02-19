package Programs;

public class Program3 {
	public static void main(String[] args) {
		boolean b=true;
		int i=100;
		long l;
		float f;
		l=i;
		f=l;
		System.out.println("Widening type conversion...");
		System.out.println("Integer value : "+i);
		System.out.println("Long value : "+l);
		System.out.println("float value : "+f);
		char ch='a';
		int num=100;
		ch=(char)num;
		System.out.println("Narrowing conversion...");
		System.out.println("character value :"+ch);
		System.out.println("integer value"+ num);
		System.out.println("Data loss during conversion");
		double d=21.47;
		long l1=(long)d;
		int i1=(int)l1;
		System.out.println("double value "+d);
		System.out.println("long value "+l1);
		System.out.println("integer value : "+i1);
		}
}
