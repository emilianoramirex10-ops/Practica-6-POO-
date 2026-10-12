package practica_1;

import java.util.Scanner;
public class MenuCalculadora{
    public static void main(String[] args) {
int i;
        System.out.println("\n===Ingrese dos valores con los que desee operar===\n");
        Scanner sc = new Scanner(System.in);
System.out.print("Valor 1: ");
  double valor1 = sc.nextDouble();
 System.out.print("Valor 2: ");
double valor2 = sc.nextDouble();
System.out.println("\n===Menú de operaciones===\n");
System.out.println("¿Qué operación desea realizar?\n");
System.out.println("(1) Suma\n");
System.out.println("(2) Resta\n");
System.out.println("(3) Multiplicación\n");
System.out.println("(4) Potencia\n");
System.out.println("(5) División\n");
System.out.print("Ingrese el número de operación: ");
int opcion = sc.nextInt();
switch (opcion) {
case 1:
        System.out.println("\n===Suma===\n");
        System.out.println("Valor 1 + Valor 2 = "+ (long)(valor1+valor2)+"\n");

 break;
 case 2:
    System.out.println("\n===Resta===\n");
    System.out.println("Selecciona cómo quieres restar los valores\n");
    System.out.println("(1) Valor 1 - Valor 2");
    System.out.println("(2) Valor 2 - Valor 1\n");
    System.out.print("Ingresa el número de opción: ");
    int opcion1=sc.nextInt();
    if (opcion1==1){
        System.out.println("\nValor 1 - Valor 2 = "+(long)(valor1-valor2)+"\n");
    }else if (opcion1 ==2){
        System.out.println("\nValor 2 - Valor 1 = "+(long)(valor2-valor1)+"\n");
    }else{
        System.out.println("\nIngresa una opción válida: (1) o (2)\n");
}
break;
case 3:
    System.out.println("\n===Multiplicación===\n");
    System.out.println("Valor 1 * Valor 2 = "+(long)(valor1*valor2)+"\n");
break;

 case 4:
 System.out.println("\n===Potencia===\n");
System.out.println("Selecciona cómo quieres aplicar la potencia\n");
System.out.println("(1) (Valor 1)^(Valor 2)");
System.out.println("(2) (Valor 2)^(Valor 1)\n");
System.out.print("Ingresa el número de opción: ");
int opcion2=sc.nextInt();
if (opcion2==1){
    long aux=(long)valor1;
    long valor1P=1;
    for (i=0;i<valor2;i++){
        valor1P*=aux;
}
    System.out.println("\n(Valor 1)^(Valor 2) ="+(valor1P)+"\n");
}else if (opcion2 ==2){
    long aux1=(long)valor2;
    long valor2P=1;
    for (i=0;i<valor1;i++){
        valor2P*=aux1;
}

         System.out.println("\n(Valor 2)^(Valor 1) ="+(valor2P)+"\n");
    }else{
        System.out.println("\nIngresa una opción válida: (1) o (2)\n");
    }
break;
case 5:
    System.out.println("\n===División===\n");
    System.out.println("Selecciona cómo quieres aplicar la división\n");
    System.out.println("(1) Valor1/Valor2");
    System.out.println("(2) Valor2/Valor1\n");
    System.out.print("Ingresa el número de opción: ");
    int opcion3=sc.nextInt();
    if (opcion3==1){
        System.out.println("\nValor 1/Valor 2 = "+String.format("%.4f",valor1/valor2)+"\n");
    }else if (opcion3 ==2){
        System.out.println("\nValor 2/Valor 1 = "+String.format("%.4f",valor2/valor1)+"\n");
    }else{
        System.out.println("\nIngresa una opción válida: (1) o (2)\n");
}
break;
 default:

System.out.println("\n===Opcion invalida===\n");
}
    }
}
