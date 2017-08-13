package adapter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import except.AutoException;
import model.Automobile;
import model.LHM;
import model.OptionSet;
import util.FileIO;

public abstract class proxyAutomobile {
	public Automobile a1;
	LinkedHashMap<String,Automobile> lhm=new LinkedHashMap<String,Automobile>();
	
	public Automobile getAuto()
	{
		return a1;
	}
	public Automobile BuildAuto(String txtFile) {
			FileIO ff=new FileIO();
		System.out.println("Enter the car name \n");
		Scanner s1 = new Scanner(System.in);
	String name = s1.nextLine();
//		System.out.println("Enter the car price\n");
//		Scanner s2 = new Scanner(System.in);
//		String cost = s2.nextLine();
//		int costint = Integer.parseInt(cost);
	int costint=100;
		a1 = new Automobile(name, costint);
		try {
			a1 = FileIO.readFile(a1, txtFile);
			a1=a1.setPrices();
		} catch (AutoException e) {
			// TODO Auto-generated catch block
			e.fix(123);
		}
		String filename="src/sample_properties.txt";String filetype="FILE_TYPE";
		ff.properties(filename,filetype);
		return a1;
	}

	public void printAuto() {
		System.out.println(a1);
	}
	
	public LinkedHashMap<String,Automobile> getHashMap()
	{
		return lhm;
	}

public void updateOptionSetName(String Modelname, String OptionSetname, String newName) {
			
a1.updateOptionSetName(Modelname, OptionSetname, newName);


}
	public void updateOptionPrice(String Modelname, String OptionSetname, String option, float newPrice) {
	a1.updateOptionPrice1(Modelname, OptionSetname, option, newPrice);	
	}
	
	//CRUD Operations for Linked hash map
	public void Create(String l1){
		BuildAuto ba=new BuildAuto();
		a1=ba.BuildAuto("src/ReadSource.txt");
		System.out.println("Enter the color from list of options\n");
		System.out.println(a1.getoptn(0));
		Scanner n1=new Scanner(System.in);
		String n1n=n1.nextLine();
		a1.setOptionChoice("Color",n1n);
		System.out.println("Enter the transmission from list of options\n");
		System.out.println(a1.getoptn(1));
		Scanner n2=new Scanner(System.in);
		String n2n=n2.nextLine();
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
		lhm.put(l1, a1);
	}
	public void Read(String l1){
		for(String key:lhm.keySet())
		{
			if(key.contains(l1))
			{
				a1=lhm.get(key);
			}
				
		}
		System.out.println(a1);
		
	}
	public Automobile Update(String l1){
		BuildAuto ba=new BuildAuto();
		a1=ba.BuildAuto("src/ReadSource.txt");
		
		for(String key:lhm.keySet())
		{
			if(key.contains(l1))
			{
				a1=lhm.get(key);
			}
				
		}
		System.out.println("Enter the color from list of options\n");
		System.out.println(a1.getoptn(0));
		Scanner n1=new Scanner(System.in);
		String n1n=n1.nextLine();
		a1.setOptionChoice("Color",n1n);
		System.out.println("Enter the transmission from list of options\n");
		System.out.println(a1.getoptn(1));
		Scanner n2=new Scanner(System.in);
		String n2n=n2.nextLine();
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
		return a1;
	
	}
	public void Delete(String l1){
		lhm.remove(l1);
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// {
	// int i = 0;
	// //Get opset corresponding to opset name
	// while(i<a1.opset.length)
	// {
	// if(a1.opset[i].getName()==OptionSetname)
	// {
	// break;
	// }
	// else
	// {
	// i++;
	// }
	// }
	// OptionSet[] c=a1.opset;
	// //Get option corresponding to option name in opset
	// while(i<c.getSize())
	// {
	// if(c.getOptionName()==OptionSetname)
	// {
	// break;
	// }
	// else
	// {
	// i++;
	// }
	// }
	//
	// return a1;
	// }

	
	
}
