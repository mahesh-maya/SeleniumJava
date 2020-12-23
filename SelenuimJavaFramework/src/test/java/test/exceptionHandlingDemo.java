package test;

public class exceptionHandlingDemo {

	public static void main(String[] args) {

		try {

			System.out.println("Hello World....");

			int a = 1/0;

			System.out.println("Test complted");

		}catch (Exception e) {

			System.out.println("Inside catch ");
			System.out.println("Message : "+e.getMessage());
			System.out.println("cause : "+e.getCause());
			e.printStackTrace();
		}finally{

			System.out.println("Inside finally");
		}




	}

}
