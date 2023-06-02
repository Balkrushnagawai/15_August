package may_12;

public class Star_DseAsc_Descending_Ascending {
	public static void main(String[] args) {
		int star=5;
		for(int i=1; i<=9; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
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
