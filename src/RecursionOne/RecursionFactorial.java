package RecursionOne;

public class RecursionFactorial {

	public static int fact(int n) {
		if(n==0) {	// Base case
			return 1;
		}
		int SmallOutput = fact(n-1); // Induction Hypothesis
		int Output = n * SmallOutput; // Induction Step 
		return Output;
		
//		return n * fact(n-1);	// OneLine execution
	}
	
	public static void main(String[] args) {

		System.out.println(fact(5));
	}

}
