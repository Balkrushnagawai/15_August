package may_19_StarPatternProgram;

public class Star_RightAscending {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int a=1; a<=10-i; a++)
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
