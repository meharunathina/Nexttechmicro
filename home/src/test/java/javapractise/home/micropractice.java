package javapractise.home;

public class micropractice {

	public static void main(String[] args) {
		// store an array name nissan.
		//values are nissan rouge,nissan pathfinder,nissan armanda.
		//store a int value name car value
		//if the car value is less than 20000$ it will print nissan rough,
		//if the car value is less than40000$ it will print nissan pathfinder
		//if the car value is more than 40000$ it will print nissan armara
		String[]nissan= {" nissan rouge","nissan pathfinder","nissan armanda"};
		int car=20000;
		if(car<20000) {
			System.out.println( nissan[0]);
		}
		else if(car<40000) {
			System.out.println(nissan[1]);
			}
			
			else { 
				System.out.println(nissan[2]);
				}
		
	
		

	}

}
