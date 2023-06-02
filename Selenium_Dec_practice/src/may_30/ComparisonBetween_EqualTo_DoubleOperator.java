package may_30;

public class ComparisonBetween_EqualTo_DoubleOperator {
	public static void main(String[] args) {
		String s1 ="Akshay";
		String s2 ="Akshay";
		String s3 =new String ("Akshay");
		
		// "==" operator are used for reference/address comparison
		// .equals() method is used to compare data between the two String
		
		System.out.println(s1==s2);  //Result=True
		System.out.println(s1==s3);	 //Result=false
		
		boolean b= s1.equals(s3);
		boolean b1= s1.equals(s2);
		System.out.println(b);
		System.out.println(b1);
	}

}
