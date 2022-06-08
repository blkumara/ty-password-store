package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.UserService;
import com.ty.dto.User;

public class UserController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = new User();
		user.setName(req.getParameter("name"));
		user.setEmail(req.getParameter("mail"));
		user.setGender(req.getParameter("gender"));
		user.setPassword(req.getParameter("password"));

		UserService userService = new UserService();
		User user1 = userService.saveUser(user);
		if (user1 != null) {

			PrintWriter printWriter = resp.getWriter();
			String htmlCode = "<html><body><h>Thank you for Applying<br>your Id is Generated" + user1.getId() + "<br>"
					+ user1.getName() + "<br>" + user1.getEmail() + "<br>" + user.getGender() + "<br>"
					+ user1.getPassword() + "</html></body></h>";
			printWriter.write(htmlCode);
		} else {

			PrintWriter printWriter = resp.getWriter();
			String htmlCode = "<html><body><h>No data</html></body></h>";
			printWriter.write(htmlCode);

		}

	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService userService = new UserService();
		User user1 = userService.validateUser(req.getParameter("mail"),req.getParameter("password"));
		if (user1 != null) {

			PrintWriter printWriter = resp.getWriter();
			String htmlCode = "<html><body><h>Login SuccessFully </html></body></h>";
			printWriter.write(htmlCode);
		} else {

			PrintWriter printWriter = resp.getWriter();
			String htmlCode = "<html><body><h> Invalid Email And Password</html></body></h>";
			printWriter.write(htmlCode);

		}
	}
		
}
