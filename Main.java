public class Main {
    public static void main(String[] args) {
        EstudiantePresencial presencial = new EstudiantePresencial(
            "Ana López",20,"A001",85,90,88,"Aula 12",92);
        EstudianteEnLinea enLinea = new EstudianteEnLinea(
            "Carlos Pérez",24,"L002",78,82,91,"Aula Virtual",9);

        System.out.println("===== ESTUDIANTE PRESENCIAL =====");
        presencial.mostrarInformacion();
        System.out.println("\n===== ESTUDIANTE EN LÍNEA =====");
        enLinea.mostrarInformacion();
    }
}
