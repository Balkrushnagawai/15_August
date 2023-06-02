package april_23;

public class Star_Equilateral_Download {
	public static void main(String[] args) {
		int line=9;
		for (int s=0; s<=9; s++)
		{
			for(int i=0; i<=line; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int a=0; a<=s; a++)
			{
				System.out.print(" ");
			}
			line =line-2;
		}
		
	}

}
