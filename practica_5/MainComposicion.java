package practica_5;

class Materia {
    private String nombre;
    private int creditos;


    public Materia(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }


    public String getNombre() {
        return nombre;
    }


    public int getCreditos() {
        return creditos;
    }


    @Override
    public String toString() {
        return nombre + " (" + creditos + " creditos)";
    }
}


class CarreraUniversitaria {
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


public class MainComposicion {
    public static void main(String[] args) {
        Materia[] materiasSistemas = {
            new Materia("Programacion Orientada a Objetos", 5),
            new Materia("Estructura de Datos", 5),
            new Materia("Bases de Datos", 6)
        };


        CarreraUniversitaria sistemas = new CarreraUniversitaria(
            "Ingenieria en Sistemas Computacionales",
            "Ingenieria y Tecnologia",
            materiasSistemas
        );


        sistemas.imprimirFichaAcademica();
    }
}
