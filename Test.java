package com.xyz.app1.test;
class India {
	//Regular Inner class
	class state {
	public void stateInfo() {
	System.out.println("maharashtra");
	}
	}
	void checkstate(int pincode) {
	state s = new state();
	s.stateInfo();
	}
	}
	public class Test {
	public static void main(String args[]) {
	India i = new India();
	i.checkstate(441641);
	India.state s = i.new state();
	s.stateInfo();
	}
	}