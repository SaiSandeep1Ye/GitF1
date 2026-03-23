package nonprimitive;

class mainclass2 
{
public static void main(String[] args)
{
B b=new B();
A a=b;
a.test();
}
}

class A
{
	public void test()
	{
		System.out.println("test method");
	}
}
class B extends A
{
	public void move()
	{
		System.out.println("move method");
	}
}