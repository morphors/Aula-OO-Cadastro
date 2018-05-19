package com.estudo.teste;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

public class TesteBuscarPorCodigo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		UsuarioDao usuariodao = new UsuarioDao();
		
		Usuario usuario = usuariodao.buscarPorCodigo(18);
		
		System.out.println("Código: " + usuario.getCodigo()+
				"\nNome: " +usuario.getNome() + 
				"\nLogin: " +usuario.getLogin() + 
				"\nSenha: " +usuario.getSenha());
		

	}

}
