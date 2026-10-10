package practica_3;

import java.util.Scanner;
public class Cadenas {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); System.out.println("Dame una cadena de texto"); String cadena = sc.nextLine(); System.out.println(cadena.length()); System.out.println(cadena.toUpperCase()); System.out.println(cadena.length()); System.out.println(cadena.toLowerCase()); System.out.println(cadena.trim());
} }