import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //CALCULANDO EL VALOR ABSOLUTO
        //CalculandoValorAbsoluto(entrada);

        //REDONDEO DE NUMEROS
        //RedondeoDeNumeros(entrada);

        //GENERANDO NUMEROS ALEATORIOS
        //GenerandoNumerosAleatorios(entrada);

        //CALCULANDO LA POTENCIA
        //CalculandoLaPotencia(entrada);

        //CALCULANDO LA RAIZ CUADRADA
        //CalculandoLaRaizCuadrada(entrada);

        //GENERANDO NUMERO ALEATORIO ENTRE DOS LIMITES
        //GenerandoAleatorioEntreLimites(entrada);

        //GENERACION ALEATORIA Y RAIZ CUADRADA
        GeneracionAleatoriaRaizCuadrada(entrada);

    }

    private static void CalculandoValorAbsoluto(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese un numero para obtener el valor absoluto: ");
            double numero = scannerEntrada.nextDouble();

            double numeroValorAbsoluto = Math.abs(numero);

            System.out.println("El valor absoluto del número es: "+numeroValorAbsoluto);
        } catch (InputMismatchException e) {
            System.out.println("Error: Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void RedondeoDeNumeros(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese un numero decimal: ");
            double numeroDecimal = scannerEntrada.nextDouble();

            double numeroRedondeado = Math.round(numeroDecimal);

            System.out.println("El valor redondeado del número es: "+ numeroRedondeado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void GenerandoNumerosAleatorios(Scanner scannerEntrada){
        double numeroAleatorio = (Math.random()*355)+1;
        System.out.println("El numero aleatorio es: " + numeroAleatorio);
        System.out.println("El numero aleatorio redondeado es: " + Math.floor(numeroAleatorio));
    }

    private static void CalculandoLaPotencia(Scanner scannerEntrada){
        
        try {
            System.out.println("Ingrese la base: ");
            int base = scannerEntrada.nextInt();

            System.out.println("Ingrese el exponente: ");
            int exponente = scannerEntrada.nextInt();

            int potencia = (int) Math.pow(base, exponente);

            System.out.println("La potencia de " + base + " elevado a " + exponente + " es: "+potencia);
        } catch (InputMismatchException e) {
            System.out.println("Error: Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void CalculandoLaRaizCuadrada(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese un numero positivo para sacar la raiz cuadrada: ");
            double numeroRaiz = scannerEntrada.nextDouble();

            if(numeroRaiz<0){
                System.out.println("Error: El número ingresado debe ser positivo");
            } else {
                double resultadoRaiz = Math.sqrt(numeroRaiz);
                System.out.println("El resultado de la raiz cuadrada de " + numeroRaiz + " es: " + resultadoRaiz);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void GenerandoAleatorioEntreLimites(Scanner scannerEntrada){
        
        try {
            System.out.println("Ingrese el límite inferior: ");
            int limiteInferior = scannerEntrada.nextInt();

            System.out.println("Ingrese el límite superior: ");
            int limiteSuperior = scannerEntrada.nextInt();

            if(limiteInferior>limiteSuperior){
                System.out.println("Error: Limite inferior es mayor el límite superior");
            } else {
                double aleatorioLimites = (Math.random()*(limiteSuperior-limiteInferior+1))+limiteInferior;
                System.out.println("El numero aleatorio es: " + aleatorioLimites);
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void GeneracionAleatoriaRaizCuadrada(Scanner scannerEntrada){
    try {
        System.out.println("Ingrese un numero entre 1 y 30: ");
        int numeroLimite = scannerEntrada.nextInt();

        if (numeroLimite<1 || numeroLimite>30){
            System.out.println("Error: Numero limite ingresado fuera del rango");
        } else {
            int numeroRandomLimite = (int)(Math.random()*(numeroLimite))+1;
            System.out.println("El número random entre 1 y el límite " + numeroLimite + " es: " + numeroRandomLimite);

            double raizCuadradaNumeroRandomLimite = (Math.sqrt(numeroRandomLimite));
            System.out.println("La raiz cuadrada del numero aleatorio " + numeroRandomLimite + " es: " + raizCuadradaNumeroRandomLimite);

            boolean esPrimo = true;
            if (numeroRandomLimite <2){
                esPrimo = false;
            } else {
                for (int i = 2; i <= numeroRandomLimite/2; ++i) {
                    if (numeroRandomLimite % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if(!esPrimo){
                System.out.println("El número no es primo");
            } else {
                System.out.println("El número es primo");
            }
        }
    } catch (InputMismatchException e) {
        System.out.println("Error: Valor ingresado no es numerico");
    } catch (Exception e) {
        System.out.println("Error: "+ e.getMessage());
    }
    }
}
