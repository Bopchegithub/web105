package com.xyz.app1.test;
import java.io.*;
class SerializationDemo{
public static void main(String args[]) throws Exception {
String file = "D:\\\\score.txt";
FileOutputStream fos = new FileOutputStream(file);
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(new Student(211, "ravi", 100));
oos.flush();
oos.close();
System.out.println("Serializable process success");
}
}