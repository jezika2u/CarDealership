package com.CarProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class purchaseCarServlet
 */
@WebServlet("/purchaseCarServlet")
public class purchaseCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public purchaseCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		if(request.getParameter("condition").equals("new"))
		{
			Scanner x = null;
			//NEW CAR --open file
			try {
				x = new Scanner(new File("/Users/jstefano/Desktop/newCarInventory.txt"));
			} catch(IOException e) {
				System.out.println(e);
			}
			
			ArrayList<NewCar> newCars = new ArrayList<NewCar>();
		
			while(x.hasNext())
			{
			NewCar newCar = new NewCar();
			newCar.setImgUrl(x.next());
			newCar.setId(x.next());
			newCar.setMake(x.next());
			newCar.setModel(x.next());
			newCar.setYear(x.next());
			newCar.setPrice(x.next());
			newCars.add(newCar);
			}
			
			session.setAttribute("newCars", newCars);
			x.close();
		
			String s =(request.getParameter("id"));
	
			int index = NewCar.findCarInArraylist(newCars, s);
			newCars.remove(index);
			
			try {
				FileWriter fw = new FileWriter("/Users/jstefano/Desktop/newCarInventory.txt", false);
				for(int i=0; i<newCars.size(); i++)
				{
				fw.write(newCars.get(i) + "\n");
				}
				fw.close();
			}catch(IOException e){
				System.out.println(e);
			}
			

	
			
			

		
		
	
			
			
		}
		
		
		
		
		if(request.getParameter("condition").equals("used"))
		{
			Scanner y = null;
			//USED CAR --open file
			try {
				y = new Scanner(new File("/Users/jstefano/Desktop/usedCarInventory.txt"));
			} catch(IOException e) {
				System.out.println(e);
			}
			
			ArrayList<UsedCar> usedCars = new ArrayList<UsedCar>();
		
			while(y.hasNext())
			{
			UsedCar usedCar = new UsedCar();
			
			usedCar.setImgUrl(y.next());
			usedCar.setSaleId(y.next());
			usedCar.setYear(y.next());
			usedCar.setMake(y.next());
			usedCar.setModel(y.next());
			usedCar.setMileage(y.next());
			usedCar.setPrice(y.next());
			usedCar.setPurchaseDate(y.next());
			usedCars.add(usedCar);
			}
			
			
			session.setAttribute("usedCars", usedCars);
			y.close();
		}
		
		//record buyer to file
		try {
		FileWriter fw = new FileWriter("/Users/jstefano/Desktop/buyer.txt", true);
		fw.write( "\n" + (request.getParameter("firstName"))+
				" " + (request.getParameter("lastName"))+ 
						" " + (request.getParameter("email"))+
								" " + (request.getParameter("street"))+ 
										" " + (request.getParameter("city"))+
											" " + (request.getParameter("state"))+
												" " + (request.getParameter("zip")));
		
		fw.close();
		}catch(IOException e) {
			System.out.println(e);
		}
		
		RequestDispatcher rs = request.getRequestDispatcher("Congratulations.jsp");
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
