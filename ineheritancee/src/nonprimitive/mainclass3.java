package nonprimitive;

class mainclass3 
{
public static void main(String[] args)
{
	A a=new B();
	a.test();
	B b=(B)a;
	b.test();
	b.move();
}
}
class A
{
	public void test()
	{
		System.out.println("test");
	}
}
class B extends A
{
	public void move()
	{
		System.out.println("move");
	}
}
