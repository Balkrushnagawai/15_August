package may_05;

public class Star_DesAsc_Decreasing_Increasing {
	public static void main(String[] args) {
		int star = 10;
		for(int a=1; a<=20; a++)
		{
			for(int b=1; b<=star; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(a<10)
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
