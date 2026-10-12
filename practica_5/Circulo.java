package practica_5;

// Clase que representa un círculo mediante su radio.
public class Circulo {
    // Constante pública para que las clases de prueba puedan consultar el valor de pi.
    public static final float PI = 3.14159f;
    // Atributo privado que protege el radio mediante encapsulamiento.
    private float radio;


    // Devuelve el radio actual del círculo.
    public float getRadio() {
        // Retorna el valor almacenado en el atributo radio.
        return radio;
    }


    // Cambia el radio después de validarlo.
    public void setRadio(float radio) {
        // Un radio negativo no tiene sentido; se convierte a cero.
        if (radio < 0) {
            radio = 0;
        }
        // this.radio identifica el atributo del objeto actual.
        this.radio = radio;
    }


    // Calcula y devuelve el perímetro del círculo.
    public float perimetro() {
        // La fórmula es 2 por pi por radio.
        return 2 * PI * radio;
    }


    // Calcula y devuelve el área del círculo.
    public float area() {
        // La fórmula es pi por radio al cuadrado.
        return PI * radio * radio;
    }


    // Devuelve una representación textual del objeto.
    @Override
    public String toString() {
        // Incluye el nombre de la clase y el valor del radio.
        return "Circulo [radio=" + radio + "]";
    }
}
