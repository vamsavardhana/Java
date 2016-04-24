package mainPackage;
import java.util.Arrays;
import java.util.Scanner;

import stats.Student;
import stats.statistics;
import utilities.Util;

public class Driver {

	public static void main(String[] args) {
		Student[] students = new Student[100];
		students = Util.readFile("vijay.txt", students);
		System.out.println(" Input read and populated");
		statistics stat = new statistics();
		
		
		stat.findLow(students);
		stat.findHigh(students);
		stat.findAverage(students);
		}

}
