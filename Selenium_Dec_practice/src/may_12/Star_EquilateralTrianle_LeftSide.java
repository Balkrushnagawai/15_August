package may_12;

public class Star_EquilateralTrianle_LeftSide {
	public static void main(String[] args) {
		int space=4;
		int star=1;
		for(int i=1; i<=9; i++)
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
			if(i<5)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			}
			}
			
		
	}


