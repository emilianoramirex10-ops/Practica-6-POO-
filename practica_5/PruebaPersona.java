package practica_5;

public class PruebaPersona {
    public void ejecutar() {
        Persona persona = new Persona();
        Fecha nacimiento = new Fecha();

        persona.setNombre("Juan");
        persona.setApellido("Perez");
        nacimiento.setDia(15);
        nacimiento.setMes(8);
        nacimiento.setAnio(1950);
        persona.setFNacimiento(nacimiento);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de nacimiento: "
                + persona.getFNacimiento().getDia() + "/"
                + persona.getFNacimiento().getMes() + "/"
                + persona.getFNacimiento().getAnio());
    }
}