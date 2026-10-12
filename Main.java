import java.util.Scanner;
import practica_1.MenuCalculadora;
import practica_2.BuscadorMultiplos;
import practica_2.Fusion;
import practica_2.Separacion;

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
                case 1: {
                    System.out.println("Ejecutando práctica 1...");
                    MenuCalculadora.main(args);
                    break;
                }
                case 2: {
                    System.out.println("Ejecutando práctica 2...");
                    int op2;
                    do {
                        System.out.println("\nPráctica 2");
                        System.out.println("1. Buscador de Múltiplos");
                        System.out.println("2. Fusion (Menú P2)");
                        System.out.println("3. Separacion");
                        System.out.println("4. Regresar");
                        System.out.print("Seleccione un programa (1-4): ");
                        op2 = scanner.nextInt();

                        switch (op2) {
                            case 1:
                                System.out.println("Introduzca el primer número entero:");
                                int n1 = scanner.nextInt();
                                System.out.println("Introduzca el segundo número entero:");
                                int n2 = scanner.nextInt();
                                BuscadorMultiplos buscador = new BuscadorMultiplos(n1, n2);
                                buscador.imprimirMultiplos();
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
                    int op3;
                    do {
                        System.out.println("\nPráctica 3");
                        System.out.println("1. Cadenas");
                        System.out.println("2. DatosCurp");
                        System.out.println("3. Ejemplo");
                        System.out.println("4. Palindromo");
                        System.out.println("5. RFC");
                        System.out.println("6. Regresar");
                        System.out.print("Seleccione un programa (1-6): ");
                        op3 = scanner.nextInt();
                        
                        switch (op3) {
                                break;
                            case 3:
                                System.out.println("Nota: Asegurese de que Ejemplo tenga un metodo main o ejecutelo individualmente.");
                                break;
                            case 4:
                                System.out.println("Nota: Asegurese de que Palindromo tenga un metodo main o ejecutelo individualmente.");
                                break;
                            case 5:
                                System.out.println("Nota: Asegurese de que RFC tenga un metodo main o ejecutelo individualmente.");
                                break;
                            case 6:
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (op3 != 6);
                    break;
                }
                case 4: {
                    System.out.println("Ejecutando práctica 4...");
                    int op4;
                    do {
                        System.out.println("\nPráctica 4");
                        System.out.println("1. ContadorLetras");
                        System.out.println("2. SobrecargaCadenas");
                        System.out.println("3. Regresar");
                        System.out.print("Seleccione un programa (1-3): ");
                        op4 = scanner.nextInt();

                        switch (op4) {
                            case 1:
                                System.out.println("Nota: Asegurese de agregar el metodo main en ContadorLetras.");
                                break;
                            case 2:
                                System.out.println("Nota: Asegurese de agregar el metodo main en SobrecargaCadenas.");
                                break;
                            case 3:
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (op4 != 3);
                    break;
                }
                case 5: {
                    System.out.println("Ejecutando práctica 5...");
                    int op5;
                    do {
                        System.out.println("\nPráctica 5");
                        System.out.println("1. PruebaAutomovil");
                        System.out.println("2. MainComposicion");
                        System.out.println("3. Regresar");
                        System.out.print("Seleccione un programa (1-3): ");
                        op5 = scanner.nextInt();

                        switch (op5) {
                            case 1:
                                System.out.println("Nota: Asegurese de agregar el metodo main en PruebaAutomovil.");
                                break;
                            case 2:
                                System.out.println("Nota: Asegurese de agregar el metodo main en MainComposicion.");
                                break;
                            case 3:
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                        }
                    } while (op5 != 3);
                    break;
                }
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}