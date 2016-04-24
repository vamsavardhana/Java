package utilities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import Except.Greater40RecordsException;
import stats.Student;

public class Util {
	static int count = 0;
	
	public static Student[] readFile(String filename, Student[] stu) {
		try {
			
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			//Read the first line that contains stud, q1,q2,q3,q4 and q5
			buff.readLine();
			boolean eof = false;
			int j = 0;
			int count = 0;
			//Populate each students SID and marks
			while (!eof) {

				String line = buff.readLine();
				if (line == null) {
					eof = true;
				} else {

					System.out.println(line);
					
					//Tokenize each string the default delimiter is " " or space
					StringTokenizer st = new StringTokenizer(line);
					
					//Initialize new student
					stu[count] = new Student();
					
					//Set the student ID for each student
					stu[count].setSID(Integer.parseInt(st.nextToken()));
					
					//Set the scores of one student to an array called marks
					int[] marks = new int[5];
					for (int i = 0; i < 5; i++) {
						String temp = st.nextToken();
						marks[i] = Integer.parseInt(temp);
					}
					stu[count].setScores(marks);

					count++;
					testException(count);
					
				}
			}
			buff.close();

		} catch (IOException e) {
			System.err.println("Error ­­ this is IO exception" + e.toString());
		}
		catch(Greater40RecordsException e) 
		{
			e.printStackTrace();
		}

		return stu;
	}
	public static void testException(int nrecords) throws Greater40RecordsException
    {
          if(nrecords>40)
            throw new Greater40RecordsException();
    }
}
