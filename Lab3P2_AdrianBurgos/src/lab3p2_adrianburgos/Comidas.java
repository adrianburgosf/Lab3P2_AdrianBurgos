package lab3p2_adrianburgos;
import java.util.ArrayList;

public class Comidas {
    private int id;
    private String nombrecomida;
    private double precio;
    private int cantidadacom;
    private ArrayList<Acompañamiento> acompañamiento = new ArrayList();    

    public Comidas(String nombrecomida, double precio) {
        this.nombrecomida = nombrecomida;
        this.precio = precio;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecomida() {
        return nombrecomida;
    }

    public void setNombrecomida(String nombrecomida) {
        this.nombrecomida = nombrecomida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadacom() {
        return cantidadacom;
    }

    public void setCantidadacom(int cantidadacom) {
        this.cantidadacom = cantidadacom;
    }

    public ArrayList getAcompañamiento() {
        return acompañamiento;
    }

    public void setAcompañamiento(ArrayList acompañamiento) {
        this.acompañamiento = acompañamiento;
    }

    @Override
    public String toString() {
        return "Comidas{" + "nombrecomida=" + nombrecomida + ", precio=" + precio + '}';
    }
    
}
