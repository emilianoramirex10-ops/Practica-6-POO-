package practica_5;

public class CarreraUniversitaria {
    private String nombreCarrera;
    private String area;
    private Materia[] materias;

    public CarreraUniversitaria(String nombreCarrera, String area, Materia[] materias) {
        this.nombreCarrera = nombreCarrera;
        this.area = area;
        this.materias = materias;
    }

    public void imprimirFichaAcademica() {
        System.out.println("Carrera: " + nombreCarrera);
        System.out.println("Area: " + area);
        System.out.println("Plan de estudios (Materias):");
        for (Materia m : materias) {
            System.out.println(" - " + m);
        }
        System.out.println();
    }
}