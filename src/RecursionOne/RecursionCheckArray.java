package RecursionOne;

public class RecursionCheckArray {


	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input,x,0);
	}
	private static boolean checkNumber(int input[],int x,int sI){
		if(sI==input.length) {
			return false;
		}
		if(input[sI]==x) {
			return true;
		}
		return checkNumber(input,x,sI+1);
	}
	public static void main(String[] args) {
		int[] arr = {0,1,2,4,5};
		System.out.println(checkNumber(arr,1));
	}
}
