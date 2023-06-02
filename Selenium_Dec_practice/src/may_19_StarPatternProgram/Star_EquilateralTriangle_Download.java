package may_19_StarPatternProgram;

public class Star_EquilateralTriangle_Download {
	public static void main(String[] args) {
		int star=11;
		int space=1;
		for(int i=1; i<=6; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			star=star-2;
			space++;
		}
	}

}
