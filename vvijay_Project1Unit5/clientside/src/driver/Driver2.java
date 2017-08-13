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
import scale.EditOptions;
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
	EditOptions a1=new EditOptions("Ford");
	EditOptions a2=new EditOptions("Acura");
	a1.BuildAuto("src/ReadSource.txt");
	a1.printAuto();
	a2.BuildAuto("src/ReadSource.txt");
	Thread t=new Thread(a1);
	Thread t2=new Thread(a2);
			t.start();
			try {
			Thread.sleep(10000);
			} catch (Exception e) { }
			t2.start();	
}
}