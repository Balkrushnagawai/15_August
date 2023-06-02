package may_12;

public class Star_EquilateralTringle_Upward {
	public static void main(String[] args) {
		int space=2;
		int star=1;
		for(int i=1; i<=3; i++)
		{
			for(int a=1; a<=space; a++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
