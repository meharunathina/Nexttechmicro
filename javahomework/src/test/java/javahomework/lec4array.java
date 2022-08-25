package javahomework;

import java.util.Arrays;

public class lec4array {

	public static void main(String[] args) {
		// string[]car
		String[]car= {"nisan","toyota"};
		
		//four flower name in flower variable
		String[] flowers= {"rose","lily","dalia","tulip"};
		try {
		//store numbers 1 to 5 by using array
		int[]number= {1,2,3,4,5};
		//access data
		//flowers[0];
		System.out.println(flowers[0]);
		//flowers[2]
		System.out.println(flowers[3]);
		System.out.println(flowers[3]);
		}catch(Exception e) {
			System.out.println("array output exception");
		}
		
	//change the data
		String[]fruits= {"mango","watermelon","orange","apple"};
		//exchange jackfruit with watermelon
		System.out.println(fruits[1]);
		System.out.println(fruits);
		System.out.println(Arrays.toString(fruits));
		System.out.println(fruits.length);

	}

}
