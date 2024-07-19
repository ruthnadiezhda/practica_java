import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadesIntegradoras3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //GENERANDO CONTRASEÑAS
        //GenerandoContraseñas(entrada);

        //ESTADISTICAS DE CALIFICACIONES
        //EstadisticasDeCalificaciones(entrada);

        //FIBONACCI
        //Fibonacci(entrada);

        //NUMEROS PRIMOS
        NumerosPrimos(entrada);

        entrada.close();

    }

    private static void GenerandoContraseñas(Scanner scannerEntrada){
        try {
            System.out.println("Introduzca la longitud de la contraseña: ");
        int longitudContraseña = scannerEntrada.nextInt();

        char[] arrayContraseña = new char[longitudContraseña];

        boolean tieneMayuscula=false;
        boolean tieneMinuscula=false;
        boolean tieneDigito=false;
        do {
            System.out.println("Elementos del array: ");
            for (int i=0; i<longitudContraseña;i++){
                arrayContraseña[i] = (char) ((int) (Math.random()*(126-33))+33);
                System.out.print(arrayContraseña[i]+" ");
            }
            System.out.println(" ");
    
            tieneMayuscula=false;
            tieneMinuscula=false;
            tieneDigito=false;

            for(int i=0; i<longitudContraseña;i++){
                if(Character.isUpperCase(arrayContraseña[i])){
                    tieneMayuscula = true;
                } else if (Character.isDigit(arrayContraseña[i])){
                    tieneDigito = true;
                } else if (Character.isLowerCase(arrayContraseña[i])){
                    tieneMinuscula = true;
                }
            }
        } while (!(tieneDigito&&tieneMayuscula&&tieneMinuscula));

        String contraseña = new String(arrayContraseña);
        System.out.println("Contraseña generada: "+contraseña);
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese un numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
    }

    private static void EstadisticasDeCalificaciones(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese el numero de calificaciones: ");
            int numeroCalificaciones = scannerEntrada.nextInt();

            String[] arrayCalificaciones = new String[numeroCalificaciones];

            System.out.println("Array calificaciones: ");
            for(int i=0; i<numeroCalificaciones;i++){
                double calificacion = (double) (Math.random()*(20));
                arrayCalificaciones[i]=Double.toString(calificacion);
                System.out.print(arrayCalificaciones[i]+" ");
            }
            System.out.println(" ");

            int numeroAprobado =0;
            int numeroDesaprobado=0;
            int numeroExcelente=0;
            double sumaTotal=0;
            double sumaAprobado=0;
            double sumaDesaprobado=0;
            double sumaExcelente=0;
            
            for(String elemento:arrayCalificaciones){
                double valorCalificacion = Double.parseDouble(elemento);
                if(valorCalificacion<4){
                    numeroDesaprobado++;
                    sumaDesaprobado=sumaDesaprobado+valorCalificacion;
                } else if(valorCalificacion>=4 && valorCalificacion<10){
                    numeroAprobado++;
                    sumaAprobado=sumaAprobado+valorCalificacion;
                } else if (valorCalificacion>=10){
                    numeroExcelente++;
                    sumaExcelente=sumaExcelente+valorCalificacion;
                }

                sumaTotal=sumaTotal+valorCalificacion;
            }

            String[] arrayDesaprobado = new String[numeroDesaprobado];
            String[] arrayAprobado = new String[numeroAprobado];
            String[] arrayExcelente = new String[numeroExcelente];

            for(String elemento:arrayCalificaciones){
                double valorCalificacion = Double.parseDouble(elemento);
                if(valorCalificacion<4){
                    int index=0;
                    arrayDesaprobado[index]=elemento;
                    index++;
                } else if(valorCalificacion>=4 && valorCalificacion<10){
                    int index=0;
                    arrayAprobado[index]=elemento;
                    index++;
                } else if (valorCalificacion>=10){
                    int index=0;
                    arrayExcelente[index]=elemento;
                    index++;
                }
            }

            System.out.println("Array Desaprobados: "+ Arrays.toString(arrayDesaprobado));
            System.out.println("Array Aprobados: "+  Arrays.toString(arrayAprobado));
            System.out.println("Array Excelentes: "+  Arrays.toString(arrayExcelente));

            System.out.println("El promedio del arreglo original: "+(sumaTotal/numeroCalificaciones));
            System.out.println("El promedio del arreglo desaprobados: "+(sumaDesaprobado/numeroDesaprobado));
            System.out.println("El promedio del arreglo aprobados: "+(sumaAprobado/numeroAprobado));
            System.out.println("El promedio del arreglo excelentes:"+(sumaExcelente/numeroExcelente));


        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese un numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void Fibonacci(Scanner scannerEntrada){
        int fibonacci0 = 0;
        int fibonacci1=1;
        int contador = 0;
        int[] arrayFibonacci = new int[8];

        while (contador<8) {
            if(contador==0){
                arrayFibonacci[contador]=fibonacci0;
                System.out.println("Posición "+ contador + ": "+Arrays.toString(arrayFibonacci));
                contador++;
            } else if(contador==1){
                arrayFibonacci[contador]=fibonacci1;
                System.out.println("Posición "+ contador+": "+Arrays.toString(arrayFibonacci));
                contador++;
            } else {
                arrayFibonacci[contador]=fibonacci1+fibonacci0;
                fibonacci0=fibonacci1;
                fibonacci1=arrayFibonacci[contador];
                System.out.println("Posición "+ contador+": "+Arrays.toString(arrayFibonacci));
                contador++;
            }
            
        }
    }

    private static void NumerosPrimos(Scanner scannerEntrada){
        try {
            int numeroIngresado;
            boolean esPrimo;
            do {
                System.out.println("Ingrese un numero: ");
                numeroIngresado = scannerEntrada.nextInt();

                if(numeroIngresado==0){
                    System.out.println("Programa finalizado");
                    break;
                } else if (numeroIngresado==1 || numeroIngresado==2 || numeroIngresado==3){
                    esPrimo=true;
                    System.out.println("El numero ingresado "+numeroIngresado+" es primo");
                } else {
                    esPrimo=true;
                    for (int i = 2; i <= Math.sqrt(numeroIngresado); ++i) {
                        if (numeroIngresado % i == 0) {
                            esPrimo = false;
                            System.out.println("El numero ingresado "+numeroIngresado +" no es primo, ingrese otro numero o presione 0 para salir");
                            break;
                        } 
                    }
                    if(esPrimo) {
                            System.out.println("El numero ingresado "+numeroIngresado+" es primo");
                        }
                }
            } while (!esPrimo);
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese un numero");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
