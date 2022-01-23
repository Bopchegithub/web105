package com.xyz.app1.test;
class Table {
static synchronized void printTable(int n) {
for (int i = 65; i <=75; i++) {
System.out.println( i);
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
Table.printTable(5);
}
}
class MyThread2 extends Thread {
public void run() {
Table.printTable(100);
}
}
class t3{
public static void main(String args[]) {
MyThread1 t1 = new MyThread1();
MyThread2 t2 = new MyThread2();
t1.start();
t2.start();
}
}