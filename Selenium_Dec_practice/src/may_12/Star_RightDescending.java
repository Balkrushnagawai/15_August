package may_12;

public class Star_RightDescending {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int a=0; a<=5-i; a++)
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
