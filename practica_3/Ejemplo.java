package practica_3;

public class Ejemplo {
    public void ejecutar(String[] args) { 
        if (args != null && args.length >= 3) {
            System.out.println(args[0]); 
            System.out.println(args[1]); 
            System.out.println(args[2]);
        } else {
            System.out.println("Se requieren al menos 3 argumentos para ejecutar Ejemplo.");
        }
    } 
}