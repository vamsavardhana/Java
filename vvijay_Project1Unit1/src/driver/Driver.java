package driver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.StringTokenizer;

import model.Automotive;
import util.FileIO;

public class Driver {
	public static void main(String[] args) {
		String txtFile="src/ReadSource.txt";
		Automotive a=new Automotive("bmw",18445);
		System.out.println(a);
		FileIO.readFile(a,txtFile);
		System.out.println(a);
		Automotive b=new Automotive();
		String filename="A.dat";
		try {
			ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(filename));
			os.writeObject(a);
			os.close();
			ObjectInputStream in =  new ObjectInputStream(new FileInputStream(filename));
			b=(Automotive)in.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
//		System.out.println("\n Enter the optionset");
//		Scanner s=new Scanner(System.in);
//		String os=s.nextLine();
//		a.find(os);
//		
	}
	}
