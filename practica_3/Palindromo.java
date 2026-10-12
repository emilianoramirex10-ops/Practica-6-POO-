package practica_3;

import java.util.Scanner;

public class Palindromo {
    public void ejecutar() {
        System.out.print("\nInserte una frase o palabra: ");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        String palabraInvertida = "";
        
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida = palabraInvertida + palabra.charAt(i);
        }
        
        String palabraC = palabra.toLowerCase();
        String palabraInvertidaC = palabraInvertida.toLowerCase();
        
        if (palabraC.equals(palabraInvertidaC)) {
            System.out.println("\n" + palabra + " sí es un palíndromo\n");
        } else {
            System.out.println("\n" + palabra + " no es un palíndromo\n");
        }
        // sc.close(); // No cerrar el scanner 
    }
}