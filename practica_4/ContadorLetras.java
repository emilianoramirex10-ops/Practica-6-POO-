package practica_4;

public class ContadorLetras { // Se hace publica la clase
    private String frase;
    private int[] conteo;
    
    public ContadorLetras(String frase) {
        this.frase = frase;
        this.conteo = new int[65536];
        contarLetras();
    }
    
    private void contarLetras() {
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                conteo[c]++;
            }
        } 
    }
    
    public int buscarMaximo() {
        int maximo = 0;
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > maximo) {
                maximo = conteo[i];
            } 
        }
        return maximo;
    }
    
    public int contarGanadoras(int maximo) {
        int cantidad = 0;
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] == maximo) {
                cantidad++;
            } 
        }
        return cantidad;
    }
    
    public void mostrarResultado() {
        int maximo = buscarMaximo();
        int ganadoras = contarGanadoras(maximo);
        mostrarResultado(maximo, ganadoras);
    }
    
    public void mostrarResultado(int maximo, int ganadoras) {
        System.out.println();
        if (ganadoras == 1) {
            System.out.println("La letra que más aparece es:");
            for (int i = 0; i < conteo.length; i++) {
                if (conteo[i] == maximo) {
                    System.out.println("  Letra: " + (char) i);
                    System.out.println("  Veces: " + maximo);
                } 
            }
        } else {
            System.out.println("Hay empate entre las letras:");
            for (int i = 0; i < conteo.length; i++) {
                if (conteo[i] == maximo) {
                    System.out.println("  Letra: " + (char) i + " | Veces: " + maximo);
                } 
            }
        } 
    }
}