package com.estudo.teste;

import com.estudo.dao.UsuarioDao;
import com.estudo.entidade.Usuario;

public class TesteCadastrar {

	public static void main(String[] args) {
		
		// cria objeto usuario
		Usuario novo = new Usuario();
		novo.setNome("Steve Wozniak");
		novo.setLogin("woz");
		novo.setSenha("macan");

		// cria objeto para cadastro
		UsuarioDao registra = new UsuarioDao();
		
		// executa metodo
		registra.cadastrar(novo);
	}

}
