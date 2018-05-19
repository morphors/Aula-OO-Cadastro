package com.estudo.teste;

import java.util.ArrayList;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;
 

public class TesteBuscarTodos {

	public static void main(String[] args) 
	{
		
		ArrayList<Usuario> listagem = new ArrayList<Usuario>();
		
		UsuarioDao usuariodao = new UsuarioDao();
		
		listagem = usuariodao.buscarTodosUsuarios();
		
		for(Usuario usuario:listagem)
		{
			System.out.println("------------------");
			System.out.println("Cod: " + usuario.getCodigo());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Login: " + usuario.getLogin());
			System.out.println("Senha: " + usuario.getSenha());		
		}
	}

}