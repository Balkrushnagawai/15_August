package may_30;

public class Star_Equilateral_Triangle_Upward_withSpace {
	public static void main(String[] args) {
		int star=1;
		for(int i=1; i<=6; i++)
		{
			for(int a=0; a<=5-i; a++)
			{
				System.out.print("  ");
			}
			for(int a=1; a<=star; a++)
			{
				System.out.print(" *");
			}
			System.out.println();
			star=star+2;
	}
	}
}
	
