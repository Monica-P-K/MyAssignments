package homeassignments;

public class IsPrime {

	public static void main(String[] args) {
		int n=29;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				System.out.println("It is a non-prime number");
				break;
			}
			else
			{
				System.out.println("It is a prime number");
				break;
			}			
		}
	}
}
