package containerTask;

import java.util.Objects;

public class Bus 
{
	private String busName;
	private int busNumber;
	private String travelAgency;
	private String busType;
	private double avgSpeed;
	private int totalSpeed;
	
	public Bus(String busName, int busNumber, String travelAgency, String busType, double avgSpeed, int totalSpeed) 
	{
		
		this.busName = busName;
		this.busNumber = busNumber;
		this.travelAgency = travelAgency;
		this.busType = busType;
		this.avgSpeed = avgSpeed;
		this.totalSpeed = totalSpeed;
	}

	public String getBusName() {
		return busName;
	}

	public int getBusNumber() {
		return busNumber;
	}

	public String getTravelAgency() {
		return travelAgency;
	}

	public String getBusType() {
		return busType;
	}

	public double getAvgSpeed() {
		return avgSpeed;
	}

	public int getTotalSpeed() {
		return totalSpeed;
	}

	@Override
	public String toString() 
	{
		return "Bus [busName=" + busName + ", busNumber=" + busNumber + ", travelAgency=" + travelAgency + ", busType="
				+ busType + ", avgSpeed=" + avgSpeed + ", totalSpeed=" + totalSpeed + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return Double.doubleToLongBits(avgSpeed) == Double.doubleToLongBits(other.avgSpeed)
				&& Objects.equals(busName, other.busName) && busNumber == other.busNumber
				&& Objects.equals(busType, other.busType) && totalSpeed == other.totalSpeed
				&& Objects.equals(travelAgency, other.travelAgency);
	}
	

	
	
	
	
}
