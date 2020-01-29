package com.CarProject;

import java.io.File;
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
 * Servlet implementation class welcomeServlet
 */
@WebServlet("/welcomeServlet")
public class welcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		HttpSession session = request.getSession();
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
