/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosisinfo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexcion {
    
    public Connection getConex() throws ClassNotFoundException{
    
        Connection res = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            res = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueva2", "root", "");
            
        } catch (SQLException ex) {
            Logger.getLogger(conexcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
