package hcl;
	
	public class Calculator {
	   public int add(int a, int b){
	          return a+b;
	   }
		public static void main(String args[])
		{
			int a = 10;
			int b = 20;
			//calling add function
			System.out.print(add(a,b));
			//calling sub function
			System.out.print(sub(a,b));
		}
		
		 public int sub(int a, int b){
	          return a-b;
	   }
	}

