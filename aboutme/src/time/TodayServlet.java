package time;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8" );
		PrintWriter out = response.getWriter();
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dateTimeFomatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		String formatedNow = date.format(dateTimeFomatter); 
		out.println("<html>");
		out.println("<head>" + "<a href='index.html'>메인화면</a>" + "</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("현재 시간은 " + formatedNow + "입니다.");
		out.println("</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}

