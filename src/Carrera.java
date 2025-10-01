import java.util.ArrayList;
public class Carrera {
    private int id;
    private String nombre;
    private int duracion;
    private ArrayList<Materia> materias;
    private int cantidadMaterias = 0;

    public Carrera() {}
    public Carrera(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getDuracion() {
        return this.duracion;
    }
    public int getId() {
        return this.id;
    }
    public ArrayList<Materia> getMaterias() {
        return this.materias;
    }
    public int getCantidadMaterias() {
        return this.cantidadMaterias;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void agregarMateria(Materia materia) {
        if (this.materias == null) {
            this.materias = new ArrayList<>();
        } else {
            this.materias.add(materia);
            this.cantidadMaterias++;
        }
    }
}
