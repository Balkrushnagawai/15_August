package logical_Program;

public class RemovalAllOccurenceOfAGivencharactorFromInputString {
	public static void main(String[] args) {
		String a=" I am going to school";
		char remove ='o';
		String b=null;
		for (int i=0; i<=a.length()-1; i++)
		{
			if(a.charAt(i)==remove)
			{
				b=a.replaceAll("o","");
			}
			
		}
		System.out.println(b);
	}

}
