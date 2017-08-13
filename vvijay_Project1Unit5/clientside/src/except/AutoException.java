package except;

import java.util.Date;

import adapter.BuildAuto;
import model.Automobile;

public class AutoException extends Exception{
//implementation of fix function
	
//	public AutoException(String s)
//	{
//		System.out.println(s);
//	}
	public String fix(int errno)
	{	
	Fix1to100 f1 = new Fix1to100();
	switch(errno)
	{
	case 123:String a= f1.fix1(errno);
	{
		return a;	}
	default:System.out.println("hasn't gone to the error no. 123");
	}
	return null;
	}
	
	//enumeration of all exceptions
	public enum Except {
	 AutomobileExcept(123,"This is automobile cost exception");
	private final String errormessage;
	private final int errorno;
	Except(int erno,String ermsg)
	{
		this.errormessage=ermsg;
		this.errorno=erno;
	}
	public void date(){
		Date dt=new Date();
		System.out.println("The timestamp of the error is : "+dt.toString() );
	}
	public String getErmsg()
	{
		return this.errormessage;
	}
	public int getErno()
	{
		return this.errorno;
	}	
}
	
	
	
}
