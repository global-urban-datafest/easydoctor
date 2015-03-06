package br.com.fiap.am.sqlhelper;
import java.lang.reflect.Type;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
 */
public class Main {
    
    
    
    public static void main(String[] args) throws InstantiationException, IllegalAccessException
    {
        SqlHelper dao = new SqlHelper();
        /*
        String comando = "insert into JAVA_USUARIO VALUES (?, ?, ?)";
        ArrayList<Parametro> param = new ArrayList<>();
        param.add(new Parametro(1, 3));
        param.add(new Parametro(2, "teste"));
        param.add(new Parametro(3, "123"));
        dao.executeUpdate(comando, param);
         */
        
        
        ArrayList<Usuario> user = new ArrayList<>();
        
        
        Usuario a = new Usuario(1, "a", "123");
        
        
      //  Usuario executeObject = dao.executeObject(new Usuario(), Usuario.class);
        
        System.out.println("ok");
        
    }
    
}
