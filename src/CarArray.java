/**
 * 
 */

/**
 * @author pratimakaza
 *
 */
public class CarArray {
	//Data members for car details
	private static String ipCarMake;
	private static String ipCarModel;
	private static int ipCarYear;
	private static double ipCarPrice;
	
	//no-arguments constructor that sets data members to default values
	public CarArray() {
		
	}
	//constructor with four arguments matching above set
	public CarArray(String ipCarMake, String ipCarModel, int ipCarYear, double ipCarPrice) {
		CarArray.ipCarMake = ipCarMake;
		CarArray.ipCarModel = ipCarModel;
		CarArray.ipCarYear = ipCarYear;
		CarArray.ipCarPrice = ipCarYear;
	}
	//Getters and setters for all data members
	public String getIpCarMake() {
		return ipCarMake;
	}
	public void setIpCarMake(String ipCarMake) {
		CarArray.ipCarMake = ipCarMake;
	}
	public String getIpCarModel() {
		return ipCarModel;
	}
	public void setIpCarModel(String ipCarModel) {
		CarArray.ipCarModel = ipCarModel;
	}
	public int getIpCarYear() {
		return ipCarYear;
	}
	public void setIpCarYear(int ipCarYear) {
		CarArray.ipCarYear = ipCarYear;
	}
	public double getIpCarPrice() {
		return ipCarPrice;
	}
	public void setIpCarPrice(double ipCarPrice) {
		CarArray.ipCarPrice = ipCarPrice;
	}
	// toString() method returning a formatted string
	@Override
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: %10s", ipCarMake, ipCarModel, ipCarYear, ipCarPrice);
	}

}
