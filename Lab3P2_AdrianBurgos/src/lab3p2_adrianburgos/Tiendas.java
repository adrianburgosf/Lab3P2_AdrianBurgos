package lab3p2_adrianburgos;
import java.util.ArrayList;

public class Tiendas {
    private String nombre;
    private String ubicacion;
    private int empleados;
    private int minutosespera;
    private ArrayList articulos = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getMinutosespera() {
        return minutosespera;
    }

    public void setMinutosespera(int minutosespera) {
        this.minutosespera = minutosespera;
    }

    public ArrayList getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList articulos) {
        this.articulos = articulos;
    }
    
}
