package javapractise.home;

import java.util.HashMap;

public class hashmappractice {

	public static void main(String[] args) {
		//store multiple pair value in one variable.when we have multiple pair value then we use hashmap
		//in hash map 1st one is key 2nd one is value
		//it can store diffrent type like ,string--string  string--integer   integer---string
		//syntax of hashmap
		HashMap<String,String>statecity=new HashMap<String,String>();
		
		
		//how to add in hashmap.in hashmap we use put meathod
		statecity.put("fl", "orlando");
		statecity.put("tx", "irving");
		statecity.put("fl", "tampa");		
		statecity.put("ca", "lv");
		System.out.println(statecity);
		
		
		//access an item.in access we use get method
		statecity.get("fl");
		statecity.get("tx");
		statecity.get("fl");
		statecity.get("ca");
		System.out.println(statecity.get("fl"));
		System.out.println(statecity.get("tx"));
		System.out.println(statecity.get("fl"));
		System.out.println(statecity.get("ca"));
		
		
		//remove an item
		statecity.remove("ca");
		System.out.println(statecity.get("ca"));
		
		//size method.to find how many item there are we use size method.
		statecity.size();
		System.out.println(statecity.size());
		
	
		

	}

}
