package parkingTicket;

public class PoliceOfficer {
	parkingMeter pm=new parkingMeter();
	parkedCar pc=new parkedCar();
	ParkingTicket pt= new ParkingTicket();
	
	//the police officers name and badge identification information
	String name="Vamsavardhana Vijay";
	String badge="POLICEOFFICERBADGE";
	
	public static void main(String[] args)
	{
		PoliceOfficer po=new PoliceOfficer();
		
		//Check if ticket is to be issued to the car
		po.issueTicket();
		
	}
	
	public void issueTicket()
	{
		//Total time purchased for the car to remain in the parking spot
		int purchasedTime=pm.NoOfHours();
		
		//Total time the car has stayed in the parking spot 
		int totalTime=pm.setParkingTime();
		
		//If the purchased time is less than total Time, a fine is generated
		if (purchasedTime<totalTime)
		{
			pt.reportFine(totalTime);
		}
		
		//If the purchased time is greater than total time, the car will not have violated the parking meter
		else	{
			System.out.println("\n The car has not violated the parking meter");
		}
		pt.reportCar();
		
	}
	

}
