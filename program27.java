package Programs;

public class program27 {
	public static void main(String[] args) {
		float amount=14000;
		amount+=((float)(40)/(float)(100))*amount;
		System.out.println("Amount after first year  : "+amount);
		amount=amount-1500;
		System.out.println("Amount after second year : "+amount);
		amount+=((float)(12)/(float)(100))*amount;
		System.out.println("Amount after third year  : "+amount);
	}
}
