package com.xyz.app1.test;
import java.util.ArrayList;
class filt {
public static void main(String args[]) {
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(50);
al.add(20);
al.add(5);
al.add(17);
al.add(27);
System.out.println(al);
al.stream()
.filter(i -> i % 2 != 0)
.forEach(System.out::println);

}
}
