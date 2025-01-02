import java.util.Scanner;

public class Sesion4 {
    public static void main(String[] args) {

        // Apartado 6
        Scanner myScanner = new Scanner(System.in);
        boolean flag = true;
        int n, n1;
        do {
            switch (Sesion3.menu()) {
                case 1:
                    System.out.print("Introduduzca un numero comprendido entre 0 y 1000: ");
                    n = myScanner.nextInt();
                    if (Sesion3.esPrimo(Sesion3.leerNumero(1, 1000, n))) {
                        System.out.println("El numero " + n + " es primo");
                    } else System.out.println("El numero " + n + " no es primo");
                    break;
                case 2:
                    System.out.print("Introduzca un numero comprendido entre el 1 y el 20 ");
                    n = myScanner.nextInt();
                    Sesion3.escribePrimos(Sesion3.leerNumero(1, 20, n));
                    break;
                case 3:
                    System.out.print("Introduzca un numero comprendido entre 1 y 500 ");
                    n = myScanner.nextInt();
                    System.out.print("Introduzca un numero comprendido entre " + (n + 1) + " y 500 ");
                    n1 = myScanner.nextInt();
                    primosGemelos(Sesion3.leerNumero(1, 500, n), Sesion3.leerNumero((n + 1), 500, n1));
                    break;
                case 4:
                    System.out.print("Introduzca un numero par comprendido entre 4 y 500 ");
                    int numeroPar = myScanner.nextInt();
                    while (numeroPar % 2 != 0) {
                        System.out.println("El numero debe ser par");
                        System.out.print("Introduzca un numero par comprendido entre 4 y 500 ");
                        numeroPar = myScanner.nextInt();
                    }
                    mostrarSumasDePrimos(Sesion3.leerNumero(4, 500, numeroPar));
                    break;
                case 5:
                    System.out.print("Introduzca un numero comprendido entre 1 y 1000 ");
                    int entero = myScanner.nextInt();
                    if (esPrimoRecursivo(Sesion3.leerNumero(1, 1000, entero), 2)) {
                        System.out.println("El numero " + entero + " es primo");
                    } else System.out.println("El numero " + entero + " no es primo");
                    break;
                case 6:
                    System.out.print("Introduzca un numero comprendido entre -100 y 100 ");
                    int base = myScanner.nextInt();
                    System.out.print("Introduzca un numero comprendido entre 0 y 10 ");
                    int exponente = myScanner.nextInt();
                    System.out.println(Sesion3.leerNumero(-100, 100, base) + " elevado a " + Sesion3.leerNumero(0, 10, exponente) + " es " + potencia(base, exponente));
                    break;
                case 0:
                    flag = false;
                    System.out.println("Adios");
                    break;
            }
        } while (flag);
    }

    // Apartado 1
    public static void primosGemelos(int n, int n1) {
        int contador = 1;
        int primo = n, primo2 = primo + 2;
        while (primo >= n && primo2 <= n1) {
            if (Sesion3.esPrimo(primo) && Sesion3.esPrimo(primo2)) {
                System.out.printf(contador + ". %5d %5d\n", primo, primo2);
                contador++;
            }
            primo++;
            primo2 = primo + 2;
        }
    }

    // Apartado 2
    public static void mostrarSumasDePrimos(int par) {
        int contador = 0;
        for (int i = 2; i <= par / 2; i++) {
            int j = par - i;
            if (Sesion3.esPrimo(i) && Sesion3.esPrimo(j)) {
                contador++;
                System.out.printf("%d.%6d+%d=%d\n", contador, i, j, par);
            }
        }
    }

    // Apartado 3
    public static boolean esPrimoRecursivo(int entero, int divisor) {
        if (entero == 1 || entero % divisor == 0) return false;
        if (divisor * divisor > entero) return true;
        return esPrimoRecursivo(entero, divisor + 1);
    }

    // Apartado 4
    public static double potencia(int base, int exponente) {
        double n = 0.0;
        if (exponente != 0) n = base * potencia(base, exponente - 1);
        return n;
    }
}