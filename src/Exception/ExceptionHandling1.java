package Exception;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=0,c; //5/10=0 if below value is greater then it will be 0  and if5%10 then it will give 5
		
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("division by zero error"+e);
//		}
		


	}

}
