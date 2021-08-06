package lab3p2_adrianburgos;

public class Clientes extends Usuarios {
    private String nombre;
    private String apellido;
    private int id;
    private String domicilio;
    private int pedidos;
    
    public Clientes(String nombre, String apellido, String domicilio, int id) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.id = id;
        this.pedidos = 0;
    }
    
    public Clientes() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", domicilio=" + domicilio + ", pedidos=" + pedidos + '}';
    }
    
}
