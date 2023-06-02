package logical_Program;

public class Swapping_2_Numbers {
	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before swapping values are." +a+" "+b);
		//logic 1 - Third variable
		/* int t=a;
		a=b;
		b=t;
		System.out.println("After swapping values are." +a+" "+b);*/
		
		//logic 2 -use + & - without using third variable
		
		/*a= a+b;//10+20=30
		b= a-b;//30-20=10;
		a=a-b; //30-10=20;
		System.out.println("After swapping values are." +a+" "+b);*/
		
		//logic 3 - use * and /
		/*a= a*b; //10*20=200
		b=a/b;
		a=a/b;
		System.out.println("After swapping values are." +a+" "+b);*/
		
		//logic 4 - Bitwise XOR(^)
		
		//logic 5 - Single Statement
		b=a+b-(a=b);
		System.out.println("After swapping values are." +a+" "+b);
	}

}
