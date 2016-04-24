package parkingTicket;

import java.util.Random;

public class ParkingTicket 
{

// A new car and parking meter are initialized for the car
parkedCar car=new parkedCar();
parkingMeter pm=new parkingMeter();

//report the make, model, color and license no. of car
	public void reportCar()
	{
	car.setMake();
	car.setLicenseno();
	car.setModel();
	car.setColor();
	System.out.println("\n The Make is \n"+car.a);
	System.out.println("The color is \n"+car.c);
	System.out.println("The model is \n"+car.b);
	System.out.println("The license number is \n"+car.d);
	}
	
//reports the fine if the car has violated the parking meter
	public void reportFine(int i)
	{
		int j=i;
		int base=25;
		int left=j-1;
		int ticketCost=base+(10*left);
		System.out.printf("\n The ticket cost was:%d \n",ticketCost);
	}
}
