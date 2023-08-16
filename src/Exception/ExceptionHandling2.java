package Exception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	try {	
		int a=5,b=5;
		
		int c=a/b;
		
		System.out.println(c);
		
		int d[]= {3,4,8,9};
		
		System.out.println(d[100]);
	}
	catch(ArithmeticException e)
	{
		System.out.println("divide by 0"+e);//methods-> e.getMessage() ,toString is by default to print the values
		e.printStackTrace();// print stach trace has it self print method so direct call
	}
	
	catch(ArrayIndexOutOfBoundsException e1)
	{
		System.out.println("array index out side of range"+e1);
	}

	}

}
