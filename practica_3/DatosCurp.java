package practica_3;

import java.util.Scanner;
import java.time.LocalDate;

public class DatosCurp {
    private static final String[] CLAVES_ENTIDAD = {
            "AS", "BC", "BS", "CC", "CL", "CM", "CS", "CH", "DF", "DG",
            "GT", "GR", "HG", "JC", "MC", "MN", "MS", "NT", "NL", "OC",
            "PL", "QT", "QR", "SP", "SL", "SR", "TC", "TS", "TL", "VZ",
            "YN", "ZS", "NE"
    };
    
    private static final String[] NOMBRES_ENTIDAD = {
            "Aguascalientes", "Baja California", "Baja California Sur", "Campeche",
            "Coahuila", "Colima", "Chiapas", "Chihuahua", "Ciudad de México", "Durango",
            "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México (Estado de México)",
            "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca",
            "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa",
            "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz",
            "Yucatán", "Zacatecas", "Nacido en el extranjero"
    };

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la CURP: ");
        String curp = sc.nextLine().trim().toUpperCase();
        // sc.close(); // No cerrar para no bloquear la consola en el main principal

        if (curp.length() != 18) {
            System.out.println("La CURP debe tener 18 caracteres. Ingresaste " + curp.length() + ".");
            return; 
        }
        if (!cumpleFormato(curp)) {
            System.out.println("La CURP no cumple con el formato esperado." );
            return; 
        }
        if (!fechaValida(curp)) {
            System.out.println("La fecha de nacimiento no es válida.");
            return; 
        }

        String sexoC = curp.substring(10, 11);
        String entidad = curp.substring(11, 13);
        String sexo;
        
        if (sexoC.equals("H")) {
            sexo = "Hombre";
        } else if (sexoC.equals("M")) {
            sexo = "Mujer";
        } else {
            sexo = "No reconocido (" + sexoC + ")";
        }
        
        System.out.println("\n=== Datos de la CURP ===");
        System.out.println("Inicial de apellido paterno: "+ curp.charAt(0));
        System.out.println("Primera vocal del apellido paterno: "+ curp.charAt(1));
        System.out.println("Inicial de apellido materno: "+ curp.charAt(2));
        System.out.println("Inicial de nombre: "+ curp.charAt(3));
        System.out.println("Año de nacimiento: "+ curp.substring(4, 6));
        System.out.println("Mes de nacimiento: "+ curp.substring(6, 8));
        System.out.println("Día de nacimiento: "+ curp.substring(8, 10));
        System.out.println("Sexo: " + sexo);
        
        String nombreEntidad = buscarNombreEntidad(entidad);
        System.out.println("Entidad de nacimiento: "+ nombreEntidad + " (" + entidad + ")");
        System.out.println("Primera consonante interna primer apellido: "+ curp.charAt(13) );
        System.out.println("Primera consonante interna del segundo apellido: "+ curp.charAt(14));
        System.out.println("Primera consonante interna del nombre: " + curp.charAt(15));
        System.out.println("Diferenciador y dígito verificador: "+ curp.substring(16, 18));
        System.out.println( "\nLa fecha de nacimiento es válida.");
    }
    
    private String buscarNombreEntidad(String clave) {
        for (int i = 0; i < CLAVES_ENTIDAD.length; i++) {
            if (CLAVES_ENTIDAD[i].equals(clave)) {
                return NOMBRES_ENTIDAD[i];
            }
        }
        return "No reconocida";
    }
    
    private boolean cumpleFormato(String curp) {
        for (int i = 0; i < 18; i++) {
            char c = curp.charAt(i);
            boolean esLetra = Character.isLetter(c);
            boolean esDigito = Character.isDigit(c);
            
            if (i >= 0 && i <= 3) {
                if (!esLetra) return false;
            } else if (i >= 4 && i <= 9) {
                if (!esDigito) return false;
            } else if (i == 10) {
                if (c != 'H' && c != 'M') return false;
            } else if (i >= 11 && i <= 15) {
                if (!esLetra) return false;
            } else if (i == 16) {
                if (!esLetra && !esDigito) return false;
            } else if (i == 17) {
                if (!esDigito) return false;
            }
        }
        return true;
    }
    
    private boolean fechaValida(String curp) {
        int año = Integer.parseInt(curp.substring(4, 6));
        int mes = Integer.parseInt(curp.substring(6, 8));
        int dia = Integer.parseInt(curp.substring(8, 10));
        try {
            LocalDate.of(1900 + año, mes, dia);
            return true;
        } catch (Exception e) {
            return false;
        }
    } 
}