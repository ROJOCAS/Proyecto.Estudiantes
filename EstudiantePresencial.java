public class EstudiantePresencial extends Estudiante {
    private String aula;
    private int asistencias;

    public EstudiantePresencial(String nombre,int edad,String matricula,double c1,double c2,double c3,
                                String aula,int asistencias) {
        super(nombre,edad,matricula,c1,c2,c3); // Inicializa los datos heredados.
        this.aula=aula; this.asistencias=asistencias;
    }
    public boolean cumpleAsistencia() { return asistencias>=80; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutiliza el método de la clase base.
        System.out.println("Modalidad: Presencial");
        System.out.println("Aula: "+aula);
        System.out.println("Asistencias: "+asistencias);
        System.out.println("Requisito de asistencia: "+(cumpleAsistencia()?"CUMPLIDO":"NO CUMPLIDO"));
    }
}
