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
	//property. It is like gettting a value from HashTable.
	Integer setNum = 0;
	boolean hasPrice = false;
	if(!CarMake.equals(null)) {
		auto.setMake(CarMake);
		String CarModel = props.getProperty("CarModel");
		auto.setModel(CarModel);
		String CarName= props.getProperty("CarModel");
		auto.setName(CarName);
		String price=props.getProperty("Baseprice");
		int price1=Integer.parseInt(price);
		auto.setBasePrice(price1);
		String OptionSize = props.getProperty("OptionSize");
		auto.setOptionSetSize(Integer.parseInt(OptionSize)); 
		String Option1 = props.getProperty("Option1");
		String OptionValue1a = props.getProperty("OptionValue1a");
		hasPrice = OptionValue1a.contains("$");
		//auto.setPrice(auto, Option1, OptionValue1a, hasPrice);
		String OptionValue1b = props.getProperty("OptionValue1b");
		hasPrice = OptionValue1b.contains("$");
		String str[]={OptionValue1a,OptionValue1b};
		auto.setoptn(0, Option1, 2, str);
		//auto.setPrice(auto, Option1, OptionValue1b, hasPrice);
		String Option2 = props.getProperty("Option2");
		String OptionValue2a = props.getProperty("OptionValue2a");
		hasPrice = OptionValue2a.contains("$");
		//auto.setPrice(auto, Option2, OptionValue2a, hasPrice);
		String OptionValue2b = props.getProperty("OptionValue2b");
		hasPrice = OptionValue2a.contains("$");
		//auto.setPrice(auto, Option2, OptionValue2b, hasPrice);
		String OptionValue2c = props.getProperty("OptionValue2c");
		//auto.setPrice(auto, Option2, OptionValue2c, hasPrice);
		String[] str2={OptionValue2a,OptionValue2b,OptionValue2c};
		auto.setoptn(1, Option2, 3,str2);
		String Option3 = props.getProperty("Option3");
		String OptionValue3a = props.getProperty("OptionValue3a");
		//auto.setPrice(auto, Option3, OptionValue3a, hasPrice);
		String OptionValue3b = props.getProperty("OptionValue3b");
		//auto.setPrice(auto, Option3, OptionValue3b, hasPrice);
		String str3[]={OptionValue3a,OptionValue3b};
		auto.setoptn(2, Option3, 2, str3);
		String Option4 = props.getProperty("Option4");
		String OptionValue4a = props.getProperty("OptionValue4a");
		//auto.setPrice(auto, Option4, OptionValue4a, hasPrice);
		String OptionValue4b = props.getProperty("OptionValue4b");
		//auto.setPrice(auto, Option4, OptionValue4b, hasPrice);
		String str4[]={OptionValue4a,OptionValue4b};
		auto.setoptn(3, Option4, 2, str4);
		String Option5 = props.getProperty("Option5");
		String OptionValue5a = props.getProperty("OptionValue5a");
		//auto.setPrice(auto, Option4, OptionValue4a, hasPrice);
		String OptionValue5b = props.getProperty("OptionValue5b");
		//auto.setPrice(auto, Option4, OptionValue4b, hasPrice);
		String OptionValue5c = props.getProperty("OptionValue5c");
		String OptionValue5d = props.getProperty("OptionValue5d");
		String OptionValue5e = props.getProperty("OptionValue5e");
		String OptionValue5f = props.getProperty("OptionValue5f");
		String OptionValue5g = props.getProperty("OptionValue5g");
		String OptionValue5h = props.getProperty("OptionValue5h");
		String OptionValue5i = props.getProperty("OptionValue5i");
		String OptionValue5j = props.getProperty("OptionValue5j");
		String str5[]={OptionValue5a,OptionValue5b,OptionValue5c,OptionValue5d,OptionValue5e,OptionValue5f,OptionValue5g,OptionValue5h,OptionValue5i,OptionValue5j};
		auto.setoptn(4, Option4, 10, str5);
		
		
	}
	return auto;
	
}
}

