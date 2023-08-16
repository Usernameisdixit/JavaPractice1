package Multithread;


class MyThread3 extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count =0;
		while(count<10)
		{
			System.out.println("Hello"+count++);
		}
		
	}
}



public class ThreadTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread3 t=new MyThread3();
		//t.setDaemon(true);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Thread mainThread=Thread.currentThread();
//		try {
//			mainThread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		int count =0;
		while(count<10)
		{
			System.out.println("world"+count++);
		}
		
		
		

	}

}
