package br.fiap.modelo;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class testeDespesa {
    public static void main(String[] args) {
    DespesaDAO dao = new DespesaDAO();
    Despesa despesa = new Despesa();

        DateTimeFormatter mascara = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//    despesa.setId(100L);
//    create sequence sqcat start with 10 increment by 1;
    despesa.setDescricao("viagem pro chile");
    despesa.setData(LocalDate.parse("01/10/2003"));
    despesa.setValor(5630.00);
    despesa.setCategoria( new Categoria(1L, null));

    }
}
