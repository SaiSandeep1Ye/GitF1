package methods;

public class Harshith {
	int a;
	int b;
	public Harshith()
		
		{
			a=10;
			b=20;
			System.out.println("constructor");
	}
	void print()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String[]args)
	{
		Harshith H = new Harshith();
	      H.print();
	}

}
