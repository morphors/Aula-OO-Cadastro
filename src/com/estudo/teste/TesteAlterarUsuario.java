package com.estudo.teste;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

public class TesteAlterarUsuario {

	public static void main(String[] args) {
		// cria objeto usuario
		Usuario altera = new Usuario();
		altera.setCodigo(6);
		altera.setNome("Steve Wozniak");
		altera.setLogin("woz");
		altera.setSenha("macan");

		// cria objeto para cadastro
		UsuarioDao registra = new UsuarioDao();
		
		// executa metodo
		registra.alterar(altera);

	}

}
