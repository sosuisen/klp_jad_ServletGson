

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Resources
 */
@WebServlet("/todos")
public class Resources extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Gson gson = new Gson();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Resources() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		var todo = new ToDo(title, LocalDate.now().toString(), false);
		out.println(gson.toJson(todo));
	}
}
