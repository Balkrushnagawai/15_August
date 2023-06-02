package april_23;

public class Upward_Equilateral_Tringle_With_Space {
	public static void main(String[] args) {
		int line=12/2;
		int star=11;
		int space=1;
		for(int i=1; i<=line; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int a=1; a<=space; a++)
			{
				System.out.print("  ");
			}
			star = star-2;
			space = space+1
					;
		}
	}

}
