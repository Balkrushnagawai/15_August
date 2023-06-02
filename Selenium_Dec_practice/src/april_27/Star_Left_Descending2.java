package april_27;

public class Star_Left_Descending2 {
	public static void main(String[] args) {
		for(int a=1; a<=10; a++)
		{
			for( int b=1; b<=10-a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
