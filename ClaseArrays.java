import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class ClaseArrays {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //SUMANDO ELEMENTOS
        //SumandoElementos(entrada);

        //PROMEDIANDO ELEMENTOS
        //PromediandoElementos(entrada);

        //ENCONTRANDO EL MAXIMO
        //EncontrandoElMaximo(entrada);

        //BUSCANDO UN ELEMENTO
        //BuscandoElemento(entrada);

        //COPIANDO ELEMENTOS
        //COpiandoElementos(entrada);

        //GENERANDONUMEROALEATORIOENTRELIMITES
        //GenerandoAleatorioEntreLimites(entrada);

        //SUMANDO ELEMENTOS EN POSICIONES PARES
        //SumandoElementosPosicionesPares(entrada);

        //ORDENANDO NOMBRES ALFABETICAMENTE
        OrdenandoNombresAlfabeticamente(entrada);
        
        entrada.close();
    }

    private static void SumandoElementos(Scanner scannerEntrada){
        try {
            System.out.println("Escriba los 3 elementos del array a sumar: ");
        
            int numero1= scannerEntrada.nextInt();
            int numero2= scannerEntrada.nextInt();
            int numero3= scannerEntrada.nextInt();

            int[] arraySuma = {numero1,numero2,numero3};

            int suma=0;
            for(int i=0; i<arraySuma.length; i++){
                suma += arraySuma[i];
            }

            System.out.println("La suma de los elementos del array es: " + suma);
        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado no es numerico");
        }catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    private static void PromediandoElementos(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese los 4 elementos a promediar: ");

            int[] arrayPromedio= new int[4];

            int suma=0;
            for(int i=0; i<arrayPromedio.length; i++){
                arrayPromedio[i] = scannerEntrada.nextInt();
                suma += arrayPromedio[i];
            }

            double promedio = (double) suma/arrayPromedio.length;

            System.out.println("La suma de los 4 elementos es: " + suma);
            System.out.println("El promedio de los 4 elementos es: " + promedio);
        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

    private static void EncontrandoElMaximo(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese 5 elementos: ");

            int[] arrayMaximo= new int[5];

            for(int i=0; i<arrayMaximo.length; i++){
                arrayMaximo[i] = scannerEntrada.nextInt();
            }

            int maximo =0;
            for (int j =0; j<arrayMaximo.length;j++){
                if(maximo<arrayMaximo[j]){
                    maximo=arrayMaximo[j];
                }
            }

            System.out.println("El mayor es: " + maximo);
        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    private static void BuscandoElemento(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese el elemento a buscar: ");
            int numeroIngresado = scannerEntrada.nextInt();

            int[] arrayBusqueda = {5,3,4};

            if (arrayBusqueda[0]==numeroIngresado){
                System.out.println("El numero ingresado " + numeroIngresado + " se encuentra en el array en la posición 0");
            } else if (arrayBusqueda[1]==numeroIngresado){
                System.out.println("El numero ingresado " + numeroIngresado + " se encuentra en el array en la posición 1");
            } else if (arrayBusqueda[2]==numeroIngresado){
                System.out.println("El numero ingresado " + numeroIngresado + " se encuentra en el array en la posición 2");
            } else {
                System.out.println("El numero ingresado no se encuentra en el array");
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    private static void COpiandoElementos(Scanner scannerEntrada){
        try {
            System.out.println("El array original: ");
            int[] arrayOriginal = {10,100,1000};
            for (int k = 0; k < arrayOriginal.length; k++) {
                System.out.println("Elemento " + k + ": " + arrayOriginal[k]);
            }

            int[] arrayCopia = new int[5];

            for (int i=0;i<arrayOriginal.length;i++){
                arrayCopia[i]=arrayOriginal[i];
            }
            
            System.out.println("Ingrese 2 elementos adicionales: ");
            arrayCopia[3]=scannerEntrada.nextInt();
            arrayCopia[4]=scannerEntrada.nextInt();

            System.out.println("El array copia:");
            for (int j = 0; j < arrayCopia.length; j++) {
                System.out.println("Elemento " + j + ": " + arrayCopia[j]);
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Valor ingresado no es numerico");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    private static void GenerandoAleatorioEntreLimites(Scanner scannerEntrada){
        
        int[] arrayAleatorio = new int[6];

        for(int i=0; i<arrayAleatorio.length;i++){
            arrayAleatorio[i] = (int)((Math.random()*(100-1))+1);
            System.out.println("Elemento "+ i +" del array aleatorio : " + arrayAleatorio[i]);
        }
        
        System.out.println(" ");

        for(int j=0; j<arrayAleatorio.length;j++){
            if(arrayAleatorio[j]%2==0){
                System.out.println("Elemento "+j+ " del array aleatorio es par. El elemento es " + arrayAleatorio[j]);
            }
        }
    }

    private static void SumandoElementosPosicionesPares(Scanner scannerEntrada){
        int[] arrayAleatorioPares = new int[5];

        for(int i=0; i<arrayAleatorioPares.length;i++){
            arrayAleatorioPares[i] = (int)((Math.random()*(100-1))+1);
            System.out.println("Elemento "+ i +" del array aleatorio : " + arrayAleatorioPares[i]);
        }

        int sumaTotalPares =0;
        for (int j=0; j<arrayAleatorioPares.length;j++){
            if(j%2==0){
                sumaTotalPares=sumaTotalPares+arrayAleatorioPares[j];
                System.out.println("Posición par " + j + " sumada");
            }
        }
        System.out.println("La suma total de los elementos en las posiciones pares es " + sumaTotalPares);
    }

    private static void OrdenandoNombresAlfabeticamente(Scanner scannerEntrada){
        String[] arrayNombres = new String[4];

        System.out.println("Ingrese 4 nombres: ");
        arrayNombres[0]= scannerEntrada.nextLine();
        arrayNombres[1]= scannerEntrada.nextLine();
        arrayNombres[2]= scannerEntrada.nextLine();
        arrayNombres[3]= scannerEntrada.nextLine();
        
        Arrays.sort(arrayNombres);

        System.out.println("Nombres ordenados alfabeticamente: ");

        for(String nombre : arrayNombres){
            System.out.println("Nombre: " + nombre);
        }
    }
}
