package com.xyz.app1.test;
import java.io.Serializable;
public class Product implements Serializable {
int productid;
String productname;
int productprice;
public Product(int productid, String productname, int productprice) {
this.productid = productid;
this.productname = productname;
this.productprice = productprice;
}
public String toString() {
return productid + " " + productname + " " + productprice;
}
}
