package palakjava;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter year ");
		int year =in.nextInt();
		if(year%4==0) {
			System.out.println("This is leap year");
		}
			else {
				
				System.out.println("This is not leap year");
			}
	}

}
