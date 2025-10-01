

public class App {
    public static void main(String[] args) throws Exception {
    
    //Crea un estudiantes
    Estudiante estudiante1 = new Estudiante();
    estudiante1.setNombre("Juan");
    estudiante1.setApellido("Perez");
    estudiante1.setEdad(20);
    estudiante1.setPromedio(8.5);
        //System.out.println(estudiante1.toString());
    Estudiante estudiante2 = new Estudiante("Maria","Gomez",2,9.0);
    Estudiante estudiante3 = new Estudiante("Luis","Lopez",19,8.0);
    Estudiante estudiante4 = new Estudiante("Ana","Martinez",21,7.5);
        
    //Crea una universidad
    Universidad uNVIME = new Universidad("UNVIME","Av. Siempre Viva 123");
    
    //Crea una carrera
    Carrera programacion = new Carrera("Programación",3);
    Carrera ingSistemas = new Carrera("Ingenieria en Sistemas",5);
    
    //Crea materias
    Materia programacion1 = new Materia("Programacion 1",101,4,programacion);
    Materia matematica = new Materia("Matematica",102,3,programacion);
    
    //Agrega carreras a la universidad
    uNVIME.agregarCarrera(programacion);
    uNVIME.agregarCarrera(ingSistemas);

    //Agrega materias a la carrera
    programacion.agregarMateria(programacion1);
    programacion.agregarMateria(matematica);
    ingSistemas.agregarMateria(matematica);
    ingSistemas.agregarMateria(programacion1);

    //Agrega estudiantes a las materias
    programacion1.agregarEstudiante(estudiante1);
    programacion1.agregarEstudiante(estudiante2);
    matematica.agregarEstudiante(estudiante3);
    matematica.agregarEstudiante(estudiante4);
    programacion1.agregarEstudiante(estudiante3);
    matematica.agregarEstudiante(estudiante1);

    System.out.println(uNVIME.getNombre() + " tiene las siguientes carreras:");
    for (Carrera carrera : uNVIME.getCarreras()) {
        System.out.println("- " + carrera.getNombre() + " (" + carrera.getDuracion() + " años) con las siguientes materias:");
        for (Materia materia : carrera.getMaterias()) {
            System.out.println("  * " + materia.getNombre() + " (Código: " + materia.getCodigo() + ", Créditos: " + materia.getCreditos() + ") con los siguientes estudiantes:");
            for (Estudiante estudiante : materia.getEstudiantes()) {
                System.out.println("    - " + estudiante.getNombre() + " " + estudiante.getApellido() + " (Edad: " + estudiante.getEdad() + ", Promedio: " + estudiante.getPromedio() + ")");
            }
        }
    }

}
}
