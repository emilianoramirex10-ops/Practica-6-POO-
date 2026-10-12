package practica_5;

public class PruebaPersona2 {
    public void ejecutar() {
        Persona2 per1 = new Persona2();
        per1.setNombre("Juan");
        per1.setApellido("Perez");
        per1.setFNacimiento(15, 8, 1950);

        System.out.println("Nombre : " + per1.getNombre());
        System.out.println("Apellido : " + per1.getApellido());
        System.out.println("Fecha Nacimiento : " + per1.getFNacimiento());
    }
}