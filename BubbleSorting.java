package dsaPractice;

import java.util.Arrays;

public class BubbleSorting {
	int []arr= {8,3,6,2,6,4,5};
	int temp;
	
	
		
		void bubbleSortAscending() {
		
	
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("bubbleSort in Ascending: "+Arrays.toString(arr));
	}
	
	
		void bubbleSortDescending() {
		
		
		 for(int i=0;i<arr.length-1;i++) {
			 for(int j=0;j<arr.length-1-i;j++) {
			 if(arr[j]<arr[j+1]) {
				 temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
			 } 
	}
		
		 System.out.println("bubbleSort in Descending: "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		BubbleSorting h=new BubbleSorting();
		h.bubbleSortAscending();
		h.bubbleSortDescending();
		
       



}
}