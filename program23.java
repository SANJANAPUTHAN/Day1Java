package Programs;

public class program23 {
public static void main(String[] args) {
	protectedData p=new protectedData();
	p.a=p.a+10;
	System.out.print(p.a);
}
}
class protectedData
{
	protected int a=10;
}