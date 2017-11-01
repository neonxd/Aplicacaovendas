
package com.vendas.DAO;

import com.vendas.conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FuncionarioDao {
    Connection conn = new Conexao().getConnection();
    
    public boolean loginfuncionario(String emailfuncionario) throws SQLException{
        boolean login = false;
        String query ="select emailfuncionario from funcionario where emailfuncionario like ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, emailfuncionario);
            rs = stmt.executeQuery();
            while(rs.next()){
                login = true;
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
           throw new RuntimeException(ex);
        } finally {
            conn.close();
        } return login;
        
    }

}
