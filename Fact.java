package palakjava;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
	int fat=1;
	 Scanner in = new Scanner(System.in);
	 System.out.println("enter number");
	 int n =in.nextInt();
	 for(int i=1;i<=n;i++) {
		 fat=fat*i;

	 }
	 System.out.println("the factorial of number" +fat); 
	}

}
