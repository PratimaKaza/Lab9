/**
 * 
 */

/**
 * @author pratimakaza
 *
 */
public class UsedCarArray extends CarArray{

	private static double ipCarMileage;
	boolean usedCar = true;

	public UsedCarArray(String ipCarMake, String ipCarModel, int ipCarYear, double ipCarPrice, double ipCarMileage) {
		super(ipCarMake, ipCarModel, ipCarYear, ipCarPrice);
		UsedCarArray.ipCarMileage = ipCarMileage;
	}
	public double getIpCarMileage() {
		return ipCarMileage;
	}
	public void setIpCarMileage(double ipCarMileage) {
		UsedCarArray.ipCarMileage = ipCarMileage;
	}
	@Override
	public String toString() {
		return String.format("Make: %-10s Model: %-10s Year: %-10s Price: %-10s Mileage %-10s Used Car %-10s", 
				super.getIpCarMake(), super.getIpCarModel(), super.getIpCarYear(), super.getIpCarPrice(), ipCarMileage, usedCar);
	}
	
}
