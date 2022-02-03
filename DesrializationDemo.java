package com.xyz.app1.test;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
class DeserializationDemo {
public static void main(String args[]) throws Exception {
String file = "D:\\\\score.txt";
FileInputStream fis = new FileInputStream(file);
ObjectInputStream ois = new ObjectInputStream(fis);
Object obj = ois.readObject();
Product p = (Product) obj;
System.out.println(p);
}
}
