package arraySyntax;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter size of an array");
		int size=s.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter"+size+"elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println(a[4]);
		System.out.println("-----------------------------------------");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
	//System.out.println("user entered elements are");
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		

	}

}
}
