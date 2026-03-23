package ineheritancee;

class A
{
public static int a=10;
public static void test1()
{
System.out.println("static member of A");
}
}
class B
{
public int b;
public void test2()
{
System.out.println("non static member of B");
}
}
class c
{
public static int c=20;
public int d;
public static void test3()
{
System.out.println("static member of c");
}
public void test4()
{
System.out.println("non static members of c");
}
}

class MainClass11 
{
		public static void main(String[] args)
		{
		A a1=new A();
		System.out.println(a1.a);
		a1.test1();
		}
	
}



		
		

