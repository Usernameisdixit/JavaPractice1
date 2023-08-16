package Exception;

public class FinallyBlock2 {

	static void meth1() throws Exception  {
		try {
			throw new Exception();
		} finally {
			System.out.println("final message");
		}
	}

	public static void main(String[] args) {
		try {
			meth1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
