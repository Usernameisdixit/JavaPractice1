package Exception;
// checked(super class is exception) and unchecked exception(super class is runtime exception)
// checked are compile time i/o, Interrupted exception(Thread.sleep() surround it with try/catch),sql exception(primary key us unique or connection issue) https://www.softwaretestinghelp.com/jdbc-exception-handling/
// unchecked are at run time arithmatic,nullpointer,arrayindexoutofbound
class LowBalanceException extends Exception //we can also extend Throwable as it is super class
{
	public  String toString()
	{
		return "balance should not be less than 5000";
	}
}

public class ExceptionHandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int balance =10000;
			System.out.println("amount is more than 5000");
			throw new LowBalanceException();
			
		}
		catch(LowBalanceException e)
		{
			System.out.println(e);
		}
		
		
	

	}

}
