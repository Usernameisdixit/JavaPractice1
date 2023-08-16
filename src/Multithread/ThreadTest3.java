package Multithread;

//daemon, join, yield
class MyThread1 extends Thread
{
	@Override
	public void run() {
		
		int count=1;
		while(count<10)
		{
			System.out.println(count++);
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
	
	
}

public class ThreadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 t=new MyThread1();
		t.setDaemon(true);
		t.start();
		//t.setDaemon(true);
	try {
		Thread.sleep(100);// main thread will sleep for 100mili seconds
} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		int i=1;
		while(i<100)
		{
			System.out.println("world"+i++);
		}

	}

}
