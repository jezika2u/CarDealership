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
 * Servlet implementation class buyCarServlet
 */
@WebServlet("/buyCarServlet")
public class buyCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buyCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		NewCar newCar = new NewCar();
		
		newCar.setImgUrl(request.getParameter("imgUrl"));
		newCar.setId(request.getParameter("id"));
		newCar.setMake(request.getParameter("make"));
		newCar.setModel(request.getParameter("model"));
		newCar.setYear(request.getParameter("year"));
		newCar.setPrice(request.getParameter("price"));
		
		session.setAttribute("newCar", newCar);
		
		
		
		RequestDispatcher rs = request.getRequestDispatcher("purchase.jsp");
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
