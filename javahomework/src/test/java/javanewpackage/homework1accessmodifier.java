package javanewpackage;

public class homework1accessmodifier {
	String flower="rose" ;
	int num=20;
	public String flower1="jui";
	public int num2=30;
	private String flower3="tulip";
	private int num3=60;
	
	
	

	public static void main(String[] args) {
		//create an object ....syntax is classname objectnam=new classname();
		//object name can be anything
		
		homework1accessmodifier myobj=new homework1accessmodifier();
		System.out.println(myobj.num3);
		System.out.println(myobj.flower3);
		System.out.println(myobj.flower1);
		
		

	}

}
