package com.vendas.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/vendas_db","root","sa");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    } 
    
}
