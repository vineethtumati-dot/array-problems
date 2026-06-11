package dsaPractice;
import java.util.Arrays;
import java.util.Scanner;
public class insertionSorting {
	public static void main(String[] args) {
	int[] arr = {5, 3, 4, 1, 2};
	

for(int i=1;i<arr.length;i++) {
	
	int current =arr[i];
	
	int j=i-1;
	
	while(j>=0 && arr[j]>current) {
		
		arr[j+1]=arr[j];
		j--;
		
		
	}
	arr[j+1]=current;
}
System.out.println(Arrays .toString(arr));


int low =arr[0];
int high =arr.length-1;

int target=3;


	while (low <=high) {
	int mid =(low+high)/2;
	
	if (arr[mid]==target) {
		System.out.println(target+" target at found at "+mid);
		return;
	}
	
	if(target<arr[mid]) {
		high=mid-1;
	}else {
		low=mid+1;
	}
	
}
		}
	
	}

