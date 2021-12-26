package palakjava;

import java.util.Scanner;

public class taask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
System.out.println("Enter Employee id");
int id=in.nextInt();
String EName;
System.out.println("Enter Employee Name");
EName= in.next();
System.out.println("enter basic salary ");
int Bsalary=in.nextInt();
float hra=Bsalary*0.02f;
float pf=Bsalary*0.03f;
float ta=Bsalary*0.01f;
float esi=Bsalary*0.025f;
float Grosspay =Bsalary+hra+pf+ta+esi;
float netpay=Grosspay-pf;
System.out.println("                               Salary Break Up Application                          ");
System.out.println(" ========================================================================= ");
System.out.println("Employee id                                                               : " +id);
System.out.println("Employee name                                                             : " +EName);
System.out.println("Basic Salary                                                              : " +Bsalary);
System.out.println("HRA                                                                       : " +hra);
System.out.println("PF                                                                        : " +pf);
System.out.println("TA                                                                        : " +ta);
System.out.println("ESI                                                                       : " +esi);
System.out.println("Gross Pay                                                                 : " +Grosspay);
System.out.println("Netpay                                                                    : " +netpay);
	}
}
