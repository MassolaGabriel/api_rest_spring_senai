package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.ConexaoMySQL;
import model.Aluno;
import model.DaoInterface;

public class AlunoDAO implements DaoInterface<Aluno> {

	private static Connection conn;

	public AlunoDAO() {

		try {
			conn = new ConexaoMySQL().getConexao();
		} catch (SQLException e) {
			System.err.println("Erro com o banco de dados: " + e.getMessage());
		}
	}

	public List<Aluno> listar() {
		try {
			List<Aluno> alunos = new ArrayList<>();
			String sql = "SELECT * FROM aluno;";

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Integer id = rs.getInt("id");
				String nome = rs.getString("nome");

				alunos.add(new Aluno(id, nome));
			}

			return alunos;

		} catch (SQLException e) {
			System.err.println("Erro com o banco de dados: " + e.getMessage());
		}
		return null;
	}

	public Aluno buscarPorId(Integer id) {
		try {
			String sql = "SELECT * FROM aluno WHERE id = ?";

			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return new Aluno(rs.getInt("id"), rs.getString("nome"));
			}

		} catch (SQLException e) {
			System.err.println("Erro com o banco de dados: " + e.getMessage());
		}
		return null;

	}
	
	public Boolean salvar(Aluno aluno) {
		
		String sql = "INSERT INTO aluno(nome) VALUES (?);";
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			
			ps.execute();
			
			return true;
		} catch (SQLException e) {
			System.err.println("Deu ruim ao inserir o aluno");
		}
		
		return false;
	}

	public Aluno atualizar(Aluno aluno) {
		 
		 try {
			String sql = "UPDATE aluno SET nome = ? WHERE id = ?;";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, aluno.getNome());
			ps.setInt(2, aluno.getId());
			
			ps.execute();
			return aluno;
		} catch (SQLException e) {
			System.out.println("Deu ruim");
		}
		 
		 return null;
		 
	}
	
	public Boolean remover(Aluno aluno) {
		
		
		try {
			String sql = "DELETE * FROM aluno WHERE id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, aluno.getId());
			
			ps.execute();
		} catch (SQLException e) {
			System.err.println("Deu ruim ao remover");
		}
		
		
		return null;
	}

}
