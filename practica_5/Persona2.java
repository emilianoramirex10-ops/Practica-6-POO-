package practica_5;

public class Persona2 {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona2() {
        fNacimiento = new Fecha();
    }

    public Persona2(String nombre, String apellido, int fDia, int fMes, int fAnio) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Se inicializa fNacimiento para evitar un error de NullPointerException
        this.fNacimiento = new Fecha(); 
        this.fNacimiento.setDia(fDia);
        this.fNacimiento.setMes(fMes);
        this.fNacimiento.setAnio(fAnio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFNacimiento(int dia, int mes, int anio) {
        fNacimiento.setDia(dia);
        fNacimiento.setMes(mes);
        fNacimiento.setAnio(anio);
    }

    public Fecha getFNacimiento() {
        return fNacimiento;
    }
}