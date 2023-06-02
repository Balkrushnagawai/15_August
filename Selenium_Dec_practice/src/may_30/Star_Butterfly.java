package may_30;

public class Star_Butterfly {
	public static void main(String[] args) {
		int star1=1;
		int space1=9;
		int star2=1;
		int space2=8;
		for(int i=1; i<=19; i++)
		{
			for(int a=1; a<=star1; a++)
			{
				System.out.print("*");
			}
			for(int a=1; a<=space1; a++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=space2; a++)
			{
				System.out.print(" ");
			}
			for(int a=1; a<=star1; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<9)
			{
				star1++;
				space1--;
				star2++;
				space2--;
			}
			else
			{
				star1--;
				space1++;
				star2--;
				space2++;
			}	
		}
	}

}
