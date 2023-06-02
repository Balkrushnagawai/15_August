package may_19_StarPatternProgram;

public class Star_LeftDescending {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int a=0; a<=10-i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
