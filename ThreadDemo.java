package palakjava;

class ChildThread extends Thread{
public void run() {
System.out.println("child thread");
}
}
public class ThreadDemo {
public static void main(String[] args) {
System.out.println(Thread.currentThread().getName());
ChildThread t1 = new ChildThread();
t1.start();
System.out.println(t1.getName());
t1.setName("bali");
System.out.println(t1.getName());
ChildThread t2 = new ChildThread();
t2.start();
System.out.println(t2.getName());
t2.setName("Sugriv");
System.out.println(t2.getName());
}
}