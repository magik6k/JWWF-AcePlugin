package net.magik6k.jwwf.ace;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public class AceServlet extends HttpServlet{
	private static final long serialVersionUID = 3255775285558295428L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/javascript");
        response.setStatus(HttpServletResponse.SC_OK);
        
        System.out.println(request.getRequestURI().toString());
        
        response.getWriter().write(Resources.toString(Resources.getResource(new StringBuilder("net/magik6k/jwwf/ace/assets/editor")
        	.append(request.getRequestURI().replaceFirst("/ace", "")).toString()), Charsets.UTF_8));
        
	}
}
