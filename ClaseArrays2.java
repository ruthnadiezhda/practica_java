import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;

public class ClaseArrays2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //ORDENAR DE FORMA DESCENDENTE
        //OrdenarDeFormaDescendente(entrada);

        //BUSQUEDA BINARIA
        //BusquedaBinaria(entrada);

        //COMPARANDO ARREGLOS
        //ComparandoArreglos(entrada);

        //COPIANDO PARTE DE UN ARREGLO
        //CopiandoParteDeUnArreglo(entrada);

        //RELLENANDO UN ARREGLO
        //RellenandoUnArreglo(entrada);

        //RELLENANDO DE MANERA PERSONALIZADA
        RellenandoDeManeraPersonalizada(entrada);

        entrada.close();
    }

    private static void OrdenarDeFormaDescendente(Scanner scannerEntrada){
        int[] arrayNumeros = new int[10];
        System.out.println("Arreglo inicial: ");
        
        for( int i=0; i<arrayNumeros.length; i++){
            arrayNumeros[i]=(int)(Math.random()*(100-1))+1;
            System.out.print(arrayNumeros[i] + " ");
        }

        System.out.println(" ");

        System.out.println("Arreglo de forma ascendente: ");
        Arrays.sort(arrayNumeros);
        for( int i=0; i<arrayNumeros.length; i++){
            System.out.print(arrayNumeros[i] + " ");
        }

        System.out.println(" ");

        int[] arrayDescendente = new int[10];
        System.out.println("Arreglo de forma descendente: ");
        for( int i=0; i<arrayNumeros.length; i++){
            arrayDescendente[i] = arrayNumeros[arrayNumeros.length-1-i];
            System.out.print(arrayDescendente[i]+" ");
        }
    }

    private static void BusquedaBinaria(Scanner scannerEntrada){
        int[] arrayBinarios = new int[10];
        System.out.println("Arreglo inicial: ");
        
        for( int i=0; i<arrayBinarios.length; i++){
            arrayBinarios[i]=(int)(Math.random()*(20-1))+1;
            System.out.print(arrayBinarios[i] + " ");
        }
        Arrays.sort(arrayBinarios);

        System.out.println(" ");

        System.out.println("Arreglo ordenado: ");
        for (int elemento: arrayBinarios){
            System.out.print(elemento + " ");
        }
        System.out.println(" ");
        
        int numeroBusqueda=5;
        System.out.println("Busqueda binaria del " + numeroBusqueda);
        int indexNumero= Arrays.binarySearch(arrayBinarios, numeroBusqueda);

        if(indexNumero<0){
            System.out.println("El número " + numeroBusqueda + " no está en el array");
            System.out.println("Index: " + indexNumero);
        } else {
            System.out.println("El número " + numeroBusqueda + " está en el array");
            System.out.println("Index: " + indexNumero);
        }

    }

    private static void ComparandoArreglos(Scanner scannerEntrada){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = new int[5];
        for( int i=0; i<array3.length; i++){
            array3[i]=(int)(Math.random()*(5-1))+1;
        }

        boolean esIgual1 = Arrays.equals(array1, array2);
        boolean esIgual2 = Arrays.equals(array1, array3);

        System.out.println("¿Es igual el array 1 al array 2?");
        System.out.println("Array 1: ");
        for( int elemento : array1){
            System.out.print(elemento + " ");
        }
        System.out.println(" ");
        System.out.println("Array 2: ");
        for( int elemento : array2){
            System.out.print(elemento + " ");
        }
        System.out.println(" ");
        System.out.println(esIgual1);

        System.out.println("¿Es igual el array 1 al array 3?");
        System.out.println("Array 1: ");
        for( int elemento : array1){
            System.out.print(elemento + " ");
        }
        System.out.println(" ");
        System.out.println("Array 3: ");
        for( int elemento : array3){
            System.out.print(elemento + " ");
        }
        System.out.println(" ");
        System.out.println(esIgual2);
    }

    private static void CopiandoParteDeUnArreglo(Scanner scannerEntrada){
        try {
            int[] arrayIndices = new int[10];
            System.out.println("Arreglo inicial: ");
            
            for( int i=0; i<arrayIndices.length; i++){
                arrayIndices[i]=(int)(Math.random()*(100-1))+1;
                System.out.print(arrayIndices[i] + " ");
            }
            System.out.println(" ");

            System.out.println("Ingrese el indice inicial: ");
            int indiceInicial = scannerEntrada.nextInt();

            System.out.println("Ingrese el indice final: ");
            int indiceFinal = scannerEntrada.nextInt();

            if(indiceFinal<indiceInicial){
                System.out.println("Error: Indice final ingresado menor a indice inicial ingresado");
            } else if (indiceFinal>arrayIndices.length){
                System.out.println("Error: Indice final fuera de rango");
            }else {
                int[] arrayIndicesCopia = Arrays.copyOfRange(arrayIndices, indiceInicial, indiceFinal+1);
                System.out.println("Array copia con indice de inicio " + indiceInicial + " e indice final " + indiceFinal);
                for(int elemento:arrayIndicesCopia){
                    System.out.print(elemento + " ");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese un numero");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: Indices ingresados fuera de rango");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void RellenandoUnArreglo(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese el tamaño del arreglo: ");
            int tamaño = scannerEntrada.nextInt();
            int[] array = new int[tamaño];
        
            System.out.println("Ingrese el valor a rellenar en el arreglo: ");
            int valor = scannerEntrada.nextInt();

            Arrays.fill(array, valor);
            System.out.println("El array ingresado: " + Arrays.toString(array));
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese un numero");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void RellenandoDeManeraPersonalizada(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese el tamaño del arreglo: ");
            int tamaño = scannerEntrada.nextInt();
            int[] array = new int[tamaño];
    
            int indiceActual =0;
            int indiceFinal = 0;

            while (indiceFinal<tamaño){
                System.out.println("Ingrese el valor a rellenar en el arreglo: ");
                int valor = scannerEntrada.nextInt();
                    
                System.out.println("Ingrese el indice final a rellenar el arreglo: ");
                indiceFinal = scannerEntrada.nextInt();
                
                if(indiceFinal<indiceActual){
                    System.out.println("Error: Indice final menor que indice inicial");
                } 
                
                if (indiceFinal>tamaño){
                    System.out.println("Error: Indice final mayor al tamaño del arreglo");
                }
                    
                Arrays.fill(array, indiceActual, indiceFinal, valor);
                indiceActual = indiceFinal;
                
                if (indiceFinal == tamaño){
                    break;
                } else {
                    System.out.println("¿Desea seguir rellenando el arreglo?: SI/NO");
                    scannerEntrada.nextLine(); 
                    String continuar = scannerEntrada.nextLine(); 

                    if (continuar.equalsIgnoreCase("NO")) {
                        break;
                    }
                }

            }
            
            System.out.println("El array ingresado: " + Arrays.toString(array));
        } catch (InputMismatchException e) {
            System.out.println("Error: Opción no valida. Ingrese un numero");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: Indices ingresados fuera de rango");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
