package Except;

public class Greater40RecordsException extends Exception{
	public Greater40RecordsException()
	{
		System.out.println("There are greater than 40 records in this application");
	}

}
