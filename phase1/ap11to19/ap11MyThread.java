package phase1;

public class ap11MyThread extends Thread{
	
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main ( String args[] )
 	{
  		ap11MyThread mt = new  ap11MyThread();
  		mt.run();
 	}

	
}
