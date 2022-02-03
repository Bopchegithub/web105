package com.xyz.app1.test;
class stu{
int sid;
String sname;
public stu(int sid, String sname) {
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
class gar1 {
public static void main(String args[]) {
stu s = new stu(10112,"nishal");
System.out.println(s);
s = null;
System.gc();
}
}