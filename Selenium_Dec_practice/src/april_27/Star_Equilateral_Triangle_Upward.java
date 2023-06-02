package april_27;

public class Star_Equilateral_Triangle_Upward {
	public static void main(String[] args) {
		int star =1;
		for(int a=1; a<=10/2; a++)
		{
			for(int b=1; b<=5-a; b++)
			{
				System.out.print(" ");
			}
			for(int b=1; b<=star; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			star=star+2;
			
		}
	}
}
