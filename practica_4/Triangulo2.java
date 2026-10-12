package practica_4;

public class Triangulo2 {
    public float base, altura; // Se agregaron como public
    
    public float area() {
        return (float) ((this.base * this.altura) / 2.0);
    }
    
    public float area(float base, float altura) {
        return (float) ((base * altura) / 2.0);
    }
    
    public float area(int base, int altura) {
        return (float) ((base * altura) / 2.0);
    } 
}