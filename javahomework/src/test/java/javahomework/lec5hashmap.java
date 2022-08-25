package javahomework;

import java.util.HashMap;

public class lec5hashmap {

	public static void main(String[] args) {
		//when we have pair value then we use java hashmap
		// / Create a HashMap object called capitalCities
		HashMap<String, String> statecity = new HashMap<String, String>();
		//how to add data in hashmap
		statecity.put("ny","albany");
		statecity.put("florida", "orlando");
		statecity.put("florida", "tampa");
		statecity.put("CA", "lasvegus");
		System.out.println(statecity);
		//1st one is key,2nd one value
		//access item
		statecity.get("ny");
		statecity.get("florida");
		statecity.get("florida");
		statecity.get("CA");
		System.out.println(statecity.get("ny"));
		System.out.println(statecity.get("florida"));
		System.out.println(statecity.get("florida"));
		System.out.println(statecity.get("CA"));
		//remove item
		statecity.remove("florida");
		System.out.println(statecity);
	}

}
