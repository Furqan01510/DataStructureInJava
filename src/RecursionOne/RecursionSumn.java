package RecursionOne;

public class RecursionSumn {

	public static int sumN(int n) {
		if(n==0) {		// Base case
			return 0;
		}
		int SmallOutput = sumN(n-1);	// Induction Hypothesis
		int Output = n + SmallOutput;	// Induction Step
		return Output;
		
//		return m + sumN(n-1); 	// Online Line Execution.
	}
	public static void main(String[] args) {
		
		System.out.println(sumN(10));
	}
}
