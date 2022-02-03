package com.xyz.app1.test;

class Outer1 {
	static class Inner {
	public static void m1() {
	System.out.println("This is a static nested class");
	}
	}
	}
	class test3 {
	public static void main(String[] args) {
	Outer1.Inner outInner = new Outer1.Inner();
	outInner.m1();
	Outer1.Inner.m1();
	}
	}