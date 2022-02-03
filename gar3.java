package com.xyz.app1.test;
class Employee{
int eid;
String ename;
public Employee(int eid, String ename) {
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
class gar3 {
public static void main(String args[]) {
System.out.println("main()");
new Employee(101,"Jones");
new Employee(102,"Wills");
System.gc();
}
}