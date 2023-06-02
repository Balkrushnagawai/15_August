package casting;

public class Son extends Father{
	void bike()
	{
		System.out.println("Jawa");
	}
	public void car()
	{
		System.out.println("Oodi");
	}
	
	public static void main(String[] args) {
		
		Father f=new Father ();
		f.bike(); //Bullet
		f.car();  //Suzuki
		
		Son s = new Son();
		s.bike();  //Jawa
		s.car();	//Oodi
		
		Father f1 =new Son();
		f1.bike();
		f1.car();
	}
	

}
