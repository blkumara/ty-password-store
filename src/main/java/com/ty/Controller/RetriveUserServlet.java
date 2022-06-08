package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RetriveUserServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter printWriter=resp.getWriter();
		
		printWriter.print("<html><body>");
		printWriter.print("<table>");
		printWriter.print("<tr>");
		printWriter.print("<th> Id</th>");
		printWriter.print("<th>name</th> ");
		printWriter.print("<th>email</th>");
		printWriter.print("<th>phone</th>");
		printWriter.print("</tr>");
		
		printWriter.print("<tr>");
		printWriter.print("<th> 1</th>");
		printWriter.print("<th>kumara</th> ");
		printWriter.print("<th>kumara@mail.com</th>");
		printWriter.print("<th>9844648667</th>");
		printWriter.print("</tr>");
		
		printWriter.print("<tr>");
		printWriter.print("<th> 2</th>");
		printWriter.print("<th>pavan</th> ");
		printWriter.print("<th>pavan@mail.com</th>");
		printWriter.print("<th>74115868598</th>");
		printWriter.print("</tr>");
		
		printWriter.print("<tr>");
		printWriter.print("<th> 3</th>");
		printWriter.print("<th>prasha</th> ");
		printWriter.print("<th>prashi@mail.com</th>");
		printWriter.print("<th>8574859685</th>");
		printWriter.print("</tr>");
		
		
		
		printWriter.print("<table>");
		printWriter.print("<html><body>");

		
		
		
		
		
	
	}

}
