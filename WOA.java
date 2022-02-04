package com.xyz.app1.service;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
class WOA extends Thread {
static CopyOnWriteArraySet<String> al = new CopyOnWriteArraySet<>();
public void run(){
try {
Thread.sleep(2000);
}
catch (InterruptedException e) {
System.out.println("Child Thread going to add element");
}
System.out.println("Child thread updating list");
al.add("ALIEN");
}
public static void main(String[] args)throws InterruptedException {
al.add("PANTHOR");
al.add("JUNGLE");
al.add("JOKER");
WOA t = new WOA();
t.start();
Iterator<String> itr = al.iterator();
while (itr.hasNext()) {
String s = itr.next();
System.out.println("Main thread iterating list and current object:"+s);

Thread.sleep(6000);
}
System.out.println(al);
}
}
