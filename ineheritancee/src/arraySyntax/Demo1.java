package arraySyntax;

public class Demo1 {

	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		System.out.println(a[4]);
		System.out.println("-----------------------");
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+",");
		}
		
	}

}
