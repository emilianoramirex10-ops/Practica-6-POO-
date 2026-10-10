package practica_2;

package fusion;
import java.util.Scanner;
import Areas.FigurasGeometricas;
import Multiplo.BuscadorMultiplos;
 public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;
        do {
            System.out.println("\n----- MENÚ PRINCIPAL -----");
            System.out.println("1.-Calcular múltiplos de 3");
            System.out.println("2.-Calcular área de figuras geométricas");
            System.out.println("3.-Salir");
            System.out.print("Seleccione una opción: ");
            opcionPrincipal = sc.nextInt();
  switch (opcionPrincipal) {
    case 1:
        ejecutarMultiplos(sc);
        break;
    case 2:
        ejecutarFiguras(sc);
        break;
    case 3:
        System.out.println("Hasta luego");
        break;
    default:
        System.out.println("Opción no válida");
break; }

      } while (opcionPrincipal != 3);
    sc.close();
}
public static void ejecutarMultiplos(Scanner sc) {
    System.out.println("Por favor introduzca un número entero:");
    int n1 = sc.nextInt();
    System.out.println("Introduzca otro número entero:");
    int n2 = sc.nextInt();
     BuscadorMultiplos buscador = new BuscadorMultiplos(n1, n2);
    buscador.imprimirMultiplos();
}
public static void ejecutarFiguras(Scanner sc) {
    FigurasGeometricas calculadora = new FigurasGeometricas();
    int opcion;
    do {
        System.out.println("\n----- MENÚ DE FIGURAS GEOMÉTRICAS -----");
        System.out.println("1.-Area de círculo");
        System.out.println("2.-Area de triángulo");
        System.out.println("3.-Area de cuadrado");
        System.out.println("4.-Salir");

 System.out.print("Seleccione una opción: ");
opcion = sc.nextInt();
float area;
switch (opcion) {
    case 1:
        System.out.println("Seleccionó el círculo");
        System.out.println("Introduzca el radio:");
        float radio = sc.nextFloat();
        area = calculadora.calcularAreaCirculo(radio);
        System.out.println("El area es: " + area);
     break;
case 2:
    System.out.println("Seleccionó el triángulo");
    System.out.println("Introduzca la base:");
    float base = sc.nextFloat();
    System.out.println("Introduzca la altura:");
    float altura = sc.nextFloat();
    area = calculadora.calcularAreaTriangulo(base, altura);
    System.out.println("El area es: " + area);
    break;
case 3:
    System.out.println("Seleccionó el cuadrado");
    System.out.println("Introduzca el lado:");
    float lado = sc.nextFloat();
    area = calculadora.calcularAreaCuadrado(lado);
 
System.out.println("El area es: " + area);
break;
            case 4:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Su elección no es correcta");
break; }
    } while (opcion != 4);
}
}