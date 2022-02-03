package com.xyz.app1.test;
class stuu{
int eid;
String ename;
public stuu(int eid, String ename) {
super();
this.eid = eid;
this.ename = ename;
}
public void finalize() {
System.out.println("finalize()");
}
public String toString() {
return "Employee [eid=" + eid + ", ename=" + ename + "]";
}
}
class gar4 {
public static void m1() {
stuu e = new stuu(10123,"Joe");
System.out.println(e);
}
public static void main(String args[]) {
m1();
System.gc();
}
}
