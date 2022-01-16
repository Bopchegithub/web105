package com.xyz.app1.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mismatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
try {
	System.out.println("enter a value");
	Integer a=s.nextInt();
	Integer b=s.nextInt();
	System.out.println((a+b));
	System.out.println((a*b));
	System.out.println((a/b));
	System.out.println((a-b));
}
catch(InputMismatchException ex) {
	System.out.println(ex);
}
	}

}
