package dsaPractice;
import java.util.Scanner;

import java.util.Arrays;

public class ReversArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	boolean repeat =true;
	
		while(repeat) {
	
		System.out.println("enter the size of array");
	  int size =sc.nextInt();
		String []arr=new String [size];
		
		System.out.println("enter the elements in array");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		System.out.println(Arrays.toString(arr));


	int start=0;
	int end=arr.length-1;
	  
	while(start<end) {
	String 	temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
		
	}
	System.out.println("reverse array is " +Arrays.toString(arr));
		
	System.out.println("do you want to continue ? (yes/no)");
       String choice =sc.next();
		if(choice.equalsIgnoreCase("yes")||choice.equalsIgnoreCase("no")){
	break;
		}

		
     System.out.println("Please enter only yes or no");
		
		if(choice.equalsIgnoreCase("no")) {

		}
		}
	
}
}
		
		
		
		
		

		
		
		
	
