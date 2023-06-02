package logical_Program;

public class SwapStringWithout3rdVariable {
	public static void main(String[] args) {
		//Swap String without using 3rd Variable
		String s1= "good";
		String s2="evening";
		
		s2=s1.concat(s2); //goodevening
		s1=s2.replaceAll(s1,"");
		s2=s2.replaceAll(s1,"");
		System.out.println(s1);
		System.out.println(s2);
	}

}
