package com.xyz.app1.test;
import java.util.ArrayList;
import java.util.ListIterator;
public class t4{
public static void main(String args[]) {
ArrayList al = new ArrayList();
al.add("Python");
al.add("Java");
al.add("Angular");
al.add("React");
System.out.println("Original contents of al: ");
ListIterator itr = al.listIterator();
while (itr.hasNext()) {
System.out.println(itr.next());
}
ListIterator<String> litr = al.listIterator();
System.out.println("////////////////////////////////////////");
System.out.println("Using for loop:");
for (Object object:al ) {
	
System.out.println(object);
}
}
}