package Exception;

class NegativeDimensionException extends Exception
{
	public String toString()
	{
		return "Dimesions of a Rectangle can not be negative";
	}
}



public class ThrowThrowsDemo2 {
	
	static int area(int l, int b) throws NegativeDimensionException
	{
		if(l<0||b<0)
			throw new NegativeDimensionException();
		return l*b;
		
	}
	
	
	static void meth1() throws NegativeDimensionException
	{
		System.out.println(area(-10,5));
	}
	

	public static void main(String[] args) {
	
try {
	meth1();
} catch (NegativeDimensionException e) {
	// TODO Auto-generated catch block
	System.out.println(e);
}
	}

}


// if the exception comes to main then it will be handled by jvm and program crashes.

//Exception in thread "main" java.lang.Exception
//at ThrowThrowsDemo2.area(ThrowThrowsDemo2.java:6)
//at ThrowThrowsDemo2.meth1(ThrowThrowsDemo2.java:14)
//at ThrowThrowsDemo2.main(ThrowThrowsDemo2.java:20)

//hence we handle by try cath at main


// we can define our own class for exception so will remove Exception