public class EstudianteEnLinea extends Estudiante {
    private String plataforma;
    private int actividadesEntregadas;

    public EstudianteEnLinea(String nombre,int edad,String matricula,double c1,double c2,double c3,
                             String plataforma,int actividadesEntregadas) {
        super(nombre,edad,matricula,c1,c2,c3); // Reutiliza el constructor de Estudiante.
        this.plataforma=plataforma; this.actividadesEntregadas=actividadesEntregadas;
    }
    public boolean tieneActividadesCompletas() { return actividadesEntregadas>=8; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Muestra primero la información común.
        System.out.println("Modalidad: En línea");
        System.out.println("Plataforma: "+plataforma);
        System.out.println("Actividades entregadas: "+actividadesEntregadas);
        System.out.println("Entrega de actividades: "+(tieneActividadesCompletas()?"COMPLETA":"PENDIENTE"));
    }
}
