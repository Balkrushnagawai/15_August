package logical_Program;

public class Vowels {
	public static void main(String[] args) {
		String m="Aasam";
		String m1 = m.toLowerCase();
		int count =0;
		for (int i=0; i<=m1.length()-1; i++)
		{
			char t = m1.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
			{
				count++;
			}
		}
		System.out.println("No of vowels is "+ count);
	}

}
