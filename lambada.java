package com.xyz.app1.test;

interface MyInterface{
int product(int a, int b);
}
public class lambada {
public static void main(String[] args) {

MyInterface myInt = new MyInterface(){
public int product(int a, int b) {
return a*b;
}
};
System.out.println(myInt.product(15,20));

MyInterface myInt1 = (int a, int b) -> {
return a*b;
};
System.out.println(myInt1.product(15,20));


MyInterface myInt2 = (int a, int b) -> a*b;
System.out.println(myInt2.product(15,20));


MyInterface myInt3 = (a, b) -> a*b;
System.out.println(myInt3.product(15,20));
}
}
