package arraySyntax;
import java.util.Scanner;
public class nlargestAray {

	public static void main(String[] args) {
		int temp;
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter array  size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter" +n+"elements:" );
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}

		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println("1th largest element:"+a[a.length-1]);
		System.out.println("2th largest element:"+a[a.length-2]);

		System.out.println("3th largest element:"+a[a.length-3]);

	}

}
