

package palakjava;
abstract class Bank {
	public void OpenAccount() {
		System.out.println("This is Open Account");
	}
	public void closeAccount() {
		System.out.println("This is Close Acoount");
	}	

}
	 class SBI extends Bank{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI obj=new SBI();
SBI obj1=new SBI();
obj.OpenAccount();
obj1.closeAccount();
	}

}
