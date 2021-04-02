package TreemapComparator;

public class Engine 
{
	int noOfVolves;
	int NoOfSylindes;
	int fuelCapasity;
	public Engine(int noOfVolves, int noOfSylindes, int fuelCapasity) 
	{
		super();
		this.noOfVolves = noOfVolves;
		NoOfSylindes = noOfSylindes;
		this.fuelCapasity = fuelCapasity;
	}
	@Override
	public String toString() {
		return "Engine [noOfVolves=" + noOfVolves + ", NoOfSylindes=" + NoOfSylindes + ", fuelCapasity=" + fuelCapasity
				+ "]";
	}
	
}
