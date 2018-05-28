package com.estudo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

@WebServlet("/autenticarusuariocontroller.do")
public class AutenticarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession();
		
		if(sessao != null)
		{
			sessao.invalidate();
		}
		response.sendRedirect("login.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		UsuarioDao usuarioDao = new UsuarioDao();
		Usuario usuario = usuarioDao.autenticar(login, senha);
		
		if(usuario!= null){
			
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuario", usuario);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}else {
			response.sendRedirect("login.html");
		}
	}

}
