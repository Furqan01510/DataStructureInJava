package RecursionOne;

public class RecursionNnaturalNum {

	public static void naturalNum(int n) {
		if(n==0) {
			return;
		}
		naturalNum(n-1);
		System.out.print(n);
		System.out.print(" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naturalNum(10);
	}
}
