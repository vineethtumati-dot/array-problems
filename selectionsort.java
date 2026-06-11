package dsaPractice;

import java.util.Arrays;

public class selectionsort {

public static void main(String[] args) {
	
	int []arr= {2,4,1,5,2,6,3};
	
	for(int i=0;i<arr.length-1;i++) {
		int minindex=i;
		
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[minindex]) {
				minindex=j;
			}
		}
	
	
	   int tmp=arr[i];
	   arr[i]=arr[minindex];
	   arr[minindex]=tmp;
	
	
	}
	System.out.println(Arrays.toString(arr));
}
}
