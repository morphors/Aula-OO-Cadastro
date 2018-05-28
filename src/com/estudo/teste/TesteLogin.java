package com.estudo.teste;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

public class TesteLogin {

	public static void main(String[] args) {
		
		UsuarioDao usuariodao = new UsuarioDao();
		
		String login = "DARTH";
		String senha = "123";
		
		Usuario usuario = usuariodao.autenticar(login, senha);
		
		
		if(usuario!=null){
		System.out.println("Código: " + usuario.getCodigo()+
				"\nNome: " +usuario.getNome() + 
				"\nLogin: " +usuario.getLogin() + 
				"\nSenha: " +usuario.getSenha());
		}else{
			System.out.println("usuário invalido");
		}

	}

}
