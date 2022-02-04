package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.db.connect.DbConnection;
import logic.db.tables.Auto;

public class AutoDao implements AutoMan{
    @Override
    public int AutoMan(Auto auto) {
        String query = "select * from "+Auto.PLACA+"=?";
        ResultSet rs = DbConnection.consultar(query);
        int cont = 0;
        try {
            while (rs.next()) {
//                resp[cont][0] = rs.getString(Auto.PLACA);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 4;
    }
}
