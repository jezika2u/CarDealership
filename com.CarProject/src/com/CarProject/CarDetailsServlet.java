package com.CarProject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CarDetailsServlet
 */
@WebServlet("/CarDetailsServlet")
public class CarDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//this servlet will find what object was referenced via the "button" click and then
		//display that objects info in carDetails.jsp
		
		HttpSession session = request.getSession();
		
		
		if(request.getParameter("condition").equals("new"))
		{
		NewCar newCar = new NewCar();
		
		newCar.setImgUrl(request.getParameter("imgUrl"));
		newCar.setId(request.getParameter("id"));
		newCar.setMake(request.getParameter("make"));
		newCar.setModel(request.getParameter("model"));
		newCar.setYear(request.getParameter("year"));
		newCar.setPrice(request.getParameter("price"));
		
		session.setAttribute("newCar", newCar);
		

		RequestDispatcher rs = request.getRequestDispatcher("carDetails.jsp");
		rs.forward(request, response);
		}
		if(request.getParameter("condition").equals("used"))
		{
			UsedCar usedCar = new UsedCar(); 
			
			usedCar.setImgUrl(request.getParameter("imgUrl"));
			usedCar.setSaleId(request.getParameter("saleId"));
			usedCar.setMake(request.getParameter("make"));
			usedCar.setModel(request.getParameter("model"));
			usedCar.setYear(request.getParameter("year"));
			usedCar.setPrice(request.getParameter("price"));
			usedCar.setMileage(request.getParameter("mileage"));
			
			session.setAttribute("usedCar", usedCar);
			

			RequestDispatcher rs = request.getRequestDispatcher("usedCarDetails.jsp");
			rs.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
