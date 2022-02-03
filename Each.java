package com.xyz.app1.test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Each {
public static void main(String[] args) {
HashMap<Integer, String> hm = new HashMap<>();
hm.put(101, "Anuj");
hm.put(102, "Priyal");
hm.put(103, "Jack");
hm.put(104, "Reena");
System.out.println("1.Using Iterator");
Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();
while(itr.hasNext()) {
System.out.println(itr.next());
}
System.out.println("2.Using for-each loop");
for (Map.Entry<Integer, String> entry : hm.entrySet()) {
System.out.println(entry);
}
}
}