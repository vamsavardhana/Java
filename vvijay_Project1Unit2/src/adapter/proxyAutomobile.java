package adapter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import except.AutoException;
import model.Automobile;
import model.OptionSet;
import util.FileIO;

public abstract class proxyAutomobile {
	private Automobile a1;
	
	public Automobile getAuto()
	{
		return a1;
	}
	public Automobile BuildAuto(String txtFile) {

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
		return a1;
	}

	public void PrintAuto() {
		System.out.println(a1);
	}

public void updateOptionSetName(String Modelname, String OptionSetname, String newName) {
			
a1.updateOptionSetName(Modelname, OptionSetname, newName);


}
	
	

	public void updateOptionPrice(String Modelname, String OptionSetname, String option, float newPrice) {
	a1.updateOptionPrice1(Modelname, OptionSetname, option, newPrice);	
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
