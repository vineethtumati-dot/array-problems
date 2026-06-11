package dsaPractice;

public class searchingMethods {
	
	public static void main(String[] args) {
		
		
		int []arr= {1,4,2,6,4,8};
//		int target =4;
//		boolean found =false;
//		int count=0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target) {
//				found =true;
//				count ++;
//			System.out.println(target +"found at index "+i+" "+count+" time");
//				
//			
//				} 
//		}
//		
//		if(!found) {
//			System.out.println(target +"not found ");
//	
//		}
//		
		
		
		
		 int low=0;
		 int high=arr.length-1;
		 int target =4;
		  boolean found  =false;
		  int mid=-1;
		 
		 while(low<=high) {
			 mid=low+(high-low)/2;
			
			 if(target ==arr[mid]) {
			 System.out.println(target+" found at "+mid);
			 found =true;
			 break;
			 
			 }
			 else if(target<mid) {
				 high=mid-1;
				 
			 }
			 else {
				 low=mid+1;
			 }
		 }
		 if(found) {
			 
			 int left =mid;
			 int right=mid;
			 
			 while (left >0 &&arr[left-1]==target) 
				 left--;
			 while(right<arr.length-1 && arr[right+1]==target)
				 right++;
			 
			 for(int i=left;i<=right;i++) {
				 
				 System.out.println(target + "found at index "+i);
				 
			 }
			 System.out.println("total count : "+(right-left+1));
		 }else {
			 System.out.println(target+" not found");
		
		 } 
	}
	}


