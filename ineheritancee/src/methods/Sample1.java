package methods;

class Sample1 
{
	public void test()
	{
		System.out.println("test method");
	}

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample1 s1=new Sample1();
		s1.test();
		Sample1 s2=new Sample1();
		s2.test();
		
	}

}
