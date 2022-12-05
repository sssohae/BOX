package co.micol.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get 호출시 처리 하는 곳 
		request.setCharacterEncoding("utf-8");//전달받은 한글 깨짐 방지
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");//돌려줄값 한글 깨짐 방지
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		System.out.println(name + " : " + password);
		if(name.equals("홍길동") && password.equals("1234")) {
			response.getWriter().append("로그인 성공");
		}else {
			response.getWriter().append("로그인 실패");
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
