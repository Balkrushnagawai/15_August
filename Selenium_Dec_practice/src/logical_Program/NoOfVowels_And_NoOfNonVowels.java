package logical_Program;

public class NoOfVowels_And_NoOfNonVowels {
	public static void main(String[] args) {
		String m="Balkrushna";
		String m1 =m.toLowerCase();
		int count=0;
		int count1= 0;
		for(int i=0; i<=m1.length()-1; i++)
		{
			char t =m1.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
			{
				count++;
			}
			else
			{
				count1++;
			}
				
		}
		System.out.println("No of Vowels is "+count);
		System.out.println("No of non-Vowels is "+count1);
		
	}

}
