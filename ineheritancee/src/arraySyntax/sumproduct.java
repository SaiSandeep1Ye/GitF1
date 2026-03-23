package arraySyntax;
import java.util.Scanner;

public class sumproduct {

		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			
			System.out.println("enter size of an array");
			int size = s.nextInt();
			
			int a[]=new int[size];
			System.out.println("enter" +size+ "elements");
			for(int i=0;i<a.length;i++) {
		    a[i]=s.nextInt();
				
			}
			System.out.println("-------------------------------------");
			int sum=0; 
			int prod=1;
			for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
				prod=prod*a[i];
			}
			System.out.println("sum of an array="+sum);
			System.out.println("product of an array="+prod);
			}
}
