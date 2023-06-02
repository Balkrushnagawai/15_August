package may_28;

public class Star_Triangle_Right_Ascending {
	public static void main(String[] args) {
		for(int i=1; i<=11; i++)
		{
			for(int a=1; a<=11-i; a++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
