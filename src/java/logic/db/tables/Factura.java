package logic.db.tables;

/**
 *
 * @author javier
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Factura {
    public static final String TABLE_NAME = "factura";
    public static final String ID = "id_factura";
    public static final String PLACA = "placa";
    public static final String FECHA_INGRESO = "fecha_i";
    public static final String FECHA_SALIDA = "fecha_f";
    public static final String TIEMPO = "tiempo";
    public static final String PRECIO = "precio";
    
    private final DateTimeFormatter dateTime_formater = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    int id;
    String placa;
    String fecha_ingreso;
    String fecha_salida;
    String tiempo;
    int precio;

    public Factura() {
    }

    public Factura(int id, String placa, String fecha_ingreso, String fecha_salida, String tiempo, int precio) {
        this.id = id;
        this.placa = placa;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.tiempo = tiempo;
        this.precio = precio;
    }
    
    

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }
    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }
    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
