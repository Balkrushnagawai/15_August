package logical_Program;

public class Find_Occurence_of_Character {
	public static void main(String[] args) {
		//count number of particular string
		//Find Occurrence of character o
		int counter=0;
		String s="Follower";
		for(int i=0; i<=s.length()-1; i++)
		{
			char x = s.charAt(i);
			if(x=='o')
			{
				counter++;
			}
		}
		System.out.println(counter);
		
		
		
	}

}
