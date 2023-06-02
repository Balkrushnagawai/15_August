package april_27;

public class Star_DseAsc_DescendingAsending {
	public static void main(String[] args) 
	{
		int star=8;
		for (int i=1; i<=16; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<8)
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
