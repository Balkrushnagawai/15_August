package may_19_StarPatternProgram;

public class Star_Downward_EquilateralTriangleWithSpace {
	public static void main(String[] args) {
		int star=11;
		for(int i=1; i<=6; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("* ");
			}
			System.out.println();
			for(int a=1; a<=i; a++)
			{
				System.out.print("  ");
			}
			star=star-2;
		}
	}

}
