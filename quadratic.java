package Programs;

public class quadratic {
	private int a;
	private int b;
	private int c;
	quadratic()
	{
		this.a=1;
		this.b=1;
		this.c=1;
	}
	quadratic(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void setValues(quadratic q)
	{
		this.a=q.a;
		this.b=q.b;
		this.c=q.c;
	}
	public int getValueA()
	{
		return this.a;
	}
	public int getValueB()
	{
		return this.b;
	}
	public int getValueC()
	{
		return this.c;
	}
	public String calculate()
	{
		String temp="";
		temp=getValueA()+"x^2+"+getValueB()+"x+"+getValueC();
		return temp;
	}
}
