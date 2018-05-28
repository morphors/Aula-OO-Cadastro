package com.estudo.controller;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD
		}
					, urlPatterns = { "/*" })

public class FiltroAutenticacao implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpSession sessao = ((HttpServletRequest)request).getSession();
		
		if(sessao != null)
		{
			chain.doFilter(request, response);
		}
		else
		{
			((HttpServletResponse)response).sendRedirect("login.html");
		}
			
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
