package parkingTicket;

import java.util.Scanner;

public class parkedCar 
{
	static String a,b,c,d;
	
	//Gets the make of the car
	public String getMake()
	{
		return a;
	}
	
	//Sets the make of the car
	public void setMake()
	{
		System.out.println("Enter the make of the car");
		Scanner make=new Scanner(System.in);
		this.a=make.nextLine();
		
	}
	
	//Gets the model of the car
	public String getModel()
	{
		return b;
	}
	
	//Sets the model of the car
	public void setModel()
	{
		System.out.println("Enter the model of the car");
		Scanner model=new Scanner(System.in);
		this.b=model.nextLine();
		
	}
	
	//Gets the color of the car
	public String getColor()
	{
		return c;
	}
	
	//Sets the color of the car
	public void setColor()
	{
		System.out.println("Enter the color of the car");
		Scanner color=new Scanner(System.in);
		this.c=color.nextLine();
		
	}
	
	//Gets the License Number of the car
	public String getLicenseno()
	{
		return d;
	}
	
	//Sets the License Number of the car
	public void setLicenseno()
	{
		System.out.println("Enter the license No. of the car");
		Scanner Licenseno=new Scanner(System.in);
		this.d=Licenseno.nextLine();
	}
	}
