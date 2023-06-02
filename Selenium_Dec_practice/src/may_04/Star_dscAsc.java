package may_04;

public class Star_dscAsc {
	public static void main (String[]args)
	{
		int star=9;
		for(int i=0; i<=20; i++)
		{
			for(int a=0; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<0)
			{
				star--;
			}
			else
			{
				star++;
			}	
		}
	}

}
