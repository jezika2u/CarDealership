package com.CarProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class addInventoryServlet
 */
@WebServlet("/addInventoryServlet")
public class addInventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addInventoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("condition").equals("new"))	
		{	
		try {
		FileWriter fw = new FileWriter("/Users/jstefano/Desktop/newCarInventory.txt", true);
		fw.write( "\n" + (request.getParameter("imgUrl"))+
				" " + (request.getParameter("saleId"))+ 
						" " + (request.getParameter("make"))+
								" " + (request.getParameter("model"))+ 
										" " + (request.getParameter("year"))+
												" " + (request.getParameter("price")));
		
		fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
		}
		if(request.getParameter("condition").equals("used"))
		{	
		try {
		FileWriter fw = new FileWriter("/Users/jstefano/Desktop/usedCarInventory.txt", true);
		fw.write( "\n" + (request.getParameter("imgUrl"))+
				" " + (request.getParameter("saleId"))+ 
						" " + (request.getParameter("year"))+
								" " + (request.getParameter("make"))+ 
										" " + (request.getParameter("model"))+
												" " + (request.getParameter("mileage"))+
													" " + (request.getParameter("price"))+
															" " + (request.getParameter("purchaseDate"))
												);
		
		fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		}
			
		RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
		rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
