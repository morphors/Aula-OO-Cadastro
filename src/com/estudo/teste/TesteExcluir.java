package com.estudo.teste;

import com.estudo.dao.UsuarioDao;

public class TesteExcluir {

	public static void main(String[] args) {
		

		// cria objeto 
		UsuarioDao usuarioDao = new UsuarioDao();
		
		// executa metodo excluir
		usuarioDao.excluir(9);

	}
}
