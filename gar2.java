package com.xyz.app1.test;
class Student{
int sid;
String sname;
public Student(int sid, String sname) {
super();
this.sid = sid;
this.sname = sname;
}
public void finalize() {
System.out.println("finalize()");
}
public String toString() {
return "Student [sid=" + sid + ", sname=" + sname + "]";
}
}
class gar2 {
public static void main(String args[]) {
Student e1 = new Student(101012,"James");
Student e2 = new Student(101012,"James");
System.out.println(e1);
System.out.println(e2);
System.out.println(e1.equals(e2));
e1 = e2;
System.out.println(e1.equals(e2));
System.gc();
}
}