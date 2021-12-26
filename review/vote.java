package palakjava;

import java.util.Scanner;

public class vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("enter Age");
		int age=in.nextInt();
		if(age>=18) {
			System.out.println("person is eligible");
		}
		else {
			System.out.println("person is not eligible");
		}

	}

}
