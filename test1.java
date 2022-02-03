package com.xyz.app1.test;
class Outer {
public void m1() {
//Method Local Inner class
class Inner {
public void mult(int i, int j) {
System.out.println("The sum is : " + (i * j));
}
}
Inner inner = new Inner();
inner.mult(10, 10);
inner.mult(20, 20);
inner.mult(30, 30);
inner.mult(40, 40);
}
}
public class test1 {
public static void main(String args[]) {
Outer outer = new Outer();
outer.m1();
}
}
