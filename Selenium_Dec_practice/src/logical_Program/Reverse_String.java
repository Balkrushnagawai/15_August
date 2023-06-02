package logical_Program;

public class Reverse_String {
	public static void main(String[] args) {
		String x= "pune";
		String rev ="";
		for(int i=x.length()-1; i>=0; i--)
		{
			rev =rev+x.charAt(i);
		}
		System.out.println(x);
		System.out.println(rev);
	}

}
