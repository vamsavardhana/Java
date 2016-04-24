package except;

import adapter.BuildAuto;

//helper class for automobilecostexception
	public class Fix1to100{
	public String fix1(int errno)
	{
		System.out.println("Come to the Fix source name method block in the exception class");
		String realname="src/ReadSource.txt";
		return realname;
	}
	public void fix2(int errno)
	{
	System.out.println("Come to the Fix1 method block in the exception class");
	BuildAuto bb=new BuildAuto();
	bb.BuildAuto();
	bb.printAuto();
	}
	}