package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.BankService;
import com.ty.dto.Bank;

public class BankController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Bank bank = new Bank();
		bank.setUserName(req.getParameter("UserName"));
		bank.setPassword(req.getParameter("Password"));
		bank.setWebLink(req.getParameter("WebLink"));
		bank.setDescription(req.getParameter("Description"));

		BankService bankService = new BankService();
		Bank bank2 = bankService.saveBank(bank);

		if (bank2 != null) {

			PrintWriter printWriter = resp.getWriter();
			String htmlCode = "<html><body><h1>Thank you for registration <br>your Id is"+bank2 + bank2.getId() + "<br>"
					+ bank2.getUserName() + "<br>" + bank2.getPassword() + "<br>" + bank2.getWebLink() + "<br>"
					+ bank2.getDescription() + "<br></html></body></h1>";
			printWriter.write(htmlCode);
		} else {
			PrintWriter printWriter = resp.getWriter();
			String htmlCode = "<html><body><h>No data</html></body></h>";
			printWriter.write(htmlCode);

		}
	}
}
