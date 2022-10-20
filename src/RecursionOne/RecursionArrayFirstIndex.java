package RecursionOne;

public class RecursionArrayFirstIndex {

	// Recursion Method 1
	public static int firstIndex(int a[], int x) {
		if(a.length==0){	// Base Case
			return -1;
		}
		if(a[0]==x){
			return 0;
		}
		int smallArray[]=new int[a.length-1];	// Copying Array
		for(int i=1;i<a.length;i++){
			smallArray[i-1]=a[i];
		}
		
		int k=firstIndex(smallArray,x);	// Induction Hypothesis
		if(k==-1){	// Induction Steps
			return -1;
		}else{
			return k+1;
		}
	}
	// Method 2
	   public static int firstIndexBetter(int a[],int x,int si){
	        if(si==a.length){	// Base Case
	            return -1;
	        }
	        if(a[si]==x){	// Induction Step
	            return si;
	        }
	        int k=firstIndexBetter(a,x,si+1);	// Induction Hypothesis
	        return k;
	    }
	   
		public static void main(String[] args) {
			int[] arr = {1,2,3,4,5};

			System.out.println(firstIndex(arr,0));
			System.out.println(firstIndexBetter(arr,3,0));
		}
	}
