package abstraction;

class mainclass1 
{
public static void main(String[] args)
{
	Employee e=new Employee();
	Person p=new Employee();
	p.work();
}
}
abstract class Person
{
	abstract public void work();
}
class Employee extends Person
{
	public void work()
	{
		System.out.println("working");
	}
}
