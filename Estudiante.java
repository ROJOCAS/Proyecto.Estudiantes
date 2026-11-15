public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private double calificacion1, calificacion2, calificacion3;

    public Estudiante(String nombre, int edad, String matricula,
                      double calificacion1, double calificacion2, double calificacion3) {
        this.nombre=nombre; this.edad=edad; this.matricula=matricula;
        this.calificacion1=calificacion1; this.calificacion2=calificacion2; this.calificacion3=calificacion3;
    }
    public double calcularPromedio() {
        return (calificacion1+calificacion2+calificacion3)/3.0;
    }
    public boolean estaAprobado() { return calcularPromedio()>=70; }

    /** Método común que las clases derivadas pueden sobrescribir. */
    public void mostrarInformacion() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Matrícula: "+matricula);
        System.out.printf("Promedio: %.2f%n",calcularPromedio());
        System.out.println("Estado: "+(estaAprobado()?"APROBADO":"REPROBADO"));
    }
}
