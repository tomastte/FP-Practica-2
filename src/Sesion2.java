import java.util.Scanner;

public class Sesion2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // Apartado 1
        System.out.print("1. Introduduzca un numero comprendido entre 0 y 1000: ");
        int num = myScanner.nextInt();

        if (num >= 0 && num <= 1000) {
            boolean primo = true;
            int divisor = 2;
            while (divisor < num && primo) {
                if ((num % divisor) == 0) {
                    primo = false;
                } else divisor++;
            }
            if (primo) {
                System.out.println("El numero " + num + " es primo");
            } else {
                System.out.println("El numero " + num + " no es primo");
            }
        } else if (num > 1000) System.out.println("El numero " + num + " es mayor que 1000");
        else System.out.println("El numero " + num + " es menor que 0");


        // Apartado 2
        System.out.print("2. Cuantos numeros primos desea escribir? ");
        int numMax = myScanner.nextInt();

        if (5 <= numMax && numMax <= 20) {
            int contador = 0, numPrimo = 2;

            // Formato de representacion de los numeros primos
            while (contador < numMax) {
                boolean primo = true;
                int divisor = 2;
                while (divisor < numPrimo && primo) {
                    if ((numPrimo % divisor) == 0) {
                        primo = false;
                    } else divisor++;
                }

                if (primo) {
                    System.out.printf("%8d", numPrimo);
                    contador++;
                    if (contador % 4 == 0) System.out.println(); // Cada 4 numeros hace un salto de linea
                }
                numPrimo++;
            }
        } else if (numMax < 5) System.out.println("El numero " + numMax + " es menor que 5");
        else System.out.println("El numero " + numMax + " es mayor que 20");
    }
}