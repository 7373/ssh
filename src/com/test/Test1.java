package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test1 extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		     throws ServletException,IOException{
		
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
		     throws ServletException,IOException{
				doGet(request,response);
			}

}
