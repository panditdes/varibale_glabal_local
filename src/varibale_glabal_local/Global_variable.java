package varibale_glabal_local;

public class Global_variable {

	static String a = "Hello";    //global variable always declare before the main method

	public static void main(String[] args) {

		System.out.println(a);


	
		//System.out.println(b);
		
		demothod();

	}
	public static void demothod() {
		
		final String b = "classes";   //local variable

		System.out.println(a);
		System.out.println(b);
	}
}
