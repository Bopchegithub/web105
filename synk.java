package palakjava;
class Table1 {
static synchronized void printTable(int n) {
for (int i = 1; i <= 5; i++) {
System.out.println(n * i);
try {
Thread.sleep(1000);
} catch (Exception e) {
System.out.println(e);
}
}
}
}
class MyThread1 extends Thread {
public void run() {
Table1.printTable(10);
}
}
class MyThread2 extends Thread {
public void run() {
Table1.printTable(100);
}
}
class synk {
public static void main(String args[]) {
MyThread1 t1 = new MyThread1();
MyThread2 t2 = new MyThread2();
t1.start();
t2.start();
}
}