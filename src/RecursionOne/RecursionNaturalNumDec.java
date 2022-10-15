package RecursionOne;

public class RecursionNaturalNumDec {

	public static void naturalNumDec(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n);
		System.out.print(" ");
		naturalNumDec(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naturalNumDec(10);
	}
}