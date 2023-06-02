package april_23;

public class Star_Left_Ascending {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for (int a=1; a<=i; a++)
			{
				System.out.print("*");
			}
			for(int a=1; a<=10-i; a++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
