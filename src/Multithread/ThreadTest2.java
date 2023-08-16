package Multithread;

// demo of synchronization
class MyClass extends Thread
{
	@Override
	public void run()
	{
		int count=1;
		while(count<10)
		{
			System.out.println("hello111111");
			count++;
//			try {
//				Thread.sleep(1000);//without try/catch gives unhandled exception
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass t=new MyClass();
		t.start();
//		t.interrupt();
		
		int count=1;
		while(count<10)
		{
			System.out.println("world");
			count++;
		}

	}

}
