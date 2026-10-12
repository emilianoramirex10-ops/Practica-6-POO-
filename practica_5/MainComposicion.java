package practica_5;

public class MainComposicion {
    public void ejecutar() {
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