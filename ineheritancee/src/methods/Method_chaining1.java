package methods;

class Method_chaining1 
{
public static void test1(int a)
{
	System.out.println(a);
}
public static void test2(int a,double d)
{
	System.out.println(a+d);
	test1(10);
}
public static void test3(String s,char c,boolean b)
{
	System.out.println(s+c+b);
	test2(2,3.5);
}
public static void main(String[] args)
{
	test3("hi" , 'r' , false);
}
}
