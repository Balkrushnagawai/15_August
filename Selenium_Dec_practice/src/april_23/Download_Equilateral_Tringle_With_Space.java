package april_23;

public class Download_Equilateral_Tringle_With_Space {
	public static void main(String[] args) {
		int star=10;
		for(int a=1;a<=10;a++)
		{
			for(int b=1;b<=star;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int b=1; b<=a; b++)
			{
				System.out.print("  ");
			}
			star=star-2;
		}
	}

}
