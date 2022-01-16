package palakjava;
interface MyFunctionalInterface{
			public abstract void wish(String name);
		}
			class MyFuntionalIntefaceImpl implements MyFunctionalInterface{
			public void wish(String name) {
			System.out.println("Happy Diwali  "+name);
			}
			}
			public class Assignment3inter {
			public static void main(String[] args) {
			MyFunctionalInterface myFun = new MyFuntionalIntefaceImpl();
			myFun.wish("seeta and geeta");
}
}

