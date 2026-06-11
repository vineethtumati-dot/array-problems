package dsaPractice;

import java.util.Arrays;

public class FindLargeWithoutSortAndWithSort {

	int []arr = {8, 3, 6,9, 2, 10, 4, 5};
	
void show() {
	
	  
	int largest =arr[0];
	int second=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>largest) {
		second =largest;
		largest=arr[i];
			
		}
	}
	
System.out.println("largest :" +largest+" "+"secondlargest :"+second);
}


void sort() {
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
	}
	System.out.println("after bubble sorting "+Arrays.toString(arr));
	int large=arr[0];
	int secondl=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(large<arr[i]) {
			  secondl = large;
			large=arr[i];
			
			
		}
	}
	
	System.out.println("largest :" +large+" "+"secondlargest :"+secondl);
}
	
public static void main(String[] args) {
	FindLargeWithoutSortAndWithSort  sc=new FindLargeWithoutSortAndWithSort ();
	sc.show();
	sc.sort();
}
}
 
