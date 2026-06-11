package dsaPractice;

public class recursion {

	



	static void  printNumbrs(int n) {
		if(n==0) {
			return ;
		}
		printNumbrs(n-1);
		System.out.println(n);
		
	} 
	
	
	static int factorial(int n) {
		
		if(n==1) {
			return 1;
			
		}
		
		return n*factorial(n-1);
	}
	
	
	
public static void main(String[] args) {
	System.out.println("factorial "+factorial(5));
	printNumbrs(10);
	
}
}

