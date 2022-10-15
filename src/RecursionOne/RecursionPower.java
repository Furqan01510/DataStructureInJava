package RecursionOne;

import java.util.Scanner;

public class RecursionPower {

	public static int power(int x, int n) {
		if(n==0) {
			return 1;
		}
		int SmallOutput = power(x,n-1);	// Induction Hypothesis
		int Output = x * SmallOutput;	// Induction Steps
		return Output;
// 		return x * power(x,n-1);		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt(),x = s.nextInt();
		System.out.println(power(n,x));
	}
}
