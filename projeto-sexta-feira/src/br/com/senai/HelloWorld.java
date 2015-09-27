package br.com.senai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();
	
		pw.write("<html>");
		pw.write("<head>");
		pw.write("<title>");
		pw.write("Hello World");
		pw.write("</title>");
		pw.write("</head>");
		pw.write("<body>");
		pw.write("<h1>Hello World</h1>");
		pw.write("</body>");
		pw.write("</html>");
		
	}
	
	
	
	
	
	
	
	
	
}
