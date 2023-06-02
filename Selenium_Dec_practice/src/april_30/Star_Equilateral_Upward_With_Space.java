package april_30;

public class Star_Equilateral_Upward_With_Space {
	public static void main(String[] args) {
		int space=5;
		int star=1;
		for(int i=1; i<=6; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print("  ");
			}
			for(int a=1; a<=star; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space = space-1;
			star=star+2;
		}
		
	}
}
