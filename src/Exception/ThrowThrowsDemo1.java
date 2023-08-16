package Exception;
public class ThrowThrowsDemo1 {
	
	
	static int meth1()
	{
		return 10/0;
	}
	
	
	static void meth2()
	{
		
		
		meth1();
	}
	
	
	static void meth3()
	{
		meth2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {                // handled exception by try catch in next program(ThrowThrowsDemo2.java) will be handled by throw and throws
			meth3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}

	}

}
