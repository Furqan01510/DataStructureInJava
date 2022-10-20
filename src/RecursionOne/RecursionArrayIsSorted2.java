package RecursionOne;

public class RecursionArrayIsSorted2 {

	public static boolean arrayIsSorted(int a[],int si) {
		if(si == a.length-1){	// Base case
			return true;
		}
		if(a[si] > a[si+1]) {	// Induction Steps
			return false;
		}
		boolean isSmallArraySorted = arrayIsSorted(a,si+1);	// Induction Hypothesis
		return isSmallArraySorted; // return calling function
		
	}
	public static void main(String[] args) {
		int[] arr = {0,1,2,5,6};
		System.out.println(arrayIsSorted(arr,0));
	}
}  
