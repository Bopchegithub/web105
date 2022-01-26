package com.xyz.app1.service;
public class index {
public static void main(String[] args) {
String[] strArray = 
{
"java python",
"TITLE CASE EXAMPLE",
};
for(String str : strArray)
System.out.println( toTitleCase(str));
}
private static String toTitleCase(String str)
{
if(str == null || str.isEmpty())
return "";
if(str.length() == 1)
return str.toUpperCase();
String[] parts = str.split(" ");
StringBuilder sb = new StringBuilder( str.length() );
for(String part : parts){
if(part.length() > 1 )
sb.append( part.substring(0, 1).toUpperCase() )
.append( part.substring(1).toLowerCase() );
else
sb.append(part.toUpperCase());
sb.append(" ");
}
return sb.toString().trim();
}
}