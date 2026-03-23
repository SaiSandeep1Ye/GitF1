package methods;

class Method_chaining
{
	public static void test1()
	{
		System.out.println("test1 method");
		test2();
	}
	public static void test2()
	{
		test3();
		System.out.println("test2 method");
	}
	public static void test3()
	{
		System.out.println("test3 method");
	}
	public static void main(String[] args)
	{
		System.out.println("main starts");
		test1();
		System.out.println("main ends");
	}

}
