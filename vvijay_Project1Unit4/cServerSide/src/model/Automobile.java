package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import adapter.BuildAuto;
import model.OptionSet.Option;
import util.FileIO;

public  class Automobile implements Serializable 
{ 
String name;
int basePrice;
String make;
String model;
ArrayList<Option> choice=new ArrayList<Option>();
public synchronized void setOptionChoice(String setName,String OptionName)
{
	for(int i=0;i<opset.size();i++)
	{
		if(opset.get(i).getName().contains(setName))
		{
			opset.get(i).setOptionChoice(OptionName);
		}
	}
}
public synchronized int getTotalPrice()
{int total=0;
	for(int i=0;i<this.choice.size();i++)
	{
		//System.out.println("The price is "+this.choice.get(i).price);
		total =(int) (total+this.choice.get(i).price);
	}
	return total;	
}
public void findOutPriceAndTotalPrice()
{
	
	
	
}

public synchronized Automobile setPrices(){
	for(int i=0;i<4;i++)
	{
		if(this.opset.get(i).name.contains("Color"))
		{
			for(i=0;i<this.opset.get(i).size;i++)
			{
				this.opset.get(i).setPriceOption(i, 0);
			}
		}
		else if(this.opset.get(i).name.contains("Transmission"))
		{
			this.opset.get(i).setPriceOption(0, 0);
			this.opset.get(i).setPriceOption(1, -815);
		}
		else if(this.opset.get(i).name.contains("Brakes/Traction Control"))
		{
			this.opset.get(i).setPriceOption(0, 0);
			this.opset.get(i).setPriceOption(1, 400);
			this.opset.get(i).setPriceOption(2, 1625);
		}
		else if(this.opset.get(i).name.contains("Side Impact Air Bags"))
		{
			this.opset.get(i).setPriceOption(0, 0);
			this.opset.get(i).setPriceOption(1, 350);
		}
		else if(this.opset.get(i).name.contains("Power Moonroof"))
		{
			this.opset.get(i).setPriceOption(0, 0);
			this.opset.get(i).setPriceOption(1, 595);
		}
		else
		{
			
		}
		}
	return this;

	
}

public synchronized ArrayList<Option> getOptionChoice()
{for(int i=0;i<this.opset.size();i++){
	ArrayList<Option> c= this.opset.get(i).getOptionChoice();
	choice.addAll(c);
}
	return choice;
}
public synchronized String getMake()
{
	return this.make;
}
public synchronized String getModel()
{
	return this.model;
}
public synchronized void setMake(String s)
{
	this.make=s;
}
public synchronized void setModel(String s)
{
	this.model=s;
}
//public OptionSet opset[];
ArrayList<OptionSet> opset= new ArrayList<OptionSet>();
public synchronized int findOpset(String name)
{
	int i;
for(i=0;i<opset.size()-1;i++)
{
	if(opset.get(i).getName().equals(name))
	{
		//System.out.println("The optionset has"+i+"index\n");
		break;
	}else{
		System.out.println("The element doesn't exist");
	}
}
return i;
}


public synchronized String getName() {
	return name;
}

public synchronized void setName(String name) {
	this.name = name;
}

public synchronized int getBasePrice() {
	return basePrice;
}

public synchronized void setBasePrice(int basePrice) {
	this.basePrice = basePrice;
}

public synchronized ArrayList<OptionSet> getOpset() {
	return opset;
}

public synchronized void setOpset(ArrayList<OptionSet> opset) {
	this.opset = opset;
}
public synchronized void updateOptionSetName(String Modelname, String OptionSetname, String newName) {
	System.out.println("\nUPdating option set name.......\n");
	System.out.println("\nUPdating option set name.......\n");
	System.out.println("\nUPdating option set name.......\n");

	int i = 0;
System.out.println(this.getoptn(i).getName());
System.out.println(OptionSetname);
//	a1.getoptn(i).setName(newName);
//	System.out.println(a1.getoptn(i).getName());
while(i<this.opset.size()-1)
	{
String b=this.getoptn(i).getName();
		if (b.contains(OptionSetname))
		{
			System.out.println("Check if in the if bok");
			this.getoptn(i).setName(newName);
		}
		else
		{
		//	System.out.println("Continue cheking\n");
		}
		i++;
	}
}

public Automobile(){}

@Override
public synchronized String toString() {
	return "Total Price is"+totalprice+ ", basePrice=" + basePrice + ", make=" + make + ", model=" + model + ", opset="
			+ opset + "]";
}

public Automobile(String name, int basePrice) {
	super();
	this.name = name;
	this.basePrice = basePrice;
	ArrayList<OptionSet> opset = new ArrayList<OptionSet>(5);
	this.opset = opset;
	for(int i=0;i<5;i++)
	{
		opset.add(new OptionSet());
	}
	
	setOpset(opset);
	
}
public synchronized void setoptn(int i,String name,int size,String [] ar){
	OptionSet optionset=new OptionSet();
	this.opset.add(i, optionset);
	this.opset.get(i).setOpSetOptions(name, size, ar);
	}
public synchronized OptionSet getoptn(int i){	
	return opset.get(i);	
}

public synchronized void updateOptionPrice1(String Modelname, String OptionSetname, String option, float newPrice) {
	System.out.println("\nUPdating option set price.......\n");
	System.out.println("\nUPdating option set price.......\n");
	System.out.println("\nUPdating option set price.......\n");

	int i = 0;
	for (i = 0; i < 5; i++) {
		//System.out.println("Enter the loop");
		if (this.getoptn(i).getName().contains(OptionSetname)) {
			int index = this.getoptn(i).findOption(option);
			//System.out.println("The index off the option for price change is"+index);
			this.getoptn(i).setPriceOption(index, newPrice);
		}
	}
}
int OptionSetSize;
public int totalprice;
public void setOptionSetSize(int parseInt) {
	// TODO Auto-generated method stub
this.OptionSetSize=parseInt;	
}


//public int find(String n){
//int i=0;
//while(i<5)
//{
//if(opset[i].name=="color")
//{
//	int j=0;
//}
//else if(opset[i].name=="Transmission")
//{
//	int j=1;
//}
//else if(opset[i].name=="Brakes")
//{
//	int j=2;
//}
//else if(opset[i].name=="Side Impact Air Bags")
//{
//	int j=3;
//else if(opset[i].name=="Power Moonroof")
//{
//	int j=4;
//}
//i++;
//}
	

	
}
