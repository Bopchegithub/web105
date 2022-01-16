package palakjava;

public interface Calculator {

default void sum(int x,int y) {
	System.out.println("addition of  "  +(x+y));
}
default void sub(int x,int y) {
	System.out.println("substraction of  "  +(x-y));
}
default void mul(int x,int y) {
	System.out.println("multiplication of  "  +(x*y));
}
default void div(int x,int y) {
	System.out.println("divition of  "  +(x/y));
}

}
