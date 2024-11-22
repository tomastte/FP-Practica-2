import java.util.Scanner;

public class Sesion4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            switch (Sesion3.leerNumero(0, 6, Sesion3.menu())) {
                case 1:
                    System.out.print("Introduduzca un numero comprendido entre 0 y 1000: ");
                    int num = myScanner.nextInt();
                    if (Sesion3.esPrimo(num)) System.out.println("El numero " + num + " es primo");
                    else System.out.println("El numero " + num + " no es primo");
                    break;
                case 2:
                    System.out.print("Introduzca un numero comprendido entre el 1 y el 20 ");
                    int n=myScanner.nextInt();
                    Sesion3.escribePrimos(Sesion3.leerNumero(1,20,n));
                    break;
                case 3:
                    System.out.print("Introduzca un número comprendido entre 1 y 500 ");
                    int n3 = myScanner.nextInt();
                    System.out.print("Introduzca un numero comprendido entre " + (n3 + 1) + " y 500 ");
                    int n4 = myScanner.nextInt();
                    primosGemelos(Sesion3.leerNumero(1, 500, n3), Sesion3.leerNumero((n3 + 1), 500, n4));
                    break;
                case 4:
                    System.out.print("Introduzca un número par comprendido entre 4 y 500 ");
                    int par = myScanner.nextInt();
                    if (par%2!=0){
                        while (par % 2 != 0){
                            System.out.println("El numero debe ser par");
                            System.out.print("Introduzca un número par comprendido entre 4 y 500 ");
                            par = myScanner.nextInt();
                        }
                        mostrarSumasDePrimos(Sesion3.leerNumero(4, 500, par));
                    } else mostrarSumasDePrimos(Sesion3.leerNumero(4, 500, par));
                    break;
                case 5:
                    System.out.print("Introduzca un numero comprendido entre 1 y 1000 ");
                    int entero=myScanner.nextInt();
                    int divisor=2;
                    if (esPrimoRecursivo(Sesion3.leerNumero(1,1000, entero), divisor)){
                        System.out.println("El numero " + entero + " es primo");
                    } else System.out.println("El numero " + entero + " no es primo");
                    break;
                case 6:
                    System.out.print("Introduzca un número comprendido entre -100 y 100 ");
                    int base = myScanner.nextInt();
                    System.out.print("Introduzca un número comprendido entre 0 y 10 ");
                    int exponente = myScanner.nextInt();
                    System.out.println(Sesion3.leerNumero(-100, 100, base) + " elevado a " + Sesion3.leerNumero(0, 10, exponente) + " es " + potencia(base, exponente));
                    break;
                case 0:
                    flag=false;
                    System.out.println("Adios");
                    break;
            }
        }
    }

    public static void primosGemelos(int n3, int n4){
        int contador=1;
        int primo=n3, primo2=primo+2;
        while (primo >= n3 && primo2 <= n4){
            if (Sesion3.esPrimo(primo) && Sesion3.esPrimo(primo2)) {
                System.out.printf(contador + ". %5d %5d\n", primo, primo2);
                contador++;
            }
            primo++;
            primo2=primo+2;
        }
    }

    public static void mostrarSumasDePrimos(int par){
        int contador=0;
        for (int i = 2; i <= par / 2; i++) {
            int j = par - i;
            if (Sesion3.esPrimo(i) && Sesion3.esPrimo(j)) {
                contador++;
                System.out.println(contador + ". " + i + " + " + j + " = " + par);
            }
        }
    }

    public static boolean esPrimoRecursivo(int entero, int divisor){
        boolean primo = true;
        if (entero == 1){
            primo=false;
            return primo;
        }
        if (divisor * divisor > entero) return primo;
        if (entero % divisor == 0) {
            primo=false;
            return primo;
        }
        return esPrimoRecursivo(entero, divisor + 1);
    }

    public static double potencia(int base, int exponente){
        if (exponente==0) return 1;
        else return base*potencia(base, exponente-1);
    }
}