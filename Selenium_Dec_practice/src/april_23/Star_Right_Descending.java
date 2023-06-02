package april_23;

public class Star_Right_Descending {
	public static void main(String[] args) {
		for(int i=1; i<=11; i++)
		{
			for(int a=1;a<=11-i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int a=1; a<=i; a++)
			{
				System.out.print(" ");
			}
			
		}
	}

}
