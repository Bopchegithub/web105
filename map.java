package com.xyz.app1.test;
import java.util.ArrayList;
import java.util.stream.Collectors;
class map {
public static void main(String args[]) {
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(10);
al.add(20);
al.add(5);
al.add(15);
al.add(25);
System.out.println(al);
al.stream()
.map(i -> i*2+2)
.collect(Collectors.toList())
.forEach(System.out::println);
}
}