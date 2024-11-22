import java.util.Scanner;

public class Sesion3 {
    public static void main(String[] args) {
        //Flujo del programa
        Scanner myScanner = new Scanner(System.in);

        boolean flag=true;
        while(flag) {
            switch (leerNumero(0, 6, menu())) {
                case 1:
                    System.out.print("Introduduzca un numero comprendido entre 0 y 1000: ");
                    int num = myScanner.nextInt();

                    if (esPrimo(num)) System.out.println("El numero " + num + " es primo");
                    else System.out.println("El numero " + num + " no es primo");
                    break;
                case 2:
                    System.out.print("Introduzca un numero comprendido entre el 1 y el 20 ");
                    int n=myScanner.nextInt();
                    escribePrimos(leerNumero(1,20, n));
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
                    flag=false;
                    System.out.println("Adios");
                    break;
            }
        }
    }

    public static int menu (){
        //Apartado 1
        System.out.println("\n\tOPCIONES:");
        System.out.println("1. Comprobar si un núemro es primo");
        System.out.println("2. Escribir los n primeros primos");
        System.out.println("3. Escribir numeros primos gemelos entre dos valores");
        System.out.println("4. Numero par como suma de dos primos");
        System.out.println("5. Comprobar si un numero es primo de manera recursiva");
        System.out.println("6. Calcular potencia");
        System.out.println("0. Finalizar la ejecucion\n\n");

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Introduzca un numero comprendido entre 0 y 6: ");
        return myScanner.nextInt();
    }

    public static int leerNumero(int n1, int n2, int n){
        //Validamos el rango que es necesario
        if (n<=n2 && n>=n1) return n;
        else {
            Scanner myScanner = new Scanner(System.in);
            while (!(n <= n2 && n >= n1)) {
                System.out.print("Introduzca un numero comprendido entre " + n1 + " y " + n2 + ": ");
                n = myScanner.nextInt();
            } return n;
        }
    }

    public static boolean esPrimo(int num){
        leerNumero(0,1000,num);

        //Validamos si es primo o no
        boolean primo = true;
        if (num == 0 || num == 1){
            primo=false;
            return primo;
        } else {
            int divisor = 2;
            while (divisor < num) {
                if ((num % divisor) == 0) {
                    divisor = num++;
                    primo = false;
                } else divisor++;
            }

            //Validacion de la condicion de si es primo o no
            if (primo) {
                return primo;
            } else {
                return primo;
            }
        }
    }

    public static void escribePrimos(int n){
        int contador=0, dos=2;

        while (contador < n) {
            if (esPrimo(dos)) {
                System.out.printf("%8d", dos);
                contador++;
                //Cada 4 lineas hace un salto de linea
                if (contador % 4 == 0) {
                    System.out.println();
                }
            }
            dos++;
        }
        if (contador % 4 != 0) {
            System.out.println();
        }
    }
}

