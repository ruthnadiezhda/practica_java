import java.util.Scanner;

public class Bucles1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //IMPRIMIENDO ELEMENTOS
        //ImprimiendoElementos (entrada);

        //ENCONTRANDO VALOR MINIMO
        //EncontrandoValorMinimo(entrada);

        //IMPRIMIENDO ELEMENTOS EN ORDEN INVERSO
        //ImprimiendoElementosEnOrdenInverso (entrada);

        //INVERTIR UN ARRAY
        //InvertirUnArray(entrada);

        //CALCULAR SUMA ACUMULADA
        CalcularSumaAcumulada(entrada);

        entrada.close();
    }

    private static void ImprimiendoElementos(Scanner scannerEntrada){
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        for (int i=0; i<array.length;i++){
            System.out.println("Elemento " + i + " del array es: " + array[i]);
        }
    }

    private static void EncontrandoValorMinimo(Scanner scannerEntrada){
        int[] arrayMinimo = {5,8,90,14,105,614,10001,5,2,6};

        int minimo = arrayMinimo[0];
        for (int j=0;j<arrayMinimo.length;j++){
            if(arrayMinimo[j]<minimo){
                minimo = arrayMinimo[j];
            }
        }
        System.out.println("El número mínimo del array es: "+minimo);
    }

    private static void ImprimiendoElementosEnOrdenInverso(Scanner entrada){
        int[] arrayOrdenOriginal = {1,2,3,4,5,6,7,8,9,10};

        for (int k=arrayOrdenOriginal.length-1; k>=0; k--){
            System.out.println("Elemento numero " + k + " del array: " + arrayOrdenOriginal[k]);
        }
    }

    private static void InvertirUnArray(Scanner scannerEntrada){
        int[] arrayAInvertir = {100,90,80,70,60,50,40,30,20,10,0};

        int[] arrayInvertido = new int[10];

        for (int y=0; y<arrayAInvertir.length;y++){
            System.out.println("Elemento " + y + " del array a invertir es: " + arrayAInvertir[y]);
        }

        int longitud = arrayAInvertir.length;
        for (int x=0; x<longitud/2; x++){

            int temporal = arrayAInvertir[x];
            arrayInvertido[x]=arrayAInvertir[longitud-1-x];
            arrayAInvertir[longitud-x-1] = temporal;
        }

        for (int y=0; y<arrayInvertido.length;y++){
            System.out.println("Elemento " + y + " del array invertido es: " + arrayInvertido[y]);
        }
    }

    private static void CalcularSumaAcumulada(Scanner scannerEntrada){
        int[] arrayASumar = {1,2,3,4,5};
        int[] arraySumatoria = new int[5];

        int sumatoria =0;
        for(int z=0;z<arrayASumar.length;z++){
            System.out.println("Elemento "+ z+ " del array a sumar: " + arrayASumar[z]);
            sumatoria+=arrayASumar[z];
            arraySumatoria[z] = sumatoria;
            System.out.println("Elemento " + z + " del array sumatoria: " + arraySumatoria[z] );
        }
    }
}
