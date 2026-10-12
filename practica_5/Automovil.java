package practica_5;

public class Automovil {
    private String modelo;
    private int velocidadActual;


   
    public String getModelo() {
        return modelo;
    }


 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getVelocidadActual() {
        return velocidadActual;
    }


   
    public void setVelocidadActual(int velocidadActual) {
        if (velocidadActual < 0) {
            System.out.println("La velocidad no puede ser negativa");
            this.velocidadActual = 0;
        } else if (velocidadActual > 220) {
            System.out.println("Excede el límite de velocidad (220 km/h).");
            this.velocidadActual = 220;
        } else {
            this.velocidadActual = velocidadActual;
        }
    }


 
    public void acelerar(int incremento) {
        if (incremento > 0) {
            setVelocidadActual(this.velocidadActual + incremento);
        }
    }


    public void frenar(int decremento) {
        if (decremento > 0) {
            setVelocidadActual(this.velocidadActual - decremento);
        }
    }


    public String toString() {
       return "Automovil [modelo=" + modelo + ", velocidadActual=" + velocidadActual + " km/h]";
    }
}
