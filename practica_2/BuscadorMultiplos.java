package practica_2;

public class BuscadorMultiplos {
    private int n1;
    private int n2;

    // Constructor que recibe los dos números del intervalo
    public BuscadorMultiplos(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // Método que calcula e imprime los múltiplos de 3 positivos
    public void imprimirMultiplos() {
        int menor = Math.min(n1, n2);
        int mayor = Math.max(n1, n2);

        System.out.println("Múltiplos positivos de 3 en el rango:");
        boolean encontrado = false;
        
        for (int numero = menor; numero <= mayor; numero++) {
            if (numero > 0 && numero % 3 == 0) {
                System.out.print(numero + "\t");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.print("No se encontraron múltiplos de 3 en este rango.");
        }
        System.out.println();
    }
}