/**
 * Clase que representa a un Estudiante.
 * Aplica los conceptos de encapsulamiento y definición de atributos.
 */
public class Estudiante {

    // Atributos privados de la clase
    private final String nombre;
    private final String matricula;
    private final String carrera;
    private final double promedio; 

    /**
     * Constructor para inicializar los atributos del estudiante al momento de crearlo.
     */
    public Estudiante(String nombre, String matricula, String carrera, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    /**
     * Método para mostrar los datos del estudiante en la consola.
     */
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("---------------------------");
    }
}

