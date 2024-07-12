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
        //CalcularSumaAcumulada(entrada);

        //CONTANDO ELEMENTOS PARES
        //ContandoElementosPares(entrada);

        //CALCULANDO EL PROMEDIO
        //CalculandoElPromedio(entrada);

        //CONCATENANDO ELEMENTOS
        //ConcatenandoElementos(entrada);

        //CONTAR OCURRENCIAS
        ContarOcurrencias(entrada);

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

    private static void ContandoElementosPares(Scanner scannerEntrada){
        int[] arrayPares = new int[10];

        for( int i =0; i<arrayPares.length;i++){
            arrayPares[i]= (int) (Math.random()*(100-1))+1;
        }

        System.out.println("Elementos del array: ");
        for (int elemento : arrayPares){
            System.out.print(elemento+" ");
        }

        System.out.println(" ");
        int conteoPares=0;
        System.out.println("Son pares: ");
        for (int elemento : arrayPares){
            if(elemento%2==0){
                conteoPares++;
                System.out.print(elemento + " ");
            }
        }
        System.out.println(" ");
        System.out.println("Hay " + conteoPares + " numeros pares");
    }

    private static void CalculandoElPromedio(Scanner scannerEntrada){
        float[] arrayPromedio = new float[20];

        for (int j=0;j<arrayPromedio.length;j++){
            arrayPromedio[j] = (float)(Math.random()*(100-1))+1;
        }
        
        System.out.println("Elementos del array: ");
        float suma =0;
        float promedio =0;
        for (float elemento : arrayPromedio){
            System.out.print(elemento + " ");
        }
        System.out.println(" ");

        for (float elemento : arrayPromedio){
            suma = suma+elemento;
        }
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + suma/arrayPromedio.length);
    }

    private static void ConcatenandoElementos(Scanner scannerEntrada){
        String[] arrayCaracteres = {"h","o","l","a"," ","m","u","n","d","o"};

        StringBuilder cadenaFinal = new StringBuilder();
        
        for (String elemento : arrayCaracteres){
            cadenaFinal.append(elemento);
        }

        System.out.println("Cadena concatenada: " + cadenaFinal.toString());
    }

    private static void ContarOcurrencias(Scanner scannerEntrada){
        char[] arrayOcurrencias = "Hola amigos de Egg, estoy aprendiendo JAVA y me gusta mucho".toCharArray();
        
        System.out.println("Ingrese el caracter a buscar: ");
        char caracterABuscar = scannerEntrada.next().charAt(0);

        char caracterABuscarLower = Character.toLowerCase(caracterABuscar);
        char caracterABuscarUpper = Character.toUpperCase(caracterABuscar);

        int contador =0;
        for(char elemento : arrayOcurrencias){
            
            char elementoLower = Character.toLowerCase(elemento);
            char elementoUpper = Character.toUpperCase(elemento);

            if(caracterABuscarLower==elementoLower || caracterABuscarUpper == elementoUpper){
                contador++;
            }
        }

        if(contador==1){
            System.out.println("El caracter " + caracterABuscar + " aparece " + contador + " vez");
        } else if (contador>=2){
            System.out.println("El caracter " + caracterABuscar + " aparece " + contador + " veces");
        } else {
            System.out.println("El caracter "+ caracterABuscar + " no aparece en la frase");
        }
    }
}
