package logical_Program;

import java.util.Arrays;

public class Compare_Two_int_Arrray {
	public static void main(String[] args) {
		int array[]= {10,15,20,25};
		int array1[]= {10,20,30,40};
		int array2[]= {10,20,30,40};
		
		
		
		System.out.println(Arrays.equals(array, array1));
		System.out.println(Arrays.equals(array1,array2));
	}

}
