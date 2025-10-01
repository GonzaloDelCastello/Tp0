import java.util.ArrayList;

public class Universidad {
    
    private int id;
    private String nombre;
    private String direccion;
    private ArrayList<Carrera> carreras;

    public Universidad() {}
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.carreras = new ArrayList<>();
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public int getId() {
        return this.id;
    }
    
    public ArrayList<Carrera> getCarreras() {
        return this.carreras;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void agregarCarrera(Carrera carrera) {
        if (this.carreras == null) {
            this.carreras = new ArrayList<>();
        } else {
            this.carreras.add(carrera);
        }
    }
    
    
}
