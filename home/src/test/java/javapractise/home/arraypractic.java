package javapractise.home;

import java.util.Arrays;

public class arraypractic {

	public static void main(String[] args) {
		//in array we store multiple data in one variable.array are fixed not changeable.we store data on the index.
		//index starts from 0 and number starts from 1.
		//store single data or value in single variable.
		String flower="rose";
		
		//Array we store multiple data in single variable.
		//syntax=datatype[]variable={data1,data2,data3};
		//example:store 5 flower name  
		String[]flower1= {"rose","beli","tulip","jui","daisy"};
		//store number 0 to 5
		int[]number= {1,2,3,4,5};
		
		//in array we store data in index.index starts from 0 and number starts from 1.
		//access data
		flower1[1];
		System.out.println(flower1[1]);
		System.out.println(flower1[0]);
		//print the value daisy
		System.out.println(flower1[4]);
		//change the data
		String[]fruit= {"mango","banana","apple","lemom","watermelon"};
		//exchange jacfruit and orange instead of apple,watermelon
		fruit[2]="jackfruit";
		System.out.println(fruit[2]);
		fruit[4]="orange";
		//print everything fruit
       System.out.println(Arrays.toString(fruit));
       
       //length of array
       System.out.println(fruit.length);
       System.out.println(flower1.length);
       
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
