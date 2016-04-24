package server;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

import adapter.BuildAuto;
import model.Automobile;

public class Server implements Runnable{
	private ServerSocket ListenSocket;
	private Socket socket;
	private Integer port;
	public Properties props;
	
	public Server(Integer port) {
		this.port = port;
	}

	public void run() {
		try {
			ListenSocket = new ServerSocket(this.port);
			socket = ListenSocket.accept();
			
			BuildCarModelOptions BCMO = new BuildCarModelOptions();
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        BufferedReader br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			while(true) {
				String messageFromClient = br.readLine();
				if(messageFromClient != null) {
					if(messageFromClient.equals("quit")) {
						out.println("Server is down!");
						System.out.println("quit");
						break;
					}
					else if(messageFromClient.equals("sendproperties")) {
						ObjectInputStream in = new ObjectInputStream(
								new BufferedInputStream(socket.getInputStream()));
						props = (Properties)in.readObject();
						//System.out.println(props);
						Automobile a=new Automobile();
						BCMO.parseCarModelOptions(props,a);
						out.println("Build model success!");
					}
					else if(messageFromClient.equals("showall")) {
						System.out.println("showall entered");
						BuildAuto autos = new BuildAuto();
						out.println(autos.model);
					} 
					else if(messageFromClient.equals("choosemodel")) {
						BuildAuto autos = new BuildAuto();
						out.println(autos.model);
						//String modelChosen = br.readLine();
						out.println("0 1 2");
						System.out.println("Debug1");
						String modelChosen = br.readLine();
						System.out.println("Debug2");
						System.out.println("The model chosen is"+modelChosen);
						System.out.println("Debug3");
						if(modelChosen.equals("0"))
						{
							System.out.println(autos.model.get(0));
							out.println(autos.model.get(0));
						}
						else if(modelChosen.equals("1"))
						{
							System.out.println(autos.model.get(1));
							out.println(autos.model.get(1));
						}	
						else if(modelChosen.equals("2"))
						{
							System.out.println(autos.model.get(2));
							out.println(autos.model.get(2));
						}
						else{
							System.out.println("Model not found");
							out.println("Model not found");}
//						String modelInfor = autos.modelToString(modelChosen);
//						out.println(modelInfor);
//						if(modelInfor.equals("No such Model!")) {
//							continue;
//						}						
//						out.println(autos.listOptionSet(modelChosen));
					}
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Server server = new Server(4000);
		Thread thread = new Thread(server);
		thread.start();
		System.out.println("Server is up...");
	}
}
