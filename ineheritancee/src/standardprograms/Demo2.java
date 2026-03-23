package standardprograms;

public class Demo2 {
public static void main(String[] args) {
int row=3;
int col=row;
for(int i=1;i<=row;i++) {
	for(int j=1;j<=col;j++) {
		if(i==2&&j==2) {
			System.out.print("  ");
		}
		else
		{
			System.out.print("* ");
		}
	}
	System.out.println();
}
}
}
