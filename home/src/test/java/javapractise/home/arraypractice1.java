package javapractise.home;

import java.util.Arrays;

public class arraypractice1 {

	public static void main(String[] args) {
		// store 6 flower name
		String[]flower= {"rose","beli","chameli","jui","keya","tulip"};
		//access rose belly and print the data
		
	    System.out.println(Arrays.toString(flower));
	    System.out.println(flower[2]);
		flower[2]="jui";
		flower[5]="car";
		System.out.println(flower[2]);
		System.out.println(flower[5]);
		//array length
		System.out.println(flower.length);
		//what is the syntax is array
		String[]car= {"audi","bmw","toyota","mercedece"};
		//how to exchange data in array
		car[2]="nissan";
		System.out.println(car[2]);
		//how to get the length
		System.out.println(car.length);
		System.out.println(Arrays.toString(car));
		
		
		
		
		
		
		

	}

}
