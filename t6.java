package com.xyz.app1.test;
import java.util.LinkedList;
public class t6 {
public static void main(String[] args) {
LinkedList ll = new LinkedList();
System.out.println(ll.size());
// add elements 
ll.add("Java");
ll.add("10");
ll.add("Java");
ll.add(null);
System.out.println(ll);
System.out.println(ll.size());
ll.addFirst("Python");      

ll.addLast("Angular");
System.out.println("After adding first & Last" + ll);
System.out.println(ll.size());
// remove elements 
ll.remove(0);
System.out.println("After deletion content :" + ll);
System.out.println(ll.size());
// remove first and last elements 
ll.removeFirst();
ll.removeLast();
System.out.println("After deletion of first and last :" + ll);
// get and set a value 
int a= (int)ll.get(0);
ll.set(0, a+"ReactJS");
System.out.println("After Update:" + ll);
}
}
