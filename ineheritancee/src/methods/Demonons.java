package methods;

class Demonons 
{
	public void test1()
	{
		System.out.println("test1 non static method starts");
		test2();
		System.out.println("test2 non static method ends");
	}
	public static void test2()
	{
		System.out.println("test2 non static method starts");
	}
	
	public static void main(String[] args) 
	{
		Demonons d1=new Demonons();
		d1.test1();

	}

}
