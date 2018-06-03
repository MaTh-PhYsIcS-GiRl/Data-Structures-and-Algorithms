/**
 * capability to control the access of multiple threads to any shared resource
 * ONLY ONE THREAD to access shared source
 * every object has a lock  : thread that needs consistent access to an object's
 * fields has to acquire the object's lock before accessing them, 
 * and then release the lock when it's done with them.
 * prevent thread interference
 * prevent consistency problem
 * PROCESS SYNCHRONIZATION, THREAD SYNCHRONIZATION
 * @author Deepansha Singh
 *
 */
/**
 * THREAD synchronization
 * Mutual Exclusion and cooperation
 * MUTUAL EXCLUSIVE : 
 * keep threads from interfering with one another while sharing data, synchronized method, block, 
 * static synchronization
 * @author Deepansha Singh
 *	
 */
class Table
{
	void printTable(int n) {//method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n*i);
		
		try {
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
}



class MyThread1 extends Thread{
	
	Table t;
	MyThread1 (Table t)
	{
		this.t = t;
	
	}

	public void run()
	{
		t.printTable(5);
	}


}


class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}



class TestSynchronization1
{
	public static void main(String[] Deepansha)
	{
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
	}
}
