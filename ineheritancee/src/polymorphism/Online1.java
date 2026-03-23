package polymorphism;

class Online1 
{
public static void purchase(String pName)
{
	System.out.println("product Name:"+pName);
}
public static void purchase(int pId)
{
	System.out.println("product id:"+pId);
}
public static void purchase(String pName,int cost)
{
	System.out.println("product Name:"+pName);
	System.out.println("product cost:"+cost);
}
public static void main(String[] args)
{
	purchase("nike");
}
}
