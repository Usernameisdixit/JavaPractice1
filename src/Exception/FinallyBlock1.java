package Exception;

public class FinallyBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally block definitely will be executing then after exception message will be displayed on the console	
		try
		{
			System.out.println(10/0);
		}
		
		finally {
			System.out.println("final message");
		}

	}

}


//if we are handling exception in catch then no need the finally block
//try
//{
//	System.out.println(10/0);
//}
//catch(ArithmeticException e)
//{
//	System.out.println("arithmatic exception"+e.getMessage());
//}
//finally {
//	System.out.println("final message");
//}