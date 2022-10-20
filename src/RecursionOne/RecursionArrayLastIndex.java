package RecursionOne;

public class RecursionArrayLastIndex {
	public static int lastIndex(int a[], int x) {
		if(a.length==0){	// Base Case
			return -1;
		}
		int smallArray[]=new int[a.length-1];	// Copying Array
		for(int i=1;i<a.length;i++){
			smallArray[i-1]=a[i];
		}
		
		int k=lastIndex(smallArray,x);	// Induction Hypothesis
		if(k!=-1) {						// Induction Steps & Conditions
			return k+1;
		}else {
			if(a[0]==x) {
				return 0;
			}else {
				return -1;
			}
		}
	}
	// Method 2
	   public static int lastIndexBetter(int a[],int x,int si){
	        if(si==a.length){	// Base Case
	            return -1;
	        }
	        int k=lastIndexBetter(a,x,si+1);	// Induction Hypothesis
	        if(k!=-1) {							// Induction Steps & Conditions
	        	return k;
	        }else {
	        	if(a[si]==x) {
	        		return si;
	        	}else {
	        		return -1;
	        	}
	        }
	    }
	public static void main(String[] args) {
		int[] arr = {1,5,3,4,5};
		
		System.out.println(lastIndex(arr,5));
		System.out.println(lastIndexBetter(arr,5,0));
	}
}