package lab3p2_adrianburgos;
import java.util.ArrayList;

public class Restaurantes {
    private String nombre;
    private String ubicacion;
    private String RTN;
    private String slogan;
    private ArrayList<Comidas> comidas = new ArrayList();

    public Restaurantes(String nombre, String ubicacion, String RTN, String slogan) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.RTN = RTN;
        this.slogan = slogan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicaion(String ubicaion) {
        this.ubicacion = ubicacion;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public ArrayList getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList comidas) {
        this.comidas = comidas;
    }

    @Override
    public String toString() {
        return "Restaurantes{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", RTN=" + RTN + ", slogan=" + slogan + '}';
    }
    
}
