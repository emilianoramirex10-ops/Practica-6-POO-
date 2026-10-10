package practica_1;

import java.util.Scanner;
 public class calculadora1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Dig = -1;
        while (true) {
            System.out.print("Ingresa el numero de digitos (2-5): ");
            if (scanner.hasNextInt()) {
                Dig = scanner.nextInt();
                if (Dig >= 2 && Dig <= 5) {
                    break;
                } else {
                    System.out.println("El numero de digitos debe ser entre 2 y 5.");
                }
            } else {
                System.out.println("Debes ingresar un numero entero.");
                scanner.next();
} }
        double[] numeros = new double[Dig];
        for (int i = 0; i < Dig; i++) {
            while (true) {
                System.out.print("Ingresa el numero " + (i + 1) + ": ");
 if (scanner.hasNextDouble()) {

 numeros[i] = scanner.nextDouble();
                break;
            } else {
                System.out.println("Debes ingresar un numero.");
                scanner.next();
            }
} }
    scanner.nextLine();
String opcion;
    do {
        System.out.println("-----MENU-----");
        System.out.println("a. Suma");
        System.out.println("b. Resta");
        System.out.println("c. Multiplicacion");
        System.out.println("d. Division");
        System.out.println("e. Potencia");
        System.out.println("f. Salir");
        System.out.print("Elige una opcion: ");
        opcion = scanner.nextLine().trim().toLowerCase();
        switch (opcion) {
            case "a":
 double suma = 0;

     for (int i = 0; i < Dig; i++) {
        suma += numeros[i];
    }
    System.out.println("La suma es: " + suma);
    break;
case "b":
    double resta = numeros[0];
    for (int i = 1; i < Dig; i++) {
        resta -= numeros[i];
    }
    System.out.println("La resta es: " + resta);
    break;
case "c":
    double multiplicacion = 1;
    for (int i = 0; i < Dig; i++) {
        multiplicacion *= numeros[i];
    }
    System.out.println("La multiplicacion es: " + multiplicacion);
    break;
case "d":
    double division = numeros[0];
    boolean errorDivision = false;
 for (int i = 1; i < Dig; i++) {

         if (numeros[i] != 0) {
            division /= numeros[i];
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
            errorDivision = true;
            break;
} }
    if (!errorDivision) {
        System.out.println("La division es: " + division);
} break;
case "e":
    double potencia = numeros[0];
    for (int i = 1; i < Dig; i++) {
        potencia = Math.pow(potencia, numeros[i]);
    }
    System.out.println("La potencia es: " + potencia);
    break;
case "f":
    System.out.println("Saliendo del programa...");
    break;
 default:

System.out.println("Opcion invalida. Por favor, elige una opcion
valida.");
}
        } while (!opcion.equals("f"));
        scanner.close();
    }
}
