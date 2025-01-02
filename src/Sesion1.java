import java.util.Scanner;

public class Sesion1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //Apartado 1
        System.out.println("\n\tOPCIONES:");
        System.out.println("1. Comprobar si un núemro es primo");
        System.out.println("2. Escribir los n primeros primos");
        System.out.println("3. Escribir numeros primos gemelos entre dos valores");
        System.out.println("4. Numero par como suma de dos primos");
        System.out.println("0. Finalizar la ejecución\n\n");

        //Apartado 2
        System.out.print("Introduzca la opción deseada: ");
        int option = myScanner.nextInt();

        if (option >= 0 && option < 5) {
            switch (option) {
                case 1:
                    System.out.println("Ha elegido la opcion 1");
                    break;
                case 2:
                    System.out.println("Ha elegido la opcion 2");
                    break;
                case 3:
                    System.out.println("Ha elegido la opcion 3");
                    break;
                case 4:
                    System.out.println("Ha elegido la opcion 4");
                    break;
                default:
                    System.out.println("Ha elegido la opcion 0");
                    break;
            }
        } else {
            System.out.println("La opcion: " + option + " es incorrecta");
        }
        System.out.println();

        //Apartado 3
        System.out.print("Introduzca un número comprendido entre 0 y 1000: ");
        int num = myScanner.nextInt();

        if (num > 0 && num < 1000) {
            System.out.println("El numero " + num + " es correcto");
        } else if (num < 0) {
            System.out.println("El numero " + num + " es menor que 1000");
        } else {
            System.out.println("El numero " + num + " es mayor que 1000");
        }
        System.out.println();

        //Apartado 4
        System.out.print("Introduzca el primer numero ");
        int num1 = myScanner.nextInt();
        System.out.print("Introduzca el segundo numero ");
        int num2 = myScanner.nextInt();

        if (num1 <= num2) {
            System.out.println("El numero " + num1 + " es menor o igual que el numero " + num2);
        } else {
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        }

        if (num2 % num1 == 0) {
            System.out.println("El numero " + num2 + " es divisble entre el numero " + num1);
        } else {
            System.out.println("El numero " + num2 + " no es divisble entre el numero " + num1);
        }
        System.out.println();
    }
}