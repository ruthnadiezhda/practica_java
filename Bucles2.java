import javax.swing.text.Style;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bucles2 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //MENU INTERACTIVO WHILE
        //MenuInteractivoWhile(entrada);

        //ADIVINANDO UN NUMERO
        //AdivinandoUnNumero (entrada);

        //VALIDACIÓN DE CONTRASEÑA
        //ValidacionDeContraseña(entrada);

        //NUMERO DE DIGITOS
        //NumeroDeDigitos(entrada);

        //TABLA DE MULTIPLICAR
        //TablaDeMultiplicar(entrada);

        //CONTADOR DE NUMEROS PARES E IMPARES
        //ContadorNumerosParesImpares(entrada);

        //CALCULADORA DE SUMA ACUMULADORA
        CalculadoraSumaAcumulada(entrada);

        entrada.close();

    }

    private static void MenuInteractivoWhile(Scanner scannerEntrada){
        try {

            int opcion;
            do {
                System.out.println("Eliga una opción del menú: ");
                System.out.println("1. Comprar producto");
                System.out.println("2. Realizar una devolución");
                System.out.println("3. Ver mis pedidos");
                System.out.println("4. Preguntas frecuentes");
                System.out.println("5. Salir");

                System.out.println("Ingrese una opción: ");

                opcion = scannerEntrada.nextInt();

                System.out.println("Ingresaste la opción: " + opcion);
            } while (opcion<5);

        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese una numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void AdivinandoUnNumero(Scanner scannerEntrada){
        try {
            int numeroIngresado;
            int numeroAleatorio=(int)(Math.random()*(20-1))+1;;
            do {
                System.out.println("Ingrese un numero a adivinar entre 1 y 20:");
                numeroIngresado = scannerEntrada.nextInt();

                if (numeroIngresado != numeroAleatorio) {
                    System.out.println("Número incorrecto, vuelva a intentar.");
                    String mensaje = mensaje = (numeroIngresado < numeroAleatorio) ? "El número es mayor que " + numeroIngresado : (numeroIngresado > numeroAleatorio) ? "El número es menor que " + numeroIngresado : "Acertaste";
                    System.out.println(mensaje);
                }

            } while (numeroIngresado!=numeroAleatorio);
            System.out.println("¡Felicidades! El número aleatorio era: " + numeroAleatorio);

        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese una numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void ValidacionDeContraseña(Scanner scannerEntrada){
        try {
    
            String contraseñaIngresada;
            String contraseña = "secreto";
            do {
                System.out.println("Ingrese la contraseña: ");
                contraseñaIngresada = scannerEntrada.nextLine();
                if (!contraseña.equals(contraseñaIngresada)){
                    System.out.println("Contraseña incorrecta, siga intentando");
                }
            } while (!contraseña.equals(contraseñaIngresada));
            
            System.out.println("¡Felicidades! Ingresó la contraseña correcta");

        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void NumeroDeDigitos(Scanner scannerEntrada){
        try {
            int digitosNumero=0;
            
            System.out.println("Ingrese un número entero para contar sus digitos: ");
            int numeroEntero = scannerEntrada.nextInt();
            int numeroEnteroAbsoluto = Math.abs(numeroEntero);

            if (numeroEntero ==0 ){
                digitosNumero=1;
            } else {
                while (numeroEnteroAbsoluto>0) {
                    numeroEnteroAbsoluto=numeroEnteroAbsoluto/10;
                    digitosNumero++;
                }
            }

            System.out.println("El número " + numeroEntero + " tiene " + digitosNumero + " digitos");
            
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese una numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void TablaDeMultiplicar(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese un numero entero: ");
            int numero = scannerEntrada.nextInt();
            System.out.println("Su tabla de multiplicar: ");
            
            int multiplicador = 10;
            while (multiplicador>=0) {
                int operacion = numero*multiplicador;
                System.out.println(multiplicador + "x" + numero + "= " + operacion);
                multiplicador--;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese una numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void ContadorNumerosParesImpares(Scanner scannerEntrada){
        try {
            int contadorPares =0;
            int contadorImpares=0;
            int numeroCuenta;

            do {
                System.out.println("Ingrese el número a contar, 0 para salir: ");
                numeroCuenta= scannerEntrada.nextInt();
                
                if (numeroCuenta==0) {
                    System.out.println("Salió del programa");
                } else{
                    if(numeroCuenta%2==0){
                        contadorPares++;
                    } else {
                        contadorImpares++;
                    }
                }
            } while (numeroCuenta!=0);
            System.out.println("Numeros pares ingresados: " + contadorPares);
                    System.out.println("Numeros impares ingresados: " + contadorImpares);
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese una numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void CalculadoraSumaAcumulada(Scanner scannerEntrada){
        try {
            int numeroIngresado;
            int sumatoria =0;
            String opcionSeguir;
            boolean opcion = true;
            do {
                System.out.println("Ingresa un numero: ");
                numeroIngresado = Integer.parseInt(scannerEntrada.nextLine());

                sumatoria = sumatoria+numeroIngresado;

                System.out.println("¿Desea ingresar otro número?: SI/NO");
                opcionSeguir = scannerEntrada.nextLine();

                if (opcionSeguir.equalsIgnoreCase("SI")) {
                    opcion=true;
                } else if (opcionSeguir.equalsIgnoreCase("NO")){
                    opcion=false;
                } else {
                    System.out.println("Error: Opción no valida");
                }
            } while (opcion);
            System.out.println("La suma de los numeros ingresados es: " + sumatoria);
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese una numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}