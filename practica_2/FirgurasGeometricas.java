package practica_2;

public class FigurasGeometricas { private final float PI = 3.14159f;
public float calcularAreaCirculo(float radio) { return PI * (float) Math.pow(radio, 2);
}
public float calcularAreaTriangulo(float base, float altura) {
return (base * altura) / 2; }
public float calcularAreaCuadrado(float lado) { return (float) Math.pow(lado, 2);
} }