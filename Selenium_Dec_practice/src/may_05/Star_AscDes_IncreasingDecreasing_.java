package may_05;

public class Star_AscDes_IncreasingDecreasing_ {
	public static void main(String[] args) {
		int star=1;
		for (int i=1; i<=20; i++)
		{
			for(int a=1; a<=star; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			if (i<10)
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
