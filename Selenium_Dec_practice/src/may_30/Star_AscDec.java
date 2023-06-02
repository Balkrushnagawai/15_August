package may_30;

public class Star_AscDec {
	public static void main(String[] args) {
		int star=1;
		for(int i=1; i<=19; i++)
		{
			for(int a=1; a<star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<10)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
	}

}
