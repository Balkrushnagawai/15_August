package april_23;

public class Star_Equilateral_Upward {
	public static void main(String[] args) {
		int space =(10/2)-1;
		int star=1;
		for (int i=1; i<=10/2; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for (int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space=space-1;
			
		}
	}

}
