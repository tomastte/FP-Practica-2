import java.util.Scanner;

public class Sesion2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Apartado 1
        System.out.print("1. Introduduzca un numero comprendido entre 0 y 1000: ");
        int num = myScanner.nextInt();

        if (num >= 0 && num <= 1000) {
            if (num == 1) {
                System.out.println("El numero " + num + " no es primo");
            } else if (num == 2) {
                System.out.println("El numero " + num + " es primo");
            } else {
                boolean primo = true;
                int divisor = 2;

                while (divisor < num) {
                    if ((num % divisor) == 0) {
                        System.out.println("El numero " + num + " no es primo");
                        divisor = num++;
                        primo = false;
                    } else {
                        divisor++;
                    }
                }
                if (primo) {
                    System.out.println("PRIMO");
                } else {
                    System.out.println("NO ES PRIMO");
                }
            }
        } else if (num > 1000) {
            System.out.println("El numero " + num + " es mayor que 1000");
        } else {
            System.out.println("El numero " + num + " es menor que 0");
        }

        //Apartado 2
        System.out.print("2. Introduduzca un numero comprendido entre 5 y 20: ");
        int num1 = myScanner.nextInt();

        if (5 <= num1 && num1 <= 20) {

            //Si es primo imprime por pantalla los números con un formato
            if (esPrimoFuncion(num1)) {
                System.out.println("El numero " + num1 + " es primo.");
                System.out.print("Cuantos numeros primos desea escribir ");
                int numerospParaEscribir = myScanner.nextInt();

                int contador=0, dos=2;

                while (contador < numerospParaEscribir) {
                    if (esPrimoFuncion(dos)) {
                        System.out.printf("%8d", dos);
                        contador++;
                        //Cada 4 lineas hace un salto de linea
                        if (contador % 4 == 0) {
                            System.out.println();
                        }
                    }
                    dos++;
                }
                if (contador % 4 != 0) System.out.println();

            } else System.out.println("El numero " + num1 + " no es primo.");

        } else if (num1 < 5) {
            System.out.println("El numero es menor que 5");
        } else {
            System.out.println("El numero es mayor que 20");
        }
    }


    public static boolean esPrimoFuncion(int num1) {
        boolean primo = true;
        int divisor = 2;
        while (divisor < num1) {
            if ((num1 % divisor) == 0) {
                divisor = num1++;
                primo = false;
            } else divisor++;
        }
        return primo;
    }
}