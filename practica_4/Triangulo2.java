package practica_4;

public class Triangulo2 {
    float base, altura;
    public float area() {
        return (float) ((this.base * this.altura) / 2.0);
}
      public float area(float base, float altura) {
        return (float) ((base * altura) / 2.0);
}
    public float area(int base, int altura) {
        return (float) ((base * altura) / 2.0);
} }
PruebaTriangulo2.java
 import java.util.Scanner;
public class PruebaTriangulo2 {
    public static void main(String[] args) {
        Triangulo2 triangulo = new Triangulo2();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===SOBRECARGA DE MÉTODOS===");
        System.out.println("\n===Calculo del area de un triangulo===");
System.out.print("\nIngrese la base del triangulo: ");

  ");
float base = sc.nextFloat();
System.out.print("\nIngrese la altura del triangulo: ");
float altura = sc.nextFloat();
System.out.println("\n===Base y Altura Ingresados===");
triangulo.base = base;
triangulo.altura = altura;
System.out.println("\nbase: " + triangulo.base);
System.out.println("\naltura: " + triangulo.altura);
System.out.println("\n===Método 'area' sobrecargado===");
System.out.println("\nArea calculada con los datos ingresados (base y altura):
System.out.println("\narea() -> " + triangulo.area());
System.out.println("\nArea calculada con dos enteros propuestos:");
System.out.println("\narea(6 , 2) -> " + triangulo.area(6, 2));
System.out.println("\nArea calculada con dos flotantes propuestos:");
System.out.println("\narea(5.5f , 3.2f) -> " + triangulo.area(5.5f, 3.2f));

sc.close();
    }
}