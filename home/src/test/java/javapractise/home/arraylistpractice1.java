package javapractise.home;

import java.util.ArrayList;

public class arraylistpractice1 {

	public static void main(String[] args) {
		// what is syntax of arraylist?
	 ArrayList<String>car=new ArrayList<String>();
	 //syntax of arraylist,code some bag
	 ArrayList<String>bag=new ArrayList<String>();
	 bag.add("michel kors");
	 bag.add("coach");
	 bag.add("gucci");
	 bag.add("brahmin");
	 System.out.println(bag);
	 //access data in arraylist
	 //in arraylist we use get method to access data
	 bag.get(0);
	 bag.get(3);
	 System.out.println(bag.get(0));
	 System.out.println(bag.get(3));
	 //change the value of prada
	 //change item we use set method
	 bag.set(2,"prada");
	 System.out.println(bag.set(2,"prada"));
	 //change the item in arraylist we use set method .change brahmin instead of kate spade
	 bag.set(3,"kate spade");
	 System.out.println(bag.set(3,"kate spade"));
	 //remove item.just remove one item or particular data
	 bag.remove(1);
	 System.out.println(bag.remove(1));
	 //if i want to clear every thing.usually we don't use this method bcz it's delete everything.
	 //size of arraylist
	 bag.size();
	 System.out.println(bag.size()); 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 

	}

}
