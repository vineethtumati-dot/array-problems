	package dsaPractice;
	import java.util.Scanner;

	public class sorting{
					
		public static void main(String[] args) {
			
		boolean repeat=true;
while(repeat) {
			Scanner sc= new Scanner(System.in);
			 boolean ascendingSort=true;
			 boolean descendingSort=true;
			 
			
			System.out.println("enter the size");
		int size =sc.nextInt();
			int []arr=new int[size];
			
			System.out.println("array size is "+arr.length);
	
			
			System.out.println("enter the elements");
			for(int i=0;i<arr.length;i++) {
			 arr[i] =sc.nextInt();
			
			}
			

			for(int i=0;i<arr.length-1;i++) {
			 if(arr[i]>arr[i+1]) {
				 ascendingSort =false;
				
				    }
			 if(arr[i]<arr[i+1]) {
				 descendingSort =false;
				 
			 }
			
			 }
			
			 
			 
		
			
			if(ascendingSort) {
			
				System.out.println("sorted is "+ascendingSort);
				
			}
			else  if (descendingSort){
				System.out.println("sorted is "+descendingSort);
			}
			else {
				System.out.println("not sorted");
			}
			
			
			if(repeat) {
			}
		}
		}
	}
	
	