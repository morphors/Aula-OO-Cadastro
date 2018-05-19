package com.estudo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.dao.UsuarioDao;

@WebServlet("/excluirusuariocontroller.do")
public class ExcluirUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer codigo = Integer.parseInt(request.getParameter("codigo"));
		
		UsuarioDao usuariodao = new UsuarioDao();
		usuariodao.excluir(codigo);
		
		response.sendRedirect("http://localhost:8080/websistema/buscarusuariocontroller.do");
		
	}

}
