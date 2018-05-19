package com.estudo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.estudo.jdbc.Conexao;
import com.estudo.entidade.Usuario;

public class UsuarioDao {
	
	Connection con = Conexao.obterConexao();
	
	
	public void cadastrar(Usuario usuario){
		
		String sql="INSERT INTO usuario(nome,login,senha) VALUES (?,?,?)";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.execute();
			preparador.close();
			
			System.out.println("User successfully registered!!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Failure on register user!!!");
		}
	}
	
	public ArrayList<Usuario> buscarTodosUsuarios(){
		
		ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>(); 

		String sql="SELECT * FROM usuario";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			// executa consulta
			
			ResultSet resultado = preparador.executeQuery();
			
			while(resultado.next()){
				
				// cria objeto usuario e insere o retorno da consulta
				Usuario usuario = new Usuario();
				usuario.setCodigo(resultado.getInt("codigo"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
				
				listaUsuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaUsuarios;
	}
	
	public void excluir(Integer codigo){
		String sql = "DELETE FROM usuario WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setInt(1, codigo);
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Usuário excluido com sucesso!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Usuario buscarPorCodigo(Integer codigo){
		
		String sql = "SELECT * FROM usuario WHERE codigo=?";
		Usuario usuario = null;
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setInt(1, codigo);
			ResultSet resultado = preparador.executeQuery();
			
			if(resultado.next()){
				usuario = new Usuario();
				usuario.setCodigo(resultado.getInt("codigo"));
				usuario.setNome(resultado.getString("nome"));
				usuario.setLogin(resultado.getString("login"));
				usuario.setSenha(resultado.getString("senha"));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return usuario;
		
	}
	public void alterar(Usuario usuario){
		
		String sql= "UPDATE usuario SET nome=?,login=?,senha=? WHERE codigo=?";
		
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			preparador.setInt(4, usuario.getCodigo());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}




