package javapractise.home;

public class homepractic {

	public static void main(String[] args) {
		//using else if conditions
				// if weight of a vehicle is less then or equal 60kg toll will be 120tk
				//if weight of a vehicle is more then 60kg and less then or equal 300kg toll will be 500tk
				//if weight of a vehicle is more then 300kg and less then or equal 1000kg toll will be 1000tk
				//if weight of a vehicle is more then 1000kg and less then or equal 5000kg toll will be 2000tk
				//if weight of a vehicle is more then 5000kg not allowed to use the bridge
		int weight=200;
if(weight<=60) {System.out.println(" weight of a vehicle is less then or equal 60kg toll will be 120tk");		

	}
else if(weight<=300) {System.out.println("weight of a vehicle is more then 60kg and less then or equal 300kg toll will be 500tk");
}
else if(weight<=1000) {System.out.println("weight of a vehicle is more then 300kg and less then or equal 1000kg toll will be 1000tk");
	}
else if(weight<=5000) {System.out.println("weight of a vehicle is more then 1000kg and less then or equal 5000kg toll will be 2000tk");
}
else {System.out.println("weight of a vehicle is more then 5000kg not allowed to use the bridge"); 
	}
}
}



