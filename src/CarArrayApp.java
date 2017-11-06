import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author pratimakaza
 *
 */
public class CarArrayApp {

	/**
	 * @param args
	 * @param ipCarMake 
	 * @param ipCarModel 
	 * @param ipCarYear 
	 * @param ipCarPrice 
	 */
	public static void main(String[] args, Object ipCarMake, Object ipCarModel, Object ipCarYear, Object ipCarPrice) {
		
		// get the user input
		Scanner scan = new Scanner(System.in);
		int cars = 0;
		/* test case
		String make = "";
		String model = "";
		int year = 1900;
		double price = 00000.00; 
		*/
		CarArray car1 = new CarArray();
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars will you be entering?:");
		cars = scan.nextInt();
		//scan.next();
		ArrayList<CarArray> carArray = new ArrayList<CarArray>();
		//carArray.add(new CarArray(make, model));
		//if (cars > 0) {
			
			for (int i =1; i <= cars; i++) {
				scan.nextLine();
				//???carArray.add(new CarArray(ipCarMake, ipCarModel, int, double)));
				System.out.println("Enter Car #" + i + " Make: ");
				car1.setIpCarMake(scan.nextLine());
				//make = scan.nextLine();
				System.out.println("Enter Car #" + i + " Model: ");
				car1.setIpCarModel(scan.nextLine());
				//model = scan.nextLine();
				//scan.next();
				System.out.println("Enter Car #" + i + " Year: ");
				car1.setIpCarYear(scan.nextInt());
				//year = scan.nextInt();
				//scan.next();
				System.out.println("Enter Car #" + i + " Price: ");
				car1.setIpCarPrice(scan.nextDouble());
				//price = scan.nextDouble();
			}
		//}
		System.out.println(car1);
		//System.out.println(car1.toString()car1.getIpCarMake(), car1.getIpCarModel(), car1.getIpCarYear(), car1.getIpCarPrice());
		//System.out.println(make + "\t" + model + "\t" + year + "\t" + price);
		// create multiple instances of a Car object
		// display info
		scan.close();
	}

}
