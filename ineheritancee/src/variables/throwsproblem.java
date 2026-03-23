package variables;

class throwsproblem {
	void m1() throws ArithmeticException{
System.out.println(10/0);
}
void m2() {
	m1();
	System.out.println("m2 method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 throwsproblem newobj = new throwsproblem();
 newobj.m1();
 
 
	}
}
