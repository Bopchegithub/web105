package com.xyz.app1.test;
class Mobile {
public void msg() {
System.out.println("Text message...");
}
}
public class test2 {
public static void main(String args[]) {
Mobile m1 = new Mobile();
m1.msg();
Mobile m2 = new Mobile() {
public void msg() {
System.out.println("whatsapp message...");
}
};
m2.msg();
Mobile m3 = new Mobile() {
public void msg() {
System.out.println("text + whatsapp message...");
}
};
m3.msg();
}
}