package parkingTicket;
import java.util.*;
import java.util.Random;
public class parkingMeter 
{
	
	int totalTime;
	public int NoOfHours() 
	{
		//Get the number of hours driver wants to purchase
		System.out.println("\n Enter the number of hours you want to purchase: \n");	
		Scanner park=new Scanner(System.in);
		String n=park.nextLine();
		int i = Integer.parseInt(n);
		return i;
	}
	
	public int setParkingTime()
	{
	
	//Randomize the start and stop Times to be between 0 and 10 hours
	//Monitor the Time a car is parked as startTime
	Random rand=new Random();
	int startTime=rand.nextInt(10);
	System.out.printf("The start Time was: \n %d",startTime);
	
	//Monitor the Time a car is being moved from the parking spot as stopTime
	int stopTime=rand.nextInt(10);
	System.out.printf("\n The stop Time was: \n %d",stopTime);
	
	//Total time taken will be passed as output
	int totalTime=stopTime-startTime;
	if(totalTime<0)
	{
		totalTime=totalTime*(-1);
	}
	System.out.printf("\n The total Time was: \n %d",totalTime);
	return totalTime;
	}
}
