package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author LEE
 */
public class ModuloConexao {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //"chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazena informaçoes referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        
        //Estabelecenco conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch(Exception e){
            //serve de apoio para exclarecer o erro
            //System.out.println(e);
            System.out.println(e);
            return null;
        }
    }
            
}
