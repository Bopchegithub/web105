package com.xyz.app1.test;
class Customer implements Cloneable{
int customerId;
String customerName;
int customerContact;
public Customer(int customerId, String customerName,int customerContact)
{
super();
this.customerId = customerId;
this.customerName=customerName;
this.customerContact=customerContact;
}
public Object clone()throws CloneNotSupportedException{
return super.clone();
}
}
public class DeepCloning{
public static void main(String[] args)
throws CloneNotSupportedException { Customer p1=new Customer( 111,"Larren",235689);
//Deep Cloning
		 Customer p2 = (Customer)p1.clone();
		 Customer p3 = (Customer)p2.clone();
System.out.println(p1.hashCode());
System.out.println(p2.hashCode());
System.out.println(p3.hashCode());
System.out.println(p1.equals(p2));
//Shallow cloning
Customer p4 = p1;
System.out.println(p4.hashCode());

System.out.println(p4.equals(p3));
}
}
