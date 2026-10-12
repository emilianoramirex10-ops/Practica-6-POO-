package practica_5;

public class PruebaAutomovil {
    public static void main(String[] args) {
      
        Automovil auto = new Automovil();

        
        auto.setModelo("Chevrolet Cruz");

        
        auto.setVelocidadActual(80);
        System.out.println(auto.toString());

        
        System.out.println("\nIntento de asignar velocidad negativa");
        auto.setVelocidadActual(-40); 

       
        System.out.println("\nPruebas");
        auto.setVelocidadActual(100);
        System.out.println("Velocidad inicial: " + auto.getVelocidadActual() + " km/h");
        
        auto.acelerar(35);
        System.out.println("Después de acelerar: " + auto.getVelocidadActual() + " km/h");

        auto.frenar(50);
        System.out.println("Después de frenar: " + auto.getVelocidadActual() + " km/h");
    }
}