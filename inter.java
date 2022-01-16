
package palakjava;
interface Calc{


public static void sum(int x, int y){
	System.out.println(x+y);
}

public static void mult(int x,int y) {
System.out.println(x*y);
}
public static void sub(int x,int y) {
System.out.println(x-y);
}
public static void div(int x,int y) {
System.out.println(x/y);
}
}
class MyCalc implements Calc{
public void sum(int x, int y) {
System.out.println(x+y);
}
}
public class inter{
public static void main(String[] args) {
MyCalc myCalc = new MyCalc();
Calc.sum(10, 5);
Calc.mult(100,200);
Calc.sub(100,200);
Calc.div(200,200);
}
}