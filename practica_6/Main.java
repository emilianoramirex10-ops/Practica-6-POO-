import java.util.Scanner;
import practica_1.MenuCalculadora;

import practica_2.BuscadorMultiplos;
import practica_2.Fusion;
import practica_2.Separacion;

import practica_3.*;
import practica_4.*;
import practica_5.*;

public class Main {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== Catálogo de prácticas ===");
            System.out.println("1. Práctica 1");
            System.out.println("2. Práctica 2");
            System.out.println("3. Práctica 3");
            System.out.println("4. Práctica 4");
            System.out.println("5. Práctica 5");
            System.out.println("6. Salir");
            System.out.print("Seleccione una práctica (1-6): ");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando práctica 1...");
                    MenuCalculadora.main(args);
                    
                    break;
                case 2:{
                    System.out.println("Ejecutando práctica 2...");
                    int op2;
                     do {
                        System.out.println("\nPráctica 2");
                        System.out.println("1. BuscadorMultiplos");
                        System.out.println("2. Fusion");
                        System.out.println("3. Separacion");
                        System.out.println("4. Regresar");
                        System.out.print("Seleccione un programa (1-4): ");
                        op2 = scanner.nextInt();

                        switch (op2) {
                            case 1:
                                BuscadorMultiplos.main(args);
                                break;
                            case 2:
                                Fusion.main(args);
                                break;
                            case 3:
                                Separacion.main(args);
                                break;
                            case 4:
                                System.out.println("Regresando al catálogo...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    } while (op2 != 4);
                    break;
                }
                case 3:
                    System.out.println("Ejecutando práctica 3...");
                    break;
                case 4:
                    System.out.println("Ejecutando práctica 4...");
                    break;
                case 5:
                    System.out.println("Ejecutando práctica 5...");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}
