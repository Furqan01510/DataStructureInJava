package RecursionOne;

public class RecursionArrayIsSorted1 {


	public static boolean arrayIsSorted(int a[]) {
		if(a.length==1) {	// Base case 1
			return true;
		}
		if(a[0]>a[1]) {		// Base case 2
			return false;
		}
		int smallArray[] = new int[a.length-1]; // Induction Step
		for(int i=1;i<a.length;i++) { 
			smallArray[i-1] = a[i];
		}
		boolean isSmallArraySorted = arrayIsSorted(smallArray); // Induction Hypothesis
		return isSmallArraySorted;	// return calling function
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};

		System.out.println(arrayIsSorted(arr));
	}
}