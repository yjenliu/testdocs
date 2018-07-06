package InterviewQuestions;

public class factorial {
	public static void main(String[] args) {
		
	System.out.println("factorial of 6: " + factorial(6));
}
	public static int factorial (int number)
	{
		if (number == 0) {
			return 0;
		} else {
			return number * factorial(number - 1);
		}
				
	}
}
