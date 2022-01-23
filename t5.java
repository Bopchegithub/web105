package com.xyz.app1.test;
import java.util.Vector;
import java.util.Enumeration;
class t5 {
public static void main(String[] args) {
Vector v = new Vector();
v.add("Python");
v.add("Java");
v.add("Angular");
v.add("React");

System.out.println(v);
System.out.println("Printing the elements using For each "); 
for (Object object : v) {
System.out.println(object);
}
System.out.println("Printing the elements using Enumaration"); Enumeration e = v.elements();
while (e.hasMoreElements()) {
System.out.println(e.nextElement());
}
}
}