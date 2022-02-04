package com.xyz.app1.service;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
class WOA3 extends Thread {
static ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>();
public void run()
{
try {
Thread.sleep(2000);
}
catch (InterruptedException e) {
System.out.println("Child Thread going to add element");
}
System.out.println("Child thread updating Map");
m.put(104,"AASTHA");
}
public static void main(String[] args)throws InterruptedException
{
m.put(101,"PAURANIKA");
m.put(102,"JAITALA");
m.put(103,"BONDITA");
WOA3 t = new WOA3();
t.start();
Set<Integer> s = m.keySet();
Iterator<Integer> itr = s.iterator();
while(itr.hasNext()) {
Integer i = itr.next();
System.out.println("Main thread iterating and current Entry is:"+i+"..."+m.get(i));

Thread.sleep(6000);
}
System.out.println(m);
}
}
