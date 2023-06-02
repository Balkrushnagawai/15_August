package may_12_logicalProgramm;

public class Palendrom {
	public static void main(String[] args) {
		String m ="12321";
		String rev="";
		for(int i=m.length()-1; i>=0; i--)
		{
			rev=rev+m.charAt(i);
		}
		System.out.println(m);
		System.out.println(rev);
		if(m.equals(rev))
		{
			System.out.println("Given String is Palendrom");
		}
		else
		{
			System.out.println("Given String is not Palendrom");
		}
		
	}
}
