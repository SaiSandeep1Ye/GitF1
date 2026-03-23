package ineheritancee;

abstract class demo1 
{
	public void test()	
	{
		System.out.println("testn complete method");
		}
	abstract public void walk();
}
class Sample extends demo1
{
	public void walk()
	{
		System.out.println("walk method implementation");
	}
}
class demo1
{
	public static void main(String[] args)
	{
		Sample s = new	Sample();
		s.test();
		s.walk();
		}
}
