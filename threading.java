package palakjava;

 class MyRunnable implements Runnable {
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println("my thread");
		}
	}
 }
	public class threading{
		public static void main(String[] args) {
		MyRunnable n=new MyRunnable ();
Thread t= new Thread(n);
t.start();
for (int i=0;i<5;i++) {
	System.out.println("your thread");
}
	}
	}


