package interface1;

class Mainclass2
{
public static void main(String[] args)
{
	c1 b= new c1();
	
	b.test();
	
	c2 r=new c2();
	r.test();
	
}
}

interface A
{
	void test();
}
class c1 implements A
{
	public void test() {
	
	System.out.println("tes1 method");

}
}

class c2 implements A
{
	public void test()
	{
	System.out.println("tes2 method");

}
}


