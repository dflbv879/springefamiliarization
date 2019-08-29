package by.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(name = "MyServlet", urlPatterns = { "/MyServlet" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.getRequestDispatcher("hello.jsp").forward(request, response);
//		request.setCharacterEncoding("UTF-8");
//		String idParam = request.getParameter("id");
//		Integer id = 0;
//		System.out.println(idParam);
//		if(idParam!=null) {
//		   id = Integer.parseInt(idParam);
//		}
//		String user = users.get(id);
//		if(user==null) {
//			user ="";
//		}
//			
//		response.setContentType("text/html;charset=utf-8");
//
//		PrintWriter out = response.getWriter();
//		out.println("<h3>user:"+user+"</h3><br>");
//		out.println("<a href ='http://localhost:8081/WebApp/user.html'>�����</a>");
//		out.close();
		Map<String,Integer> persons = new HashMap<>();
		persons.put("Mar",29);
		persons.put("Max",18);
		persons.put("Rex",25);
		request.setAttribute("person",persons);
		request.getRequestDispatcher("kek.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request,response);
//		request.setCharacterEncoding("UTF-8");
//		String name = request.getParameter("name");
//		Integer id = null;
//		if(!users.containsValue(name)) {
//			id = counter.incrementAndGet();
//			users.put(id,name);
//		}
//		response.setContentType("text/html;charset=utf-8");
//
//		PrintWriter out = response.getWriter();
//		if(id==null) {
//			out.println("<h3>user ="+name+"��� ����������</h3>");
//		}else {
//			out.println("<h3>user ="+name+"� id = "+counter.get()+" ������</h3>");
//		}
//		out.println("<a href ='http://localhost:8081/WebApp/user.html'>�� �������</a>");
//		out.println(name);
//		out.close();

	}
}
