package may_12_logicalProgramm;

public class ReverseString {
	public static void main(String[] args) {
		String m="Balkrushna";
		m.toLowerCase();
		String rev="";
		for(int i=m.length()-1; i>=0; i--)
		{
			rev=rev+m.charAt(i); 
		}
		System.out.println(m);
		System.out.println(rev);
	}

}
