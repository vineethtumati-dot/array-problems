package dsaPractice;

	import java.util.Arrays;

	public class BinarySearch {
	  public static void main(String[] args) {
		 int []arr={1,2,2,3,2,4,10,30,25,4,3,2};

	for(int i=0;i<arr.length-1;i++) {
		int minindex=i;
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[minindex]) {
				minindex=j;
				
			}
			
			}
		
		  int temp=arr[i];
		  arr[i]=arr[minindex];
		  arr[minindex]=temp;
		
		 }
	System.out.println(Arrays.toString(arr));

	int low =0;
	int high =arr.length-1;
	
	int target =2;
	
	boolean found =false;
	
while(low <=high) {
	int mid =(low+high)/2;
	
	if(target==arr[mid]) {
	
		System.out.println(target+" found at index "+mid);
		found =true;
		break;
		
	}
	else if (target<arr[mid] ) {
		high=mid-1;
		
	}		

	else   {
		
		low =mid+1;
	
	}
	
}

if (!found ) {
	System.out.println("not found");

}
		
	  }
	
	}







	
  


	

