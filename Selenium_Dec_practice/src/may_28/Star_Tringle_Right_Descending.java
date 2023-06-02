package may_28;

public class Star_Tringle_Right_Descending {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
			for(int a=1; a<=10-i; a++)
			{
				System.out.print("*");
			}
			System.out.println();
			for(int a=1; a<=i; a++)
			{
				System.out.print(" ");
			}
			
		}
	}

}
