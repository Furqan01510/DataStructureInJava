package RecursionOne;

public class RecursionArraySum {
	
	// Method 1
	public static int sum(int input[]) {
		return sumArr(input,0);
	}
	public static int sumArr(int input[],int startIndex) {
		if(startIndex==input.length) {
			return 0;
		}
		return input[startIndex] + sumArr(input,startIndex+1);
	}
	
	// Method 2
	public static int sumArrMethod2(int input[],int n) {
		if(n<=0) {
			return 0;
		}
		return sumArrMethod2(input,n-1) + input[n-1];
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,2,3,4};	

		System.out.println(sum(arr));
		System.out.println(sumArrMethod2(arr,arr.length));
	}
}
