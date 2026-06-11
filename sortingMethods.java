package dsaPractice;

import java.util.Arrays;

public class sortingMethods {


		
		int []arr= {2,2,3,5,7,4,6,5};
		
//		
//		
//		void bubbleSort () {
//			
//			for(int i=0;i<arr.length-1;i++) {
//				for(int j=0;j<arr.length-1-i;j++) {
//					if(arr[j]>arr[j+1]) {
//						int temp=arr[j];
//						arr[j]=arr[j+1];
//						arr[j+1]=temp;
//					}
//					
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//			
//		}
//		
//		//	int []arr= {2,2,3,5,7,4,6,5};
//		
//		
//		void selctionSort() {
//			
//			
//			for(int i=0;i<arr.length;i++) {
//				
//				int minIndex=i;
//				
//				for(int j=i+1;j<arr.length;j++) {
//					
//					if(arr[j]<arr[minIndex]) {
//						minIndex=j;
//					}
//					int temp=arr[i];
//					arr[i]=arr[minIndex];
//					arr[minIndex]=temp;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//		}
		
		void insertionSort () {
			
			
			for(int i=1;i<arr.length;i++) {
				int current =arr[i];
				int j=i-1;
				
				while(j>=0 && arr[j]>current) {
					arr[j+1]=arr[j];
					j--;
					
					
				}
				arr[j+1]=current;
			}
			System.out.println(Arrays.toString(arr));
		}
		public static void main(String[] args) {
			hi sc=new hi();
//			sc.bubbleSort ();
//			sc.selctionSort();
			sc.insertionSort();
		
		
	}
}
