package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Logger;

import except.AutoException;
import model.Automobile;

public class FileIO{

	public static Automobile readFile(Automobile a, String txtFile)  throws AutoException{
		while(true){
		try {
			boolean bool=false;
			
			
			File f = new File(txtFile);
			//System.out.println("out the if");
			
			if(f.exists()) { 
				
				FileReader file = new FileReader(txtFile);
			BufferedReader buff = new BufferedReader(file);
			int i = 0;
			String ar[] = new String[10];
			String br[] = new String[2];
			String cr[] = new String[3];
			String dr[] = new String[2];
			String er[] = new String[2];

			// Read the color of the car
			String line1 = buff.readLine();
			String token = ",";
			StringTokenizer st1 = new StringTokenizer(line1, token);
			String name = "Initial";
			if (st1.hasMoreTokens()) {
				name = st1.nextToken();
			}
			while (st1.hasMoreTokens()) {
				ar[i] = st1.nextToken();
				i = i + 1;
			}
			int size = i;
			int j = 0;
			System.out.println(Arrays.toString(ar));
			a.setoptn(j, name, size, ar);
			// Read the color of the car
			i = 0;
			String line2 = buff.readLine();
			StringTokenizer st2 = new StringTokenizer(line2, token);
			if (st2.hasMoreTokens()) {
				name = st2.nextToken();
			}
			while (st2.hasMoreTokens()) {
				br[i] = st2.nextToken();
				i = i + 1;
			}
			size = i;
			j = 1;
			System.out.println(Arrays.toString(br));
			a.setoptn(j, name, size, br);
			// Read the color of the car
			i = 0;
			String line3 = buff.readLine();
			StringTokenizer st3 = new StringTokenizer(line3, token);
			if (st3.hasMoreTokens()) {
				name = st3.nextToken();
			}
			while (st3.hasMoreTokens()) {
				cr[i] = st3.nextToken();
				i = i + 1;
			}
			size = i;
			j = 2;
			System.out.println(Arrays.toString(cr));
			a.setoptn(j, name, size, cr);
			// Read the color of the car
			i = 0;
			String line4 = buff.readLine();
			StringTokenizer st4 = new StringTokenizer(line4, token);
			if (st4.hasMoreTokens()) {
				name = st4.nextToken();
			}
			while (st4.hasMoreTokens()) {
				dr[i] = st4.nextToken();
				i = i + 1;
			}
			size = i;
			j = 3;
			System.out.println(Arrays.toString(dr));
			a.setoptn(j, name, size, dr);
			// Read the color of the car
			i = 0;
			String line5 = buff.readLine();
			StringTokenizer st5 = new StringTokenizer(line5, token);
			if (st5.hasMoreTokens()) {
				name = st5.nextToken();
			}
			while (st5.hasMoreTokens()) {
				er[i] = st5.nextToken();
				i = i + 1;
			}
			size = i;
			j = 4;
			System.out.println(Arrays.toString(er));
			a.setoptn(j, name, size, er);
			
		//int kl=	a.findOpset("Color");
		//System.out.println(kl);
			break;}
			else{
				//System.out.println("into the else");
				AutoException ae= new AutoException();
				txtFile= ae.fix(123);
				
			}
		} catch (IOException e) {
			System.out.println("Error ­­ " + e.toString());
			
		}
//		catch(AutoException ae)
//		{
//			ae.fix(123);
//		}
		}
		return a;
		}
public void properties(String propfile,String filetype){
	try
	{
	FileInputStream in = new FileInputStream(propfile);
	Properties props= new Properties();
	props.load(in); //This loads the entire file in memory.
	String str1="CarMake";
	String str2="CarModel";
	String str3="Option1";
	String str4="OptionValue1a";
	String CarMake = props.getProperty(str1); 
	if(!CarMake.equals(null))
	{
	String CarModel = props.getProperty(str2);
	String Option1 = props.getProperty(str3);
	String OptionValue1a = props.getProperty(str4);
	}}
	catch(IOException e){System.err.println("The file locatioin should be checked again");}
}
	
public Automobile buildAutoObjectFromPropertiesFile(Properties pro,Automobile auto){
	Properties props= pro;
	String CarMake = props.getProperty("CarMake"); //this is how you read a
	//property. It is like getting a value from HashTable.
	Integer setNum = 0;
	boolean hasPrice = false;
	if(!CarMake.equals(null)) {
		int carprice=Integer.parseInt(props.getProperty("Baseprice"));
		auto.setMake(CarMake);
		String CarModel = props.getProperty("CarModel");
		auto.setModel(CarModel);
		String OptionSize = props.getProperty("OptionSize");
		auto.setOptionSetSize(Integer.parseInt(OptionSize)); 
		String Option1 = props.getProperty("Option1");
		String OptionValue1a = props.getProperty("OptionValue1a");
		Integer hasprice1=Integer.parseInt(props.getProperty("hasprice1"));
		String str[]={OptionValue1a};
		auto.setoptn(0, Option1, 1, str);
		//auto.setPrice(auto, Option1, OptionValue1b, hasPrice);
		String Option2 = props.getProperty("Option2");
		String OptionValue2a = props.getProperty("OptionValue2a");
		Integer hasprice2=Integer.parseInt(props.getProperty("hasprice2"));
		//auto.setPrice(auto, Option2, OptionValue2a, hasPrice);
		//auto.setPrice(auto, Option2, OptionValue2b, hasPrice);
		String[] str2={OptionValue2a};
		auto.setoptn(1, Option2, 1,str2);
		String Option3 = props.getProperty("Option3");
		String OptionValue3a = props.getProperty("OptionValue3a");
		Integer hasprice3=Integer.parseInt(props.getProperty("hasprice3"));
		//auto.setPrice(auto, Option3, OptionValue3a, hasPrice);
		String str3[]={OptionValue3a};
		auto.setoptn(2, Option3, 1, str3);
		String Option4 = props.getProperty("Option4");
		String OptionValue4a = props.getProperty("OptionValue4a");
		Integer hasprice4=Integer.parseInt(props.getProperty("hasprice4"));
		String str4[]={OptionValue4a};
		auto.setoptn(3, Option4, 1, str4);
		int totalprice=carprice+hasprice1+hasprice2+hasprice3+hasprice4;
		auto.totalprice=totalprice;
	}
	
	return auto;	
}
}

