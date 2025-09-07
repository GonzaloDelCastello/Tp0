public class Materia {
    
    private String nombre;
    private int codigo;
    private int creditos;
    private double calificacion;
    
    public Materia() {}
    
    public Materia(String nombre, int codigo, int creditos, double calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = calificacion;
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
    public double getCalificacion() {
        return this.calificacion;
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
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    @Override
    public String toString() {
        return "Materia [nombre=" + this.nombre + ", codigo=" + this.codigo
         + ", creditos=" + this.creditos + ", calificacion=" + this.calificacion + "]";
    }
    
}
