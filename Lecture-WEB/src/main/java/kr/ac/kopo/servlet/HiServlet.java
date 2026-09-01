package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hiservlet")
public class HiServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uri = req.getRequestURI();
		String method = req.getMethod();
		System.out.println(uri);
		System.out.println(method);
		
		res.setContentType("text/html; charset = utf-8");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> BEJ 서블릿 응답 </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2> BEJ 서블릿 출력결과 </h2>");
		out.println("<hr>");
		out.println("요청 url : "+ uri+ "<br>");
		out.println("요청 method : "+ method+ "<br>");
		out.println("</body>");
		out.println("</html>");

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}



}
