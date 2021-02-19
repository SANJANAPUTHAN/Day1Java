package Programs;
public class program15 {
	static int checkPrime(int n)
	{
		if(n==1)
		{
			return -1;
		}
		if(n==2)
		{
			return 2;
		}
		for(int i=2;i<n/2;++i)
		{
			if(n%i==0)
			{
				return -1;
			}
		}
		return n;
	}
	public static void main(String[] args) {
		for(int i=1;i<=100;++i)
		{
			if(checkPrime(i)!=-1)
			{
				System.out.println(i);
			}
		}
	}
}
