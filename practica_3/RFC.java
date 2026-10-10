package practica_3;

import java.util.Scanner;
import java.util.Random;
import java.time.LocalDate;
public class RFC {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  System.out.print("Ingresa tu nombre: ");
String nombre = sc.nextLine().trim().toUpperCase();
System.out.print("Ingresa tu apellido paterno: ");
String apellidoPaterno = sc.nextLine().trim().toUpperCase();
System.out.print("Ingresa tu apellido materno: ");
String apellidoMaterno = sc.nextLine().trim().toUpperCase();
int año;
int mes;
int dia;
while (true) {
    System.out.print("Ingresa tu año de nacimiento (AAAA): ");
    if (sc.hasNextInt()) {
        año = sc.nextInt();
        if (año >= 1900 && año <= 2026) {
            break;
}
        System.out.println("El año no es válido.");
    } else {
 System.out.println("Debes ingresar un número.");

 sc.next(); }
}
while (true) {
    System.out.print("Ingresa tu mes de nacimiento (1-12): ");
    if (sc.hasNextInt()) {
        mes = sc.nextInt();
        if (mes >= 1 && mes <= 12) {
            break;
 }
        System.out.println("El mes no es válido.");
    } else {
        System.out.println("Debes ingresar un número.");
sc.next(); }
}
// Validar día
while (true) {
    System.out.print("Ingresa tu día de nacimiento: ");
    if (sc.hasNextInt()) {
        dia = sc.nextInt();
 
          try {
            LocalDate.of(año, mes, dia);
            break;
        } catch (Exception e) {
            System.out.println("El día no es válido.");
}
} else {
        System.out.println("Debes ingresar un número.");
sc.next(); }
}
char letra1 = apellidoPaterno.charAt(0);
char vocal = primeraVocal(apellidoPaterno);
char letra3 = apellidoMaterno.charAt(0);
char letra4 = nombre.charAt(0);
String fecha = String.format("%02d%02d%02d",año % 100,mes,dia);
generarHomoclave());
        sc.close();
    }
System.out.println("\nRFC: "+ letra1+ vocal+ letra3+ letra4+fecha+
private static char primeraVocal(String apellido) {

      for (int i = 1; i < apellido.length(); i++) {
        char letra = apellido.charAt(i);
        if (letra == 'A' ||letra == 'E' ||letra == 'I' ||letra == 'O' ||letra == 'U') {
            return letra;
} }
return 'X'; }
private static String generarHomoclave() {
    String caracteres =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();
    String homoclave = "";
    for (int i = 0; i < 3; i++) {
        int posicion =random.nextInt(caracteres.length());
homoclave += caracteres.charAt(posicion);

}
return homoclave;
    }
}