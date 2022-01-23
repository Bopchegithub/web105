package palakjava;
class RedSignalThread extends Thread {
public void run1(){
for (int i= 1;i<= 5;i++) {
System.out.println("Red Signal Thread");
try {
Thread.sleep(1000);
}
catch(InterruptedException e){
e.printStackTrace();
}
}
}
}
class YellowSignalThread extends Thread {
public void run1(){
for(int i= 1;i<= 5;i++) {
System.out.println("Yellow Signal Thread");
try{
Thread.sleep(1000);
} catch(InterruptedException e) {
e.printStackTrace();
}
}
}
}
class GreenSignalThread extends Thread {
public void run1() {
for(int i= 1;i<= 5;i++) {
System.out.println("Stop Thread");
try {
Thread.sleep(1000);
} catch(InterruptedException e) {
e.printStackTrace();

}
}
}
}
public class starThread{
public static void main(String[] args) throws InterruptedException {
RedSignalThread t1=new RedSignalThread();
t1.start();
t1.join();
YellowSignalThread t2=new YellowSignalThread();
t2.start();
t2.join();
GreenSignalThread t3=new GreenSignalThread();
t3.start();
}
}
