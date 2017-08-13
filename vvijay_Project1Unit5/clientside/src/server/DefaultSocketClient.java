package server;
import java.net.*;
import java.util.Properties;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class DefaultSocketClient extends Thread 
	   implements SocketClientInterface,
	   			  SocketClientConstants 
{
	private BufferedReader reader;
	private BufferedReader command;
	private PrintWriter writer;
	private Socket sock;
	
	public Socket getSock() {
		return sock;
	}

	public void setSock(Socket sock) {
		this.sock = sock;
	}

	private String strHost; //Host IP address
	private Properties props;
	private String models;
	
	public PrintWriter getWriter() {
		return this.writer;
	}
	
	public BufferedReader getReader() {
		return this.reader;
	}
	
	public String getStrHost() {
		return strHost;
	}

	public void setStrHost(String strHost) {
		this.strHost = strHost;
	}

	private int iPort;
	
	public int getiPort() {
		return iPort;
	}

	public void setiPort(int iPort) {
		this.iPort = iPort;
	}

	public DefaultSocketClient(String strHost, int iPort) {       
		setiPort(iPort);
		setStrHost(strHost);
		models = null;
	}	//constructor
	
	public void run(){
	   if (openConnection()){
	      handleSession();
	      closeSession();
	   }
	}//run
	
	public boolean openConnection() {
	  try {
	     sock = new Socket(this.strHost, this.iPort);                    
	  }
	  catch(IOException socketError){
	     if (DEBUG) System.err.println
	        ("Unable to connect to " + strHost);
	     return false;
	  }
	  try {
		 command = new BufferedReader(new InputStreamReader(System.in));  
	     reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
	     writer = new PrintWriter(sock.getOutputStream(), true);
	  }
	  catch (Exception e){
	     if (DEBUG) System.err.println
	       ("Unable to obtain stream to/from " + strHost);
	     return false;
	  }
	  return true;
	}

	public void handleSession(){
		String command = "";
        String fileName = "";        
        CarModelOptionsIO CMIO = new CarModelOptionsIO();
        try {
        	String messageFromServer = "";        	
        	while(true) {
        		System.out.println("Enter what you want to do: sendproperties, showall,\n"
						+ "	choosemodel");
        		command = this.command.readLine();
        		if(command.equals("q")) {
        			writer.println("q");
        			messageFromServer = reader.readLine();
        			System.out.println(messageFromServer);
        			break;
        		} else if(command.equals("sendproperties")) {
        			writer.println("sendproperties");
        			System.out.println("Enter Properties File Name:");
        			fileName = this.command.readLine();
        			props = CMIO.buildFromPropertiesFile(fileName);
    	        	ObjectOutputStream objectOutputStream = new ObjectOutputStream(
    	        				new BufferedOutputStream(sock.getOutputStream()));
    				objectOutputStream.writeObject(props);
    				objectOutputStream.flush();
    				messageFromServer = reader.readLine();
    				this.models = messageFromServer;
    				System.out.println("Build model success!");
        		} else if(command.equals("showall")) {
        			writer.println("showall");
        			System.out.println("All available models are:");
        			messageFromServer = reader.readLine();
        			this.models = messageFromServer;
    				System.out.println(messageFromServer);
        		} else if(command.equals("choosemodel")) {
        			writer.println("choosemodel");
        			/*System.out.println("All available models are:");
        			messageFromServer = reader.readLine();
        			this.models = messageFromServer;
    				System.out.println(messageFromServer);
    				System.out.println("choose one model:");
    				String modelChosen = this.command.readLine();*/
    				//writer.println("FordZTW");
    				messageFromServer = reader.readLine();
    				System.out.println(messageFromServer);
    				messageFromServer = reader.readLine();
    				System.out.println(messageFromServer);
    				
    				if(messageFromServer.equals("No such Model!")) {
    					continue;
    				}
    				System.out.println("Enter model to be chosen");
    				String modelname = this.command.readLine();
    				writer.println(modelname);
    				System.out.println("\nEnter ready for the option sets:\n");
    				messageFromServer = reader.readLine();

 			/*String[] ar=new String[100];
    		String line1 = messageFromServer;
			String token = ",";
			StringTokenizer st1 = new StringTokenizer(line1, token);
			String name = "Initial";
			if (st1.hasMoreTokens()) {
				name = st1.nextToken();
			}
			String baseprice;
			if (st1.hasMoreTokens()) {
			 	baseprice = st1.nextToken();
			}
			String make;
			if (st1.hasMoreTokens()) {
			 	make= st1.nextToken();
			}
			String model;
			if (st1.hasMoreTokens()) {
			 	model= st1.nextToken();
			}
			int i=0;
			while (st1.hasMoreTokens()) {
				ar[i] = st1.nextToken();
				i = i + 1;
			}
			int size = i;
			int j = 0;
			for(j=0;j<ar.length;j++){
				System.out.println(ar[j]);	
			}*/
			 		System.out.println(messageFromServer);	
        		System.out.println("Enter the option for transmission");
        		Scanner s1=new Scanner(System.in);
        		String l1=s1.nextLine();
        		System.out.println("Enter the option for braking");
        		Scanner s2=new Scanner(System.in);
        		String l2=s2.nextLine();
        		System.out.println("Enter the option for Side Impact Air Bags");
        		Scanner s3=new Scanner(System.in);
        		String l3=s3.nextLine();
        		System.out.println("Enter the option for Power moonroof");
        		Scanner s4=new Scanner(System.in);
        		String l4=s1.nextLine();
        		System.out.println("The chosen options are- \n");
        		System.out.println(l1+"\n");
        		System.out.println(l2+"\n");
        		System.out.println(l3+"\n");
        		System.out.println(l4+"\n");
        		}
        	}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}       
	
	private char[] toString(Class<ar[]> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAvaliableModel() {
		return this.models;
	}

    public void closeSession(){
    	try {
    	   writer = null;
    	   reader = null;
    	   command = null;
    	   sock.close();
    	}
    	catch (IOException e){
         if (DEBUG) System.err.println
          ("Error closing socket to " + strHost);
    	}
    }
    
}