package may_04;

public class Star_Right_Ascending {
	public static void main (String[]args)
	{
		for(int i=0; i<=9; i++)
		{
			for(int a=1; a<=9-i; a++)
			{
				System.out.print(" ");
			}
			for(int a=0; a<=i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
