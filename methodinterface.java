package com.xyz.app1.test;
import java.util.Arrays;
import java.util.Comparator;
class methodinterface {
public static void main(String[] args) {
String[] courses = {"Janvi","Diya","Payal","Ananya","Neeshal"};
System.out.println(Arrays.toString(courses));
Arrays.sort(courses, new Comparator<String>() {
public int compare(String s1, String s2) {
return s1.compareTo(s2);
}
});
System.out.println(Arrays.toString(courses));
}
}