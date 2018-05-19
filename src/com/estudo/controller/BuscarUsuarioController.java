package com.estudo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;


@WebServlet("/buscarusuariocontroller.do")
public class BuscarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UsuarioDao usuarioDao = new UsuarioDao();
		ArrayList<Usuario> lista = usuarioDao.buscarTodosUsuarios();
		
		request.setAttribute("lista", lista);
		request.getRequestDispatcher("buscartodosusuarios.jsp").forward(request, response);
		
	}

}
