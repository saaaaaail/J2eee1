package sc.ustc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//resp.setContentType("text/html;charset=utf-8");
		resp.setCharacterEncoding("utf-8");
		PrintWriter pw = resp.getWriter();
		String s = "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>SimpleController</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"ª∂”≠ π”√SimpleController£°£°\r\n" + 
				"</body>\r\n" + 
				"</html>";
		pw.write(s);
	}


}
