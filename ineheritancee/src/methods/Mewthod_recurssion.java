package methods;

class Mewthod_recurssion
{
    static int b=1;
    public static void main(String[] args) 
    {
        test();
    }
    public static void test()
    {
        int a=2;
        if(b<=10)
        {
            System.out.println(a+"*"+b+"="+a*b);
            b++;
            test();
        }
    }
}