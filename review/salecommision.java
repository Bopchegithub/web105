package palakjava;

import java.util.Scanner;

public class salecommision {

	public static void main(String[] args) {
float sale1,sale2,sale3,sale4,comm1,comm2,comm3,tot1,tot2,tot3;
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("enter Sale1");
		System.out.println("enter Sale2");
		System.out.println("enter Sale3");
		System.out.println("enter Sale4");
		sale1=in.nextFloat();
		sale2=in.nextFloat();
        sale3=in.nextFloat();
		sale4=in.nextFloat();
		if(sale1>=0 && sale1<=10000)
				
			System.out.println("Commission is 0");
		else
			System.out.println("soory");
		
		 if(sale2>=10001 && sale2<=20000) {
			System.out.println("Commission is 10%");
		comm1=sale2*0.1f;
		tot1= comm1+sale2;
		System.out.println("total is"+tot1);
		 }
		else {
			System.out.println("soory");
		}
		 if(sale3>=20001 && sale3<=30000) {
		System.out.println("Commission is 20%");
		comm2=sale3*0.2f;
		tot2= comm2+sale3;
		System.out.println("total is"+tot2);
		 }
		else {
			System.out.println("soory");
		}
		 if (sale4>=31000) {
			System.out.println("Commission is 25%");
		comm3=sale4*0.25f;
		tot3= comm3+sale4;
		System.out.println("total is"+tot3);
		 }
		 else {
			 System.out.println("soory");
		 }
		}
}

