package br.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Conexao {
    private static String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static String USER = "rm559031 ";
    private static String PASSWORD = "011003";

    private Conexao() {}

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch(SQLException e) {
            System.out.println("Erro ao conectar no banco\n" + e);
        }
        return null;
    }
}
