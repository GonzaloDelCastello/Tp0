import java.util.ArrayList;

public class Estudiante {

private String nombre;
private String apellido;
private int edad;
private Carrera carrera;
private double promedio;
private ArrayList<Materia> materias;

public Estudiante() {};

public Estudiante(String nombre, String apellido, int edad, double promedio) {
    this.nombre = nombre;
    this.apellido = apellido;
    setEdad(edad);
    this.promedio = promedio;
}

public String correr(){
    return this.nombre + " está corriendo";
};

public void agregarMateria(Materia materia) {
    if (this.materias == null) {
        this.materias = new ArrayList<>();
    } else {
        this.materias.add(materia);
    }
}
public ArrayList<Materia> getMaterias() {
    return this.materias;
}
// public double calcularPromedio() {
//     double suma = 0;
//     for (Materia materia : this.materias){
//         suma += materia.getCalificacion();
//     }
//     return suma / this.materias.size();
// }

public String getNombre() {
    return this.nombre;
}
public String getApellido() {
    return this.apellido;
}
public int getEdad() {
    return this.edad;
}
public double getPromedio() {
    return this.promedio;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public void setEdad(int edad) {
    if (edad>120 || edad<16) {
        System.out.println("Edad no valida");
        return;         
    } else {
    this.edad = edad;
    }
}


public double setPromedio(double promedio) {
    return this.promedio = promedio;
}
@Override
public String toString() {
    return "Estudiante [nombre=" + this.nombre + ", apellido=" + this.apellido
     + ", edad=" + this.edad + ", carrera=" + this.carrera
     + ", promedio=" + this.promedio + "]";
}
}