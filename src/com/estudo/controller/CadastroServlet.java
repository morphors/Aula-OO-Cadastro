package com.estudo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

@WebServlet("/cadastro.do")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("txtnome");
		String login = request.getParameter("txtlogin");
		String senha = request.getParameter("txtsenha");
		
		Usuario novoUsuario = new Usuario();
		novoUsuario.setNome(nome);
		novoUsuario.setLogin(login);
		novoUsuario.setSenha(senha);
		
		UsuarioDao registra = new UsuarioDao();
		registra.cadastrar(novoUsuario);
		
		response.sendRedirect("http://localhost:8080/websistema/Cadastro.html");
		
	}

}
