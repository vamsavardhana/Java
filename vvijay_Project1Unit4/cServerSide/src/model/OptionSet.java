package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import model.OptionSet.Option;

@SuppressWarnings("serial")
public class OptionSet implements Serializable{
	private ArrayList<Option> opt=new ArrayList<Option>();
	public String name;
	public int size;
	public void setOptionChoice(String optionName)
	{
		System.out.println(optionName);
		for(int i=0;i<this.opt.size();i++)
		{
			if(this.opt.get(i).name.contains(optionName))
			{
				this.opt.set(0, this.opt.get(i));
			}
			else{
			}
		}
		int i=1;
		int c=this.opt.size();
		while(this.opt.size()>1){
			this.opt.remove(i);
			}		
		//System.out.println("The elements in the array are"+this.opt);
	}
	public ArrayList<Option> getOptionChoice()
	{
		return this.opt;
	}
	public int findOption(String name1)
	{
		int i=0;int j=0;
		for(i=0;i<opt.size();i++)
		{
			if(opt.get(i).getName().equals(name1))
			{
				System.out.println("The optionset has"+i+"index\n");
				j=i;
			}
			else{
				//System.out.println("\nThe element doesn't exist");
			}
			
		}
		return j;
		}
	
//	protected OptionSet()
//	{
//		
//	}
//	
//	public Option[] getOpt() {
//		return opt;
//	}
//
//	public void setOpt(Option[] opt) {
//		this.opt = opt;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	protected void setOpSetOptions(String n, int size, String[] ar) {
		this.opt = new ArrayList<Option>();
		//System.out.println(ar);
		this.name = n;
		for (int i=0;i<size;i++)
		{
			opt.add(new Option());
		}
		int j=0;
		while(j<size)
		{
//			System.out.println(ar[j]);
//			System.out.println(opt.get(j));
			opt.get(j).setName(ar[j]);
			j=j+1;
		}
	}
	
	protected ArrayList<Option> getOpSetOptions() 
	{
		return opt;
	}
	
	@Override
	public String toString() {
		return "OptionSet [opt=" + opt + ", name=" + name + ", size=" + size + "]";
	}
	public class Option implements Serializable {
		String name;
		float price;
		
		public String getName() {
			return name;
		}
		public void setName(String N) {
			this.name = N;
			//System.out.println("The new name is" + this.name);
		}
		public void findOption(){
			
		}
		@Override
		public String toString() {
			return "Option [name=" + name +"]" ;//", price=" + price + "]"
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		}
	public void setPriceOption(int index, float newPrice) {
			opt.get(index).setPrice(newPrice);		
	}
}
