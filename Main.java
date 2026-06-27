/**
 * Clase principal que ejecuta la aplicación de gestión de estudiantes.
 * Aquí se realiza la instanciación de objetos y la prueba de métodos.
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- GESTION DE ESTUDIANTES ---\n");

        // Instanciación de objetos (Creación de estudiantes usando el constructor)
        Estudiante estudiante1 = new Estudiante("Juan Perez", "20260001", "Ingenieria de Software", 9.5);
        Estudiante estudiante2 = new Estudiante("Maria Lopez", "20260002", "Ingenieria de Software", 8.8);

        // Uso y prueba de los métodos
        System.out.println("Datos del Primer Estudiante:");
        estudiante1.mostrarDatos();

        System.out.println("Datos del Segundo Estudiante:");
        estudiante2.mostrarDatos();
    }
}