package practica_4;

import java.util.Scanner;

public class SobrecargaCadenas {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe una frase: ");
        String frase = sc.nextLine();
        
        ContadorLetras contador = new ContadorLetras(frase);

        if (contador.buscarMaximo() == 0) {
            System.out.println("La frase no tiene letras.");
            return;
        }
        contador.mostrarResultado();
        
        // sc.close(); // No cerrar el scanner
    }
}