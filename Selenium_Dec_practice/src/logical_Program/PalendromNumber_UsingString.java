package logical_Program;

public class PalendromNumber_UsingString {
	public static void main(String[] args) {
		String x="Balkrushna";
		String rev ="";
		for(int i=x.length()-1; i>=0; i--)
		{
			rev=rev+x.charAt(i);
		}
		System.out.println(x);
		System.out.println(rev);
		if (x.equals(rev))
		{
			System.out.println("Given String is Palendrom");
		}
		else
		{
			System.out.println("Given String is not Palendrom");
		}
		/*String x= "12321";
		String rev ="";
		for(int i=x.length()-1; i>=0; i--)
		{
			rev =rev+x.charAt(i);
		}
		System.out.println(x);
		System.out.println(rev);
		if(x.equals(rev))
		{
			System.out.println("Given string is Palendrom");
		}
		else
		{
			System.out.println("Given String is Non-Palendrom");
		}*/
	}
	}


