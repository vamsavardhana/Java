package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

import model.Automotive;

public class FileIO {

	public static void readFile(Automotive a, String txtFile) {
		try {
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
			j = 1;
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
			j = 1;
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
			j = 1;
			System.out.println(Arrays.toString(er));
			a.setoptn(j, name, size, er);

		} catch (IOException e) {
			System.out.println("Error ­­ " + e.toString());
		}

	}
}
