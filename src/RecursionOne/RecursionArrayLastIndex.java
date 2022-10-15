package RecursionOne;

public class RecursionArrayLastIndex {
	public static int lastIndex(int a[], int x) {
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
		
		int li=lastIndex(smallArray,x);	// Induction Hypothesis
		if(li!=-1) {
			return -1;
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
	        if(a[si]==x){	// Induction Step
	            return si;
	        }
	        int k=lastIndexBetter(a,x,si+1);	// Induction Hypothesis
	        return k;
	    }
	public static void main(String[] args) {
		

	}

}
