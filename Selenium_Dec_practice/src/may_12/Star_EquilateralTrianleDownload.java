package may_12;

public class Star_EquilateralTrianleDownload {
	public static void main(String[] args) {
		int star=5;
		int space=1;
		for(int i=1; i<=3; i++)
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
