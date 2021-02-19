package Programs;

public class accessmodifiers
{
	public    int a;
	private   int b;
	protected int c;
              int d;
    
	public void method()
	{
		System.out.println("Public method called!");
	}
	private void method1()
	{
		System.out.println("Private method called!");
	}
	protected void method2()
	{
		System.out.println("Protected method called!");
	}
	void method4()
	{
		System.out.println("Default method called!");
	}
}


