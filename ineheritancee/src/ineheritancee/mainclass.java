package ineheritancee;

 class mainclass 
	
	{
		public static void main(String[]args) {
			Son s=new Son();
			s.car();
		}
	}

	class Father
	{
		public void car()
		{
			System.out.println("car color is red");
		}
	}
	class Son extends Father
	{
		public void car()
		{
			System.out.println("car color is Black");
		}
	}


