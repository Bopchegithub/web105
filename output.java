package com.xyz.app1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class output {
public static void main(String[] args) {
String input = "the pincodes are 500055 and 500083";

String regex = "[7-9]\\d{9}";
Pattern p = Pattern.compile(regex);
Matcher m = p.matcher(input);
while(m.find()) {
System.out.println(m.group());
}
}
}