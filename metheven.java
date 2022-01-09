package palakjava;

public class metheven {
	public void meth1(int n)
	{
		System.out.println("odd  "  + n+(n%2!=0));
	}
	public void meth(int n)
	{
		System.out.println("not odd  "  + n+(n%2==0));
	}
	public static void main(String[] args) {
		new metheven().meth1(11);
		new metheven().meth(10);
	}

}
