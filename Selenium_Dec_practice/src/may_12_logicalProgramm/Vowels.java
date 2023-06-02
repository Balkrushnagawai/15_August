package may_12_logicalProgramm;

public class Vowels {
	public static void main(String[] args) {
		String x= "Aalkrushna";
		String x1 = x.toLowerCase();
		int count=0;
		for(int i=0; i<=x.length()-1; i++)
		{
			char t = x1.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
