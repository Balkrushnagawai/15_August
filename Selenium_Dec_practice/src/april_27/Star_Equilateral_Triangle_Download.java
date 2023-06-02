package april_27;

public class Star_Equilateral_Triangle_Download {
	public static void main(String[] args) {
		int space =10;
		for(int a=1; a<=10; a++)
		{
			for(int b=1; b<=space; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int b=1; b<=a; b++)
			{
				System.out.print(" ");
			}
			space=space-2;
			
		}
	}
}
