package palakjava;
class thread1 extends Thread{
	public void run1() {
		System.out.println("hello thread 1");
	}


}

public class thread {

	public static void main(String[] args) {
		System.out.println("hello thread count"+Thread.activeCount());
		thread1 t= new thread1();
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("  hii main thread");
		}
		System.out.println("Thread Count:" +Thread.activeCount());
	}

}
