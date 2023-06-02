package april_17;

public class Star_Right_Descending {
	public static void main(String[] args) {
		for(int a=1; a<=7; a++ )
		{
			for(int b=a; b<=7; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			for ( int c=1; c<=a; c++)
			{
				System.out.print(" ");
			}
		}
	}

}
