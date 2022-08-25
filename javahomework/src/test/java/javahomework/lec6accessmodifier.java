package javahomework;

public class lec6accessmodifier {
	//public access modifier
	public int num1=20;//public access modifier has no boundary
	//default modifier
	int num3=20;//it's default because i am not mension any thing
	
	//private access modifier
	private int num4=30;
	//how to create a method....accessmodifier returntype methodname(){}
	public void fbsignin( ) { //block of code
		
	}
	public void fbsignup() {//nothing to return we declare void
	}
	
	

	public static void main(String[] args) {
		
		int num=10;
		String flower="rose";
		//to create an object classname syntax is Classname objname=new classname();
		//object name can be anything.here we are writing myobj so that we can understand easily
		lec6accessmodifier myobj=new lec6accessmodifier();
		System.out.println(myobj.num1);
		System.out.println(myobj.num3);
		System.out.println(myobj.num4);
		myobj.fbsignin();
		
		
		
		

	}

}
