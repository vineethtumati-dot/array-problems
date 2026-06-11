package dsaPractice;

import java.util.Arrays;
import java.util.Scanner;
public class linearsearch{


	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
	
		boolean repeat=true;
		while(repeat) {
			
		
System.out.println("enter the size of an array");

int size=sc.nextInt();		
		int []arr=new int[size];	
		System.out.println("array size is "+arr.length);
		

System.out.println("enter the elements in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("array is "+Arrays.toString(arr));
	
		boolean searchElementrepeat=true;
		while(searchElementrepeat) {
			
		
		System.out.println("enter the target");
		
		int target =sc.nextInt();
		boolean found =false;
		int index=-1;
	 for(int i=0;i<arr.length;i++) {
		 if(target ==arr[i]) {
			 found =true;
			 index=i;
			 break;
			 
		 } 
		
			 
		 }
	 
	if(found) {
		System.out.println("found at "+index);
	}else {
		System.out.println("not found ");
	}
	
	System.out.println("Do you want to search element again ? (yes/no)");
	 String choice2=sc.next();
	
	if(choice2.equalsIgnoreCase("yes")) {
	    searchElementrepeat = true;
	}
//	else if(choice2.equalsIgnoreCase("no")) {
	else {
		searchElementrepeat=false;
	}
//	else {
//	    System.out.println("Please enter only yes or no");
//	}
		}
		System.out.println("do you want to continue for next array?  (yes/no)" );
		String choice =sc.next();
		if(choice.equalsIgnoreCase("yes")) {
		    repeat = true;
		}
		else if(choice.equalsIgnoreCase("no")) {
		repeat =false;
		}
		else {
		    System.out.println("Please enter only yes or no");
		}
		}
	}
}
	