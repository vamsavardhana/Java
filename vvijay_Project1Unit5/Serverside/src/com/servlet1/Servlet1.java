package com.servlet1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adapter.BuildAuto;
import model.Automobile;
import server.BuildCarModelOptions;
import server.Server;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet(description = "Servlet for testing", urlPatterns = { "/Servlet1" })
public class Servlet1 extends HttpServlet implements Runnable{
	private static final long serialVersionUID = 1L;
	Server server1;
	private ServerSocket ListenSocket;
	private Socket socket;
	private Integer port;
	public Properties props;
	public static BuildAuto autos = new BuildAuto();
	
	public void Server(Integer port) {
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
						//a=a.setPrices();
						out.println("Build model success!");
					}
					else if(messageFromClient.equals("showall")) {
						System.out.println("showall entered");
						
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
	
	
		/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	System.out.println("DO get method clal");
//	PrintWriter writer=response.getWriter();
	Server server = new Server(4000);
	Thread thread = new Thread(server);
	thread.start();
	System.out.println("Server is up...");
	request.setAttribute("t1", autos.model.get(0).getOptionChoice().get(0).getName());
	request.setAttribute("t2", autos.model.get(0).getOptionChoice().get(1).getName());
	request.setAttribute("t3", autos.model.get(0).getOptionChoice().get(2).getName());
	request.setAttribute("t4", autos.model.get(0).getOptionChoice().get(3).getName());
	request.setAttribute("t5", autos.model.get(0).getOptionChoice().get(4).getName());
	request.setAttribute("t6", autos.model.get(0).getOptionChoice().get(5).getName());
	request.setAttribute("t7", autos.model.get(0).getOptionChoice().get(6).getName());
	request.setAttribute("t8", autos.model.get(0).getOptionChoice().get(7).getName());
	request.setAttribute("t9", autos.model.get(0).getOptionChoice().get(8).getName());
	request.setAttribute("t10", autos.model.get(0).getOptionChoice().get(9).getName());
	request.setAttribute("t11", autos.model.get(0).getOptionChoice().get(10).getName());
	request.setAttribute("t12", autos.model.get(0).getOptionChoice().get(11).getName());
	request.setAttribute("t13", autos.model.get(0).getOptionChoice().get(12).getName());
	request.setAttribute("t14", autos.model.get(0).getOptionChoice().get(13).getName());
	request.setAttribute("t15", autos.model.get(0).getOptionChoice().get(14).getName());
	request.setAttribute("t16", autos.model.get(0).getOptionChoice().get(15).getName());
	request.setAttribute("t17", autos.model.get(0).getOptionChoice().get(16).getName());
	request.setAttribute("t18", autos.model.get(0).getOptionChoice().get(17).getName());
	request.setAttribute("t19", autos.model.get(0).getOptionChoice().get(18).getName());
	request.setAttribute("t20", autos.model.get(0).getOptionChoice().get(19).getName());
	request.setAttribute("t21", autos.model.get(0).getOptionChoice().get(20).getName());
	request.setAttribute("t22", autos.model.get(0).getOptionChoice().get(21).getName());
	request.setAttribute("t23", autos.model.get(0).getOptionChoice().get(22).getName());
	request.setAttribute("t24", autos.model.get(0).getOptionChoice().get(23).getName());
	request.setAttribute("t25", autos.model.get(0).getOptionChoice().get(24).getName());
	request.setAttribute("t26", autos.model.get(0).getOptionChoice().get(25).getName());
	request.setAttribute("t27", autos.model.get(0).getOptionChoice().get(26).getName());
	request.setAttribute("t28", autos.model.get(0).getOptionChoice().get(27).getName());
	request.setAttribute("t29", autos.model.get(0).getBasePrice());
	request.setAttribute("t30", autos.model.get(0).getName());
	request.setAttribute("t31", autos.model.get(1).getName());
	request.setAttribute("t32", autos.model.get(2).getName());
	request.getRequestDispatcher("index.jsp").forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		boolean flag=true;
		Automobile a1=autos.model.get(0);
		if(request.getParameter("NAME").contains("Ford"))
		{
			a1=autos.model.get(0);
		}
		if(request.getParameter("NAME").contains("toyota"))
		{
			a1=autos.model.get(1);
		}
		if(request.getParameter("NAME").contains("tesla"))
		{
			a1=autos.model.get(2);
		}
		
		float base=a1.getBasePrice();float brake=0,pm=0,siab=0,trans=0;
		request.setAttribute("bprice", base);
		for(int i=0;i<2;i++)
			{
			System.out.println(request.getParameter("TRANS"));
			System.out.println(a1.getOptionChoice().get(i).getName());
			if(request.getParameter("TRANS").contentEquals(a1.getOptionChoice().get(i).getName()))
{
	request.setAttribute("transprice", a1.getOptionChoice().get(i).getPrice());
	trans=a1.getOptionChoice().get(i).getPrice();
	System.out.println("the choice is selectedTRANS"+a1.getOptionChoice().get(i).getPrice());
}
}
		System.out.println("DONE");
		
		for(int i=0;i<5;i++)
		{System.out.println(a1.getOptionChoice().get(i).getName());
		System.out.println(request.getParameter("BRAKE"));
		System.out.println("done");
		if(request.getParameter("BRAKE").contentEquals(a1.getOptionChoice().get(i).getName()))
{
request.setAttribute("brakeprice", a1.getOptionChoice().get(i).getPrice());
brake=a1.getOptionChoice().get(i).getPrice();
System.out.println("the choice is selectedBRAKE"+a1.getOptionChoice().get(i).getPrice());
}
}
		System.out.println("DONE");

		for(int i=0;i<28;i++)
		{System.out.println(a1.getOptionChoice().get(i).getName());
		System.out.println(request.getParameter("SIAB"));
		System.out.println("done");
		if(request.getParameter("SIAB").contentEquals(a1.getOptionChoice().get(i).getName()))
{
request.setAttribute("siabprice", a1.getOptionChoice().get(i).getPrice());
siab=a1.getOptionChoice().get(i).getPrice();
System.out.println("the choice is selectedSIAB"+a1.getOptionChoice().get(i).getPrice());
}
}

		for(int i=0;i<28;i++)
		{System.out.println(a1.getOptionChoice().get(i).getName());
		System.out.println(request.getParameter("PM"));
		System.out.println("done");
		if(request.getParameter("PM").contentEquals(a1.getOptionChoice().get(i).getName()))
{
pm=a1.getOptionChoice().get(i).getPrice();
request.setAttribute("pmprice", a1.getOptionChoice().get(i).getPrice());
System.out.println("the choice is selectedPM"+a1.getOptionChoice().get(i).getPrice());
}
}
		//request.setAttribute("transprice", request.getParameter("TRANS"));
		float total=pm+siab+trans+brake+base;
		request.setAttribute("totalprice", total);
		request.getRequestDispatcher("page2.jsp").forward(request, response);	
			
}
}