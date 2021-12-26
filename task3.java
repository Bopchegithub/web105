package palakjava;
import java.util.Scanner;


public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String name;
	
		Scanner in =new Scanner(System.in);
		System.out.println("enter your name");
		name= in.next();
	
		System.out.println("Student Id");
		int x = in.nextInt();
	System.out.println("enter marks of 6 subjects");
	int m1=in.nextInt();
	int m2=in.nextInt();
	int m3=in.nextInt();
	int m4=in.nextInt();
	int m5=in.nextInt();
	int m6=in.nextInt();
	int total= m1+m2+m3+m4+m5+m6;
	float avg=total/6.0f;
System.out.println("name: " +name);
System.out.println("id: " +x);
System.out.println("mark of subject1 :"+m1);
System.out.println("mark of subject2 :"+m2);
System.out.println("marksof subject3 :"+m3);
System.out.println("marksof subject4 :"+m4);
System.out.println("marksof subject5 :"+m5);
System.out.println("marksof subject6 :"+m6);
System.out.println("total marks " + total);
System.out.println("Average " + avg);
	}
}
