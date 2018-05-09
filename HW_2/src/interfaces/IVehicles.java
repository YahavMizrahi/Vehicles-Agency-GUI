/**
 * @author Yahav Mizrahi
 * Id: 305759185
 * @author Inon Hirary
 * ID: 203409024
 */
package interfaces;

public interface IVehicles {
	
	public int getKm();
	public void setKm(int km);
	public String getModel();
	public void setModel(String model);
	public int getNumOfPassengers();
	public void setNumOfPassengers(int numOfPassengers);
	public int getMaxSpeed();
	public void setMaxSpeed(int maxSpeed);
	public void updateKM(int kmTest);
	
}
