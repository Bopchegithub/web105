package palakjava;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,option,result;
Scanner in=new Scanner(System.in); 
do {
	System.out.println("1.to find addition");
	System.out.println("2.to find subtraction");
	System.out.println("3.to find multiplication");
	System.out.println("4.to find Division");
	System.out.println("0.to exist");
	System.out.println("Please Choose Option");
	option=in.nextInt();
	switch (option) {
	case 1:
		System.out.println("Enter  numbers");
		num1=in.nextInt();
		num2=in.nextInt();
		result=num1+num2;
		System.out.println("sum of 2 numbers="+result);
		break;
	case 2:
		System.out.println("Enter  numbers");
		num1=in.nextInt();
		num2=in.nextInt();
		result=num1-num2;
		System.out.println("subtraction of 2 numbers="+result);
		break;
	case 3:
		System.out.println("Enter  numbers");
		num1=in.nextInt();
		num2=in.nextInt();
		result=num1*num2;
		System.out.println("Muktiplication of 2 numbers="+result);
		break;
	case 4:
		System.out.println("Enter  numbers");
		num1=in.nextInt();
		num2=in.nextInt();
		result=num1/num2;
		System.out.println("div of 2 numbers="+result);
		break;
	case 0:
		System.out.println("thank you for using the app");
		System.exit(0);
Default:
		System.out.println("please choose correct option");
		break;
	}
}while(option !=0);
}
}