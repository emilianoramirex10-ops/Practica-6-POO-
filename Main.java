import java.util.Scanner;
import practica_1.MenuCalculadora;

import practica_2.BuscadorMultiplos;
import practica_2.Fusion;
import practica_2.Separacion;
import practica_2.SumaPares;
import practica_3.Cadenas;
import practica_3.DatosCurp;
import practica_3.Ejemplo;
import practica_3.Palindromo;
import practica_3.RFC;

import practica_4.ContadorLetras;
import practica_4.SobrecargaCadenas;

import practica_5.Automovil;
import practica_5.CarreraUniversitaria;
import practica_5.MainComposicion;
import practica_5.Materia;
import practica_5.PruebaAutomovil;

public class Main {

    public static void main(String[] args) {
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
                case 2: {
                    System.out.println("Ejecutando práctica 2...");
                    int op2;
                    do {
                        System.out.println("\nPráctica 2");
                        System.out.println("1. SumaPares");
                        System.out.println("2. Fusion");
                        System.out.println("3. Separacion");
                        System.out.println("4. Regresar");
                        System.out.print("Seleccione un programa (1-4): ");
                        op2 = scanner.nextInt();

                        switch (op2) {
                            case 1:
                                SumaPares.main(args);
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
                case 3: {
                    System.out.println("Ejecutando práctica 3...");
                    int op2;
                    do {
                        System.out.println("\nPráctica 3");
                        System.out.println("1. Cadenas");
                        System.out.println("2. DatosCurp");
                        System.out.println("3. Ejemplo");
                        System.out.println("4. Palindromo");
                        System.out.println("5. RFC");
                        System.out.println("6. Regresar");
                        System.out.print("Seleccione un programa (1-6): ");
                        op2 = scanner.nextInt();

                        switch (op2) {
                            case 1:
                                new Cadenas().ejecutar();
                                break;
                            case 2:
                                new DatosCurp().ejecutar();
                                break;
                            case 3:
                                new Ejemplo().ejecutar(args);
                                break;
                            case 4:
                                new Palindromo().ejecutar();
                                break;
                            case 5:
                                new RFC().ejecutar();
                            case 6:
                                System.out.println("Regresando al catálogo...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    } while (op2 != 6);
                    break;
                }
                case 4: {
                    System.out.println("Ejecutando práctica 4...");
                    int op2;
                    do {
                        System.out.println("\nPráctica 4");
                        System.out.println("1. SobrecargaCadenas");
                        System.out.println("2. Regresar");
                        System.out.print("Seleccione un programa (1-2): ");
                        op2 = scanner.nextInt();

                        switch (op2) {
                            case 1:
                                new SobrecargaCadenas().ejecutar();
                                break;
                            case 2:
                                System.out.println("Regresando al catálogo...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    } while (op2 != 2);
                    break;
                }
                case 5: {
                    System.out.println("Ejecutando práctica 5...");
                    int op2;
                    do {
                        System.out.println("\nPráctica 5");
                        System.out.println("1. Automovil");
                        System.out.println("2. CarreraUniversitaria");
                        System.out.println("3. Regresar");
                        System.out.print("Seleccione un programa (1-3): ");
                        op2 = scanner.nextInt();

                        switch (op2) {
                            case 1:
                                new PruebaAutomovil().ejecutar();
                                break;
                            case 2:
                                new MainComposicion().ejecutar();
                                break;
                            case 3:
                                System.out.println("Regresando al catálogo...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    } while (op2 != 3);
                }
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}
