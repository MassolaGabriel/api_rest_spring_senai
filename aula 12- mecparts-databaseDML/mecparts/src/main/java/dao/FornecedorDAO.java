package dao;

import config.ConexaoMySQL;

import java.sql.Connection;
import java.sql.SQLException;

public class FornecedorDAO {
    private static Connection conn;

    public FornecedorDAO(){
        try {
            conn = new ConexaoMySQL().getConexao();
        }catch (SQLException e){
            System.out.println("Deu ruim... " + e.getMessage());
        }
    }
}
