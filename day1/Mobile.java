package week1.day1;

public class Mobile {
	public void makeCall(String mobileModel,float mobileWeight)
	{
		System.out.println("Hi");
	}
	public void sendMsg(boolean isFullCharged,int mobileCost)
	{
		System.out.println("Welcome to Java");
	}
    public static void main(String[] args) 
    {
    	Mobile obj=new Mobile();
    	obj.makeCall("Samsung", 10.11f);
    	obj.sendMsg(true, 100000);
    	System.out.println("This is my mobile");
	}
}
