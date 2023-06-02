package logical_Program;

public class NumberOfNonCharacterValue {
	public static void main(String[] args) {
		String m="Pune@123Katraj";
		String m1 = m.replaceAll("[^A-Za-z]","");
		int ans = m.length()-m1.length();
		System.out.println("Number of non Character value is "+ans);
		
	}

}
