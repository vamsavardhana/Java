package scale;

import java.util.LinkedHashMap;
import java.util.Scanner;

import adapter.BuildAuto;
import adapter.HashMapInterface;
import model.Automobile;

public class EditOptions extends BuildAuto implements Runnable,HashMapInterface{

	//public static Automobile a1=new Automobile();
static int l=0;
LinkedHashMap<String, Automobile> lhnew;
String modelname;

	public EditOptions(Automobile a2)
	{
				System.out.println("Enter the transmission from list of options\n");
		System.out.println(a1.getoptn(1));
		//		System.out.println(this.a1);}
	}

	public EditOptions() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			synchronized (Automobile.class){
				lhnew=getHashMap();
				System.out.println("Enter the color from list of options\n");
				System.out.println(a1.getoptn(0));
				Scanner n1=new Scanner(System.in);
				String n1n=n1.nextLine();
				a1.setOptionChoice("Color",n1n);
				Scanner n2=new Scanner(System.in);
				String n2n=n2.nextLine();
				a1.setOptionChoice("Transmission",n2n);
				System.out.println("Enter the Brakes/Traction control from list of options");
				System.out.println(a1.getoptn(2));
				Scanner n3=new Scanner(System.in);
				String n3n=n3.nextLine();
				a1.setOptionChoice("Brakes/Traction control",n3n);
				System.out.println("Enter the Side Impact Air Bags from list of options");
				System.out.println(a1.getoptn(3));
				Scanner n4=new Scanner(System.in);
				String n4n=n4.nextLine();
				a1.setOptionChoice("Side Impact Air Bags",n3n);
				System.out.println("Enter the Power Moonroof from list of options");
				System.out.println(a1.getoptn(4));
				Scanner n5=new Scanner(System.in);
				String n5n=n5.nextLine();
				a1.setOptionChoice("Power Moonroof",n3n);

				lhnew.put(modelname, a1);
				System.out.println("The contents of the linked hash map are - \n" +lhnew);
				l++;
			}
		}
		catch(Exception e){}
			}

	public EditOptions(String modelname)
	{
		this.modelname=modelname;
	}
}
