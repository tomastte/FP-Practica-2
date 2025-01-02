import java.util.Scanner;

public class Sesion3 {

    // Apartado 5
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean flag = true;
        int num;
        do {
            switch (menu()) {
                case 1:
                    System.out.print("Introduduzca un numero comprendido entre 0 y 1000: ");
                    num = myScanner.nextInt();
                    if (esPrimo(leerNumero(0, 1000, num))) System.out.println("El numero " + num + " es primo");
                    else System.out.println("El numero " + num + " no es primo");
                    break;
                case 2:
                    System.out.print("Introduzca un numero comprendido entre el 1 y el 20 ");
                    num = myScanner.nextInt();
                    escribePrimos(leerNumero(1, 20, num));
                    break;
                case 3:
                    System.out.println("Ha elegido la opcion 3");
                    break;
                case 4:
                    System.out.println("Ha elegido la opcion 4");
                    break;
                case 5:
                    System.out.println("Ha elegido la opcion 5");
                    break;
                case 6:
                    System.out.println("Ha elegido la opcion 6");
                    break;
                case 0:
                    flag = false;
                    System.out.println("Adios");
                    break;
            }
        } while (flag);
    }

    // Apartado 1
    public static int menu() {
        System.out.println("\n\tOPCIONES:");
        System.out.println("1. Comprobar si un núemro es primo");
        System.out.println("2. Escribir los n primeros primos");
        System.out.println("3. Escribir numeros primos gemelos entre dos valores");
        System.out.println("4. Numero par como suma de dos primos");
        System.out.println("5. Comprobar si un numero es primo de manera recursiva");
        System.out.println("6. Calcular potencia");
        System.out.println("0. Finalizar la ejecucion\n");

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Introduzca un numero comprendido entre 0 y 6: ");
        return myScanner.nextInt();
    }

    // Apartado 2
    public static int leerNumero(int n1, int n2, int n) {
        Scanner myScanner = new Scanner(System.in);
        while (n < n1 || n > n2) {
            System.out.print("Introduzca un numero comprendido entre " + n1 + " y " + n2 + ": ");
            n = myScanner.nextInt();
        }
        return n;
    }

    // Apartado 3
    public static boolean esPrimo(int n) {
        boolean primo = true;
        int divisor = 2;
        while (divisor < n) {
            if (n % divisor == 0) {
                divisor = n++;
                primo = false;
            } else divisor++;
        }
        return primo;
    }

    // Apartado 4
    public static void escribePrimos(int num) {
        int contador = 0, numPrimo = 2;
        while (contador < num) {
            if (esPrimo(numPrimo)) {
                System.out.printf("%8d", numPrimo);
                contador++;
                if (contador % 4 == 0) System.out.println(); // Cada 4 numeros hace un salto de linea
            }
            numPrimo++;
        }
    }
}