package driver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

import adapter.BuildAuto;
import except.AutoException;
import model.Automobile;
import model.OptionSet.Option;
import util.FileIO;

public class Driver2 {
	public static void main(String[] args) {
		
	final Formatter x;
	try{
		x=new Formatter("LoggingFile.txt");
	}
	catch(Exception e){
		
		System.err.println("This is an error");
	}
		
	Map<String,Automobile> lhm=new LinkedHashMap<String,Automobile>();
	Automobile a1,a2,a3,a4;
	BuildAuto ba=new BuildAuto();
	String txtFile="src/eadSource.txt";
	a1=ba.BuildAuto(txtFile);
	ba.PrintAuto();
	//Populating list of choices for a single automobile
	
	a1.setOptionChoice("Color","Liquid Grey Clearcoat Metallic");
	a1.setOptionChoice("Transmission","automatic");
	a1.setOptionChoice("Brakes/Traction Control","ABS");
	a1.setOptionChoice("Side Impact Air Bags"," present");
	a1.setOptionChoice("Power Moonroof"," not present");
	//Populating choice of the customer
	ArrayList<Option> b=a1.getOptionChoice();
	//Printing choice of customer
	//System.out.println(b);
	
	int total=18445+a1.getTotalPrice();
	System.out.println("The cost of the vehicle is"+total);
	
	
	
	//Printing linked hash map
	a2=ba.BuildAuto(txtFile);
	a3=ba.BuildAuto(txtFile);
	a4=ba.BuildAuto(txtFile);
	ba.PrintAuto();
	lhm.put("Ford", a1);
	lhm.put("Hyundai", a2);
	lhm.put("Honda", a3);
	lhm.put("Ferrari", a4);
	//update Optionsetname
	String Modelname="Ford";String OptionSetname="Color";String option="Fort Knox Gold Clearcoat Metallic";
	float newPrice=100;String newName="ColoringSTUFFFF";
	ba.updateOptionSetName(Modelname, OptionSetname, newName);
	ba.PrintAuto();
	//Updating option set price
	ba.updateOptionPrice(Modelname, OptionSetname, option, newPrice);
	ba.PrintAuto();
}
}