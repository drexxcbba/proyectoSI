import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexcion {
    
    public Connection getConex() throws ClassNotFoundException{
    
        Connection res = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            res = DriverManager.getConnection("jdbc:mysql://localhost:3306/postres", "root", "juan1999");
            
        } catch (SQLException ex) {
            Logger.getLogger(conexcion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
