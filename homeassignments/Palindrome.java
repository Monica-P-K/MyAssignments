package homeassignments;

public class Palindrome {
	public static void main(String[] args) {
	int input=121;
	int output=0,rem;
	int temp=input;
	
	while(input>0)
	{
		rem=input%10;                     
		output=(output*10)+rem;           
		input=input/10;                   
	}
	if(temp==output)
	{
		System.out.println("It is a Pallindrome");
	}
	else
	{
		System.out.println("It is not a Pallindrome");
	}
	
	
	}
}
