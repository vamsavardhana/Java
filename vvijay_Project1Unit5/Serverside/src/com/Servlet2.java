package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet1.Servlet1;

import adapter.BuildAuto;
import model.Automobile;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet(description = "Servlet for 2nd JSP page", urlPatterns = { "/Servlet2" })
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static BuildAuto autos = new BuildAuto();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
