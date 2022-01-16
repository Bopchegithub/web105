package palakjava;

import java.util.Scanner;

class AttendanceShortageException extends RuntimeException{
	public AttendanceShortageException() {
		super();
		System.out.println("AttendanceShortageException()");
	}
	public AttendanceShortageException(String msg) {
		super(msg);
	}
}
class GPAException extends RuntimeException{
	public GPAException() {
		super();
		System.out.println("GPAException()");
	}
	public GPAException(String msg) {
		super(msg);
	}
}
public class Exceptionassign1 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		System.out.println("enter your attendance:");
		int att=in.nextInt();
		System.out.println("enter your marks");
		int mar=in.nextInt();
if(att <75) {
	throw new AttendanceShortageException("not eligible to test");
}
else {
	System.out.println("eligible to test");
}
if(mar <7) {
	throw new GPAException("low cgpa");
}
else {
	System.out.println("valid cgpa");
}
	}

}
