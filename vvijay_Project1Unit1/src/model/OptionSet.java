package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("serial")
public class OptionSet implements Serializable{
	private Option opt[];
	public String name;
	private int size;

	protected OptionSet()
	{
		
	}
	protected OptionSet(String n, int size) {
		opt = new Option[size];
		name = n;
		for (int i=0;i<size;i++)
		{
			opt[i]=new Option();
		}
	}
	protected void setOpSetOptions(String n, int size, String[] ar) {
		this.opt = new Option[size];
		this.name = n;
		for (int i=0;i<size;i++)
		{
			opt[i]=new Option();
		}
		int j=0;
		while(j<size)
		{
			opt[j].setName(ar[j]);
			j=j+1;
		}
	}

	
	@Override
	public String toString() {
		return "OptionSet [opt=" + Arrays.toString(opt) + ", name=" + name + ", size=" + size + "]";
	}
	public class Option implements Serializable {
		String name;
		float price;
		public String getName() {
			return name;
		}
		public void setName(String N) {
			this.name = N;
		}
		
		@Override
		public String toString() {
			return "Option [name=" + name + ", price=" + price + "]";
		}
		public float getPrice() {
			return price;
		}
		public void setPrice(int P) {
			this.price = P;

		}
		}
}
