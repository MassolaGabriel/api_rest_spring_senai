package view;

import dao.ComponenteDAO;
import dto.ComponenteDTO;
import model.Componente;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ComponenteDAO componenteDAO = new ComponenteDAO();
        List<ComponenteDTO> componentes = new ArrayList<>();

        componentes = componenteDAO.readAll();

        for (ComponenteDTO componente : componentes) {
            System.out.println(componente);
        }

        Componente componente1 = new Componente();
        componente1.setId(31);
        componente1.setNome("Ladrihador");
        componente1.setDescricao("Corta todos os ladrilhos");
        componente1.setPreco("R$ 89,99");
        componente1.setQuantidade("5");

        componenteDAO.create(componente1);
    }
}
