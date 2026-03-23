package variables;

public class throwproblem {
	static void status(int age) throws invalidageException {
		if(age>20) {
			System.out.println("elegible for marriage");
		}
		else {
			throw new invalidageException("you are not eligible");
		}
	}

	public static void main(String[] args) throws invalidageException {
		// TODO Auto-generated method stub
		
		throwproblem.status(10);
	}

}
