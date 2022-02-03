package logic.db.tables;

/**
 *
 * @author javier
 */

public class Precio {
    public static final String TABLE_NAME = "precio";
    public static final String ID = "id_precio";
    public static final String FECHA_INICIO = "fecha_i";
    public static final String FECHA_FIN = "fecha_f";
    public static final String PRECIO = "precio";
    
    int id;
    String fecha_inicio;
    String fecha_fin;
    int precio;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
