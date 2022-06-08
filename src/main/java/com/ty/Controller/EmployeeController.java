package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.EmployeeService;
import com.ty.dto.Employee;

public class EmployeeController extends HttpServlet{
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			Employee employee=new  Employee();
			employee.setName(req.getParameter("employeeName"));
			employee.setEmail(req.getParameter("employeeEmail"));
			employee.setGender(req.getParameter("employeeGender"));
			employee.setAddress(req.getParameter("employeeAddress"));
			employee.setRole(req.getParameter("personRole"));
			
			EmployeeService employeeService=new EmployeeService();
			Employee employee2=employeeService.saveEmployee(employee);
			if(employee2!=null) {
				
				PrintWriter printWriter=resp.getWriter();
				String htmlCode="<html><body><h>Thank you for Applying<br>your Id is Generated"+employee2.getId()+"<br>"+employee2.getName()+"<br>"+employee2.getEmail()+"<br>"+employee2.getGender()+"<br>"+employee2.getAddress()+"<br>"+employee2.getRole()+"</html></body></h>";
				printWriter.write(htmlCode);
			} else {
				PrintWriter printWriter=resp.getWriter();
				String htmlCode="<html><body><h>No data</html></body></h>";
				printWriter.write(htmlCode);

			}
		}
		
		
	}


