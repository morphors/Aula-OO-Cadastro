package com.estudo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

@WebServlet("/alterarusuariocontroller.do")
public class AlterarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer codigo = Integer.parseInt(request.getParameter("codigo"));
		
		UsuarioDao usuariodao = new UsuarioDao();
		Usuario usuario = usuariodao.buscarPorCodigo(codigo);
		
		request.setAttribute("usuario", usuario);
		request.getRequestDispatcher("alterar.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Integer codigo = Integer.parseInt(request.getParameter("txtcodigo"));
		String nome = request.getParameter("txtnome");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		Usuario novoUsuario = new Usuario();
		novoUsuario.setCodigo(codigo);
		novoUsuario.setNome(nome);
		novoUsuario.setLogin(login);
		novoUsuario.setSenha(senha);
		
		UsuarioDao registra = new UsuarioDao();
		registra.alterar(novoUsuario);
		
		response.sendRedirect("buscarusuariocontroller.do");
		
	}

}
