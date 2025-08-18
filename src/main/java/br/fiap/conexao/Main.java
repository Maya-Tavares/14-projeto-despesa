package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoriaDAO dao = new CategoriaDAO();
//        Categoria categoria = new Categoria(2L, "auto");
//        dao.inserir(categoria);
        List<Categoria> list = dao.listar();
        for(Categoria categoria : list){
            System.out.println(categoria.getId() + " ----> " + categoria.getCategoria());
        }
    }
}
