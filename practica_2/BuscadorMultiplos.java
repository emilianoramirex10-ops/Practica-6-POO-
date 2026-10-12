package practica_2;

import java.util.Scanner;
import java.util.ArrayList;
public class Sumatres {
    public static void main(String[] args) {
        // Declaración de variables
int n1, n2;
int i, j;
int tamano;
        // Declaracion del arreglo
        ArrayList<Integer> mult_tres = new ArrayList<Integer>();
        // Declaracion de variables auxiliares
        int mayor, menor;
        Scanner sc = new Scanner(System.in);
        // Pedir datos al usuario
System.out.println("\nPor favor introduzca un número entero: ");
 n1 = sc.nextInt();
 System.out.println("\nIntroduzca otro número entero: ");
n2 = sc.nextInt();
// Asegurarse que las entradas sean positivas
if (n1 < 0) {
    n1 = n1 * -1;
}
if (n2 < 0) {
    n2 = n2 * -1;
}
// Validar cual es el número mayor y el menor
if (n1 > n2) {
    mayor = n1;
    menor = n2;
} else {
    mayor = n2;
menor = n1; }
// Hacer un ciclo desde el menor hasta el mayor

for (i = menor; i <= mayor; i++) {
// Validar si es multiplo de tres
if (i % 3 == 0) {
    mult_tres.add(i);
}
}
        // Obtener el tamaño del arreglo
        tamano = mult_tres.size();
        // Imprimir los elementos del arreglo
        System.out.println("\nImprimiendo los elementos del arreglo");
        for (j = 0; j < tamano; j++) {
            System.out.println("\nElemento " + (j + 1) + " : " + mult_tres.get(j));
}
        sc.close();
    }
}