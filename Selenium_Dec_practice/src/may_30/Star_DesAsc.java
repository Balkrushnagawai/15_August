package may_30;

public class Star_DesAsc {
	public static void main(String[] args) {
		int star=10;
		for(int i=1; i<=19; i++)
		{
			for(int a=1; a<star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<10)
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
