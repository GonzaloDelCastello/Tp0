import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante(
        "Juan", "Perez", 20, "Ingenieria", 8.5
        );
        Estudiante estudiante2 = new Estudiante(
              "Maria", "Gomez", 22, "Medicina", 9.2
        );
        Estudiante estudiante3 = new Estudiante();
            estudiante3.setNombre("Luis");
            estudiante3.setApellido("Lopez");
            estudiante3.setEdad(19);
            estudiante3.setCarrera("Derecho");
            estudiante3.setPromedio(8.5);
            
        List<Estudiante> estudiantes = new ArrayList<>();
            estudiantes.add(estudiante1);
            estudiantes.add(estudiante2);
            estudiantes.add(estudiante3);
        
        Materia materia1 = new Materia("Matematicas", 101, 4, 9.0);
        Materia materia2 = new Materia("Fisica", 102, 3, 8.5);
        Materia materia3 = new Materia("Quimica", 103, 4, 7.5);
        Materia materia4 = new Materia("Anatomia", 201, 5, 9.5);
        estudiante1.agregarMateria(materia1);
        estudiante1.agregarMateria(materia2);
        estudiante2.agregarMateria(materia4);
        estudiante2.agregarMateria(materia2);
        estudiante3.agregarMateria(materia1);
        estudiante3.agregarMateria(materia3);
        estudiante3.agregarMateria(materia2);
        for (Estudiante estudiante : estudiantes) {
            System.out.println("-------------------");
            System.out.println(estudiante.getNombre() + 
            ", Promedio: " + estudiante.calcularPromedio());
        }

    //         for (Estudiante estudiante : estudiantes) {
    //             System.out.println("-------------------");
    //             System.out.println(estudiante.getNombre() + ", Promedio: " + estudiante.getPromedio());
    //         }
        
     }
}
