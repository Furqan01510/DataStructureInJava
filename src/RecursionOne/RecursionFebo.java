package RecursionOne;

public class RecursionFebo {
	public static int febo(int n){
		if(n==1 || n==2) {
			return 1;
		}
		int febNum1 = febo(n-1);
		int febNum2	= febo(n-2);
		int feboN = febNum1 + febNum2;	
		return feboN;
	}
	
	public static void main(String[] args) {
		System.out.println(febo(5));
	}
}
