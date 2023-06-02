package april_30;

public class Star_Triangle_Left_Descending {
	public static void main(String[] args) {
		for(int i=1; i<=11; i++)
		{
			for(int a=1; a<=12-i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
