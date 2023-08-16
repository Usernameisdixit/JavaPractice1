package Multithread;

// sleep, interrupted,thread states
class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY);

	}
}

//class MyThread2 extends MyThread
//{
//	public void msg()
//	{
//		System.out.println("one more functionality");
//	}
//}

public class ThreadTest1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t = new MyThread("Hello");
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getState());
		t.start();

		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.isAlive());
		t.suspend();
	
		System.out.println("*----*");
		System.out.println(t.getState());
		System.out.println(t.getClass());
		t.stop();
		System.out.println(t.getState());
	    System.out.println(t.getPriority());
	    System.out.println(t.isAlive());
	    
	   // Thread.s  click to see thread state
	    
	    System.out.println(t.getName());
		
		

	}

}
