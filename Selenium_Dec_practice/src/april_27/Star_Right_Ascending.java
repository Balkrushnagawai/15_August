package april_27;

public class Star_Right_Ascending {
	public static void main(String[] args) {
		for(int a=1; a<=10; a++)
		{
			for(int b=1; b<=10-a; b++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=a; b++)
			{
				System.out.print("*");
			}	
			System.out.println();
					
		}
		
	}
}
