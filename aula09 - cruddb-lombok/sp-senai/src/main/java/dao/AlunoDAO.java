package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.ConexaoMySQL;
import model.Aluno;

public class AlunoDAO {

	private static Connection conn;

	public AlunoDAO() {

		try {
			conn = new ConexaoMySQL().getConexao();
		} catch (SQLException e) {
			System.err.println("Erro com o banco de dados: " + e.getMessage());
		}
	}

	public List<Aluno> listarAlunos() {
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

	public Aluno buscarAlunoId(Integer id) {
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

}
