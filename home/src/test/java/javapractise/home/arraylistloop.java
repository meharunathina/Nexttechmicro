package javapractise.home;

import java.util.ArrayList;

public class arraylistloop {

	public static void main(String[] args) {
		 //loop for arraylist
		ArrayList<String>car=new ArrayList<String>();
		car.add("bmw");
		car.add("audi");
		car.add("nissan");
		car.add("tesla");
		for(int i=0;i<car.size();i++){
			System.out.println(car.get(i));
		}
		
		

	}

}
