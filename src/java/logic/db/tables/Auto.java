package logic.db.tables;

/**
 *
 * @author javier
 */

public class Auto {
    public static final String TABLE_NAME = "auto";
    public static final String ID = "id_auto";
    public static final String PLACA = "placa";
    public static final String FECHA_INGRESO = "fecha_i";
    
    int id;
    String placa;
    String fecha_ingreso;

    public Auto() {
    }

    public Auto(int id, String placa, String fecha_ingreso) {
        this.id = id;
        this.placa = placa;
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getId() {
        return this.id;
    }
    public void serId(int id) {
        this.id = id;
    }
    
    public String getPlaca() {
        return this.placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFecha_ingreso() {
        return this.fecha_ingreso;
    }
    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
}
