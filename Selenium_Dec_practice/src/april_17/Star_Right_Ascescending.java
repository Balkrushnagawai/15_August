package april_17;

public class Star_Right_Ascescending {
	public static void main(String[] args) {
		for(int a=1; a<=7; a++ )
		{
			for(int b=1; b<=7-a; b++)
			{
				System.out.print(" ");
			}
			for (int c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
