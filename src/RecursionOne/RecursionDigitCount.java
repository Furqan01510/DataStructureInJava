package RecursionOne;

public class RecursionDigitCount {


	public static int count(int n){
	if(n==0){
		return 0;
	}
	int SmallOutput = count(n/10);
	int Output = 1 + SmallOutput;
	return Output;
//	return 1 + count(n/10); // Online Line Execution 
}
	
	public static void main(String[] args) {

		System.out.println(count(3));

	}
}
