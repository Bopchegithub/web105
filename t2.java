package com.xyz.app1.test;

class Thread1 extends Thread{
int total=0;
public void run1()
{
synchronized(this){
System.out.println("Child thread starts calculations");
for(int a=1;a<=100;a++)
{
total = total+a;
}
System.out.println("Child thread gives notification call");
this.notify();
}
}
}
class t2 {
public static void main(String[] args)throws InterruptedException{
Thread1 t1= new Thread1();
t1.start();
Thread.sleep(10000);
synchronized(t1){
System.out.println("i am wait() ");
t1.wait(10000);
System.out.println("i am notify");
System.out.println(t1.total);
}
}
}