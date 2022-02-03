package com.xyz.app1.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class input {
public static void main(String[] args)
{
String input = "ANGPA1234G";
String input1 = "A1234567";
String input2 = "L1234123";
String regex ="[A-Z0-9]";


Pattern p = Pattern.compile(regex);
Matcher m = p.matcher(input);
if(m.find() && (m.group().equals(input)))
{
	System.out.println(m.group());
System.out.println("valid");
}
else {
System.out.println("Invalid");
}
if(m.find() && (m.group().equals(input1)))
{
	System.out.println(m.group());
System.out.println("valid");
}
else {
System.out.println("Invalid");
if(m.find() && (m.group().equals(input2)))
{
	System.out.println(m.group());
System.out.println("valid");
}
else {
System.out.println("Invalid");
}
}
}
}