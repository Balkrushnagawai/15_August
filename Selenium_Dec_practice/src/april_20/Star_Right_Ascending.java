package april_20;

public class Star_Right_Ascending {
	public static void main(String[] args) {
		for (int a=1; a<=5; a++)
		{
			for(int c= 1; c<=5-a; c++)
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
