package may_19_StarPatternProgram;

public class Star_Upward_EquilateralTriangleWithSpace {
	public static void main(String[] args) {
		int star=1;
		int space=5;
		
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
			
			star=star+2;
			space--;
			
		}
	}

}
