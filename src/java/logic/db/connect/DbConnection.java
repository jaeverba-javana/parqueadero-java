package logic.db.connect;

/**
 *
 * @author javier
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbConnection {
    private static final String url = "jdbc:mysql://localhost:3306/parqueadero";
    private static final String user = "root";
    private static final String password = "135689795623Javana@";
    
    public static final String CONDICIONAL_Y = "and";
    public static final String CONDICIONAL_O = "or";
    
    
    private static void conectarConLaLibreria() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static Connection conectarConLaBd() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void insertar(DbConnection conexion, String query) {
        conectarConLaLibreria();
        
        Statement stmt;
        
        try {
            Connection conn = conectarConLaBd();
            stmt = conn.createStatement();
            stmt.executeUpdate("");
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet consultar(String query){ //para una consulta super sencilla
        conectarConLaLibreria();
        
        ResultSet rs = null;
        Statement stmt;
       
        try {
            Connection conn = conectarConLaBd();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
        } catch(SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static ResultSet consultar(String tabla, String[] condi) { //para una conculta simple con condicionales
        conectarConLaLibreria();
        ResultSet rs = null;
        PreparedStatement ps;
       
        String query = "select * from "+tabla+" where";
        
        for (int i = 0; i < condi.length; i++) {
            query += " ?";
        }
        
        try {
            Connection conn = conectarConLaBd();
            //stmt = conn.createStatement();
            ps = conn.prepareStatement(query);
            for (int i = 0; i < condi.length; i++) {
                ps.setString(i+1, condi[i]);
            }   
            rs = ps.executeQuery(query);
        } catch(SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    

    /*public DbConnection() throws SQLException{
        InitialContext init_context;
        Connection conn = null;
        
        try {
            init_context = new InitialContext();
            DataSource ds = (DataSource) init_context.lookup("java:/comp/env/jdbc/basePostgresql");
            conn = ds.getConnection();
        } catch (NamingException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
        }
        
        if ((conn == null) || conn.isClosed()) {
            System.out.println("NO HAY CONEXIÓN A LA BASE DE DATOS");
            throw new SQLException("NO HAY CONEXIÓN A LA BASE DE DATOS basePostgresql");
        }
        
        //return conn;
    }*/
}
