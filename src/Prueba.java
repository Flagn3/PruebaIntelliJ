import java.util.Scanner;


public class Prueba {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");
        Scanner sc=new Scanner(System.in);

        int suma=0;
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
            suma+=getSuma(i);
        }
        System.out.println("Suma: "+suma);
    }

    private static int getSuma(int numero) {
        int suma = 0;
        suma += numero;

        return suma;
    }
}




