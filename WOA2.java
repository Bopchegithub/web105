package com.xyz.app1.service;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
class WOA2 extends Thread {
static CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<>();
public void run()
{
try {
Thread.sleep(2000);
}
catch (InterruptedException e) {
System.out.println("Child Thread going to add element");
}
System.out.println("Child thread updating list");
al.add("AUGUST");
}
public static void main(String[] args)throws InterruptedException
{
al.add("MAY");
al.add("JUNE");
al.add("JULY");
WOA2 t = new WOA2();
t.start();
Iterator<String> itr = al.iterator();
while (itr.hasNext()) {
String s = itr.next();
System.out.println("Main thread iterating list and currentobject: "+s);

Thread.sleep(6000);
}
System.out.println(al);
}
}

