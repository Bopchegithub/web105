package palakjava;
import java.util.*;
public class car {
public void move() {
	System.out.println("Car is Moving");
	
}
public void brake() {
	System.out.println("car is stop");
}

public class Audi extends car{
	public void autoPilot() {
		System.out.println("audi have autopilot");
	}
	public void autoGear() {
		System.out.println(" audi have autogear");
	}
	
}

public class test {
	public static void main(String[] args) {
		System.out.println("car class");
		car c= new car();
		c.move();
		c.brake();
		System.out.println("audi class");

		Audi a= new Audi();
		a.move();
		a.brake();
		a.autoPilot();
		a.autoGear();
	}
}
}


