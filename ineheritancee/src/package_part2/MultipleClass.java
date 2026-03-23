package package_part2;
import java.util.Scanner;
import java.util.Random;

public class MultipleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value");
		int a=s.nextInt();
		System.out.println("user entered value is"+a);
		Random r=new Random();
		int b=r.nextInt(10000);
		System.out.println(b);
	}
}

