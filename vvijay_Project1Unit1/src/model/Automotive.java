package model;

import java.io.Serializable;
import java.util.Arrays;

public class Automotive implements Serializable 
{ 
String name;
int basePrice;
public OptionSet opset[];

public Automotive(){}

@Override
public String toString() {
	return "Automotive [name=" + name + ", basePrice=" + basePrice + ", opset=" + Arrays.toString(opset) + "]";
}

public Automotive(String name, int basePrice) {
	super();
	this.name = name;
	this.basePrice = basePrice;
	OptionSet[] opset = new OptionSet[5];
	this.opset = opset;
	for(int i=0;i<5;i++)
	{
		opset[i]=new OptionSet();
	}
}
public void setoptn(int i,String name,int size,String [] ar){
	opset[i].setOpSetOptions(name, size, ar);
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
//}
//else if(opset[i].name=="Power Moonroof")
//{
//	int j=4;
//}
//i++;
//}
	

	
}
