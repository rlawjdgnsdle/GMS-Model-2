package command;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Carrier {
	public static void forward(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			request
			.getRequestDispatcher(Sentry.cmd.getView())
			.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	public static void redirect(HttpServletRequest request,
			HttpServletResponse response,
			String url) {
		try {
			response.sendRedirect(
					request.getContextPath()
					+url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
