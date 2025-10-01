import java.util.ArrayList;

public class Materia {
    
    private String nombre;
    private int codigo;
    private int creditos;
    private Carrera carrera;
    private ArrayList<Estudiante> estudiantes;
    
    public Materia() {}
    
    public Materia(String nombre, int codigo, int creditos, Carrera carrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.carrera = carrera;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public int getCreditos() {
        return this.creditos;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    // public void setCalificacion(double calificacion) {
    //     this.calificacion = calificacion;
    // }
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }
    public Carrera getCarrera() {
        return this.carrera;
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return this.estudiantes;
    }
    public void agregarEstudiante(Estudiante estudiante) {
        if (this.estudiantes == null) {
            this.estudiantes = new ArrayList<>();
        } else {
            this.estudiantes.add(estudiante);
        }
    }

    @Override
    public String toString() {
        return "Materia [nombre=" + this.nombre + ", codigo=" + this.codigo
         + ", creditos=" + this.creditos + ", calificacion=" + "]";
    }
    
}
