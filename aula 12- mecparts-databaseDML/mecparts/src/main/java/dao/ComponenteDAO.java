package dao;

import config.ConexaoMySQL;
import dto.ComponenteDTO;
import config.ConexaoMySQL;
import model.Componente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComponenteDAO implements IGenericDAO<ComponenteDTO> {
    private static Connection conn;

    public ComponenteDAO() {
        try {
            conn = new ConexaoMySQL().getConexao();
        } catch (SQLException e) {
            System.err.println("Deu ruim no banco... " + e.getMessage() + "\n" + e.getStackTrace());
        }
    }

    @Override
    public ComponenteDTO create(ComponenteDTO obj) {
        String sql = "insert into componentes(?) values(?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            return obj;
        }catch (SQLException e){
            System.out.println("Erro ao inserir componente: " + e.getMessage());
        }

        return  null;
    }

    @Override
    public List<ComponenteDTO> readAll() {

        List<ComponenteDTO> componentes = new ArrayList<>();
        String sql = "select * from componentes";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Integer id = rs.getInt("id_componente");
                String nome = rs.getString("nome_componente");
                Double preco = rs.getDouble("preco_unitario");

                componentes.add(new ComponenteDTO(id, nome, preco));
            }
        } catch (SQLException e) {
            System.err.println("Deu ruim no banco... " + e.getMessage() + "\n" + e.getStackTrace());
        }

        return componentes.isEmpty() ? null : componentes;
    }

    @Override
    public Optional<ComponenteDTO> readById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<ComponenteDTO> readByName(String nome) {
        return Optional.empty();
    }

    @Override
    public void update(ComponenteDTO obj) {

    }

    @Override
    public void delete(ComponenteDTO obj) {

    }


}
