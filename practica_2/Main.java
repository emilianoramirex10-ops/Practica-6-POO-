package practica_2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float area;
        int opcion;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Elige la opción");
            System.out.println("1.-Area de círculo");
            System.out.println("2.-Area de triángulo");
            System.out.println("3.-Area de cuadrado");
            System.out.println("4.-Salir");
            opcion = sc.nextInt();
            FigurasGeometricas figura = new FigurasGeometricas();
            switch (opcion) {
                case 1:
                    System.out.println("Seleccionó el circulo");
                    float radio = sc.nextFloat();
                    area = figura.calcularAreaCirculo(radio);
                    break;
                case 2:
                    System.out.println("Seleccionó el triángulo");
                    float base = sc.nextFloat();
                    float altura = sc.nextFloat();
                    area = figura.calcularAreaTriangulo(base, altura);
                    break;
                case 3:
                    System.out.println("Seleccionó el cuadrado");
                    float lado = sc.nextFloat();
                    area = figura.calcularAreaCuadrado(lado);
                    break;
                case 4:
                    System.out.println("Adios");
                    continue;
                default:
                    System.out.println("Su elección no es correcta");
                    continue;
}
            System.out.println("El area es: " + area);
        } while (opcion != 4);
        sc.close();
} }