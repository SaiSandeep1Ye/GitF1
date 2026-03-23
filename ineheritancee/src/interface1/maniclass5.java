package interface1;

class maniclass5 
{
	public static void main(String[] args)
	{
		Sample s=new Sample();
		s.test();
	}
}
interface Demo
{
	int i=10;
	void test();
}
class Sample implements Demo
{
	public void test()
	{
		System.out.println("test method");
	}
}
