import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //LONGITUD DE CADENA
        //LongitudDeCadena(entrada);

        //CONCATENACIÓN DE CADENAS
        //ConcatenacionDeCadenas(entrada);

        //EXTRACCIÓN DE SUBCADENA
        //ExtraccionDeSubcadena(entrada);

        //BUSQUEDA DE CARACTERES
        //BusquedaDeCaracteres(entrada);

        //CONVERSIÓN DE MAYUSCULAS Y MINUSCULAS
        //ConversionMayusculasMinusculas(entrada);

        //REEMPLAZO DE CARACTERES
        //ReemplazoDeCaracteres(entrada);
        
        //ELIMINACIÓN DE ESPACIOS EN BLANCO
        //EliminacionEspaciosEnBlanco(entrada);

        //COMPARACIÓN DE CADENAS
        //ComparacionDeCadenas(entrada);

        //LONGITUD DE CADENAS SIN ESPACIOS
        LongitudDeCadenasSinEspacios (entrada);

        entrada.close();
    }

private static void LongitudDeCadena(Scanner scannerEntrada){
    System.out.println("Ingrese una cadena: ");
    String cadena = scannerEntrada.nextLine();
    System.out.println("La longitud de la cadena es: " + cadena.length());
}

private static void ConcatenacionDeCadenas (Scanner scannerEntrada){
    System.out.println("Ingrese un nombre: ");
    String nombre = scannerEntrada.nextLine();

    System.out.println("Ingrese un apellido: ");
    String apellido = scannerEntrada.nextLine();

    System.out.println("El nombre completo es: " + nombre.concat(" ").concat(apellido));
}

private static void ExtraccionDeSubcadena(Scanner scannerEntrada){
    try {
        System.out.println("Ingrese una frase: ");
        String frase = scannerEntrada.nextLine();

        System.out.println("Ingrese el indice inicial: ");
        int indiceInicial = scannerEntrada.nextInt();
        System.out.println("Ingrese el indice final: ");
        int indiceFinal = scannerEntrada.nextInt();

        String subCadena = frase.substring(indiceInicial,indiceFinal);
        
        System.out.println("La subcadena es: " + subCadena);
    } catch (StringIndexOutOfBoundsException e){
        System.out.println("Indices ingresados fuera de rango");
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    

}

private static void BusquedaDeCaracteres(Scanner scannerEntrada){
    System.out.println("Ingrese una palabra: ");
    String palabra = scannerEntrada.nextLine();

    System.out.println("Ingrese un caracter: ");
    String caracter = scannerEntrada.nextLine();

    int indice = palabra.indexOf(caracter);

    if(indice!=-1){
        System.out.println("El indice del caracter ingresado está en la posición: " +(indice+1));
    } else{
        System.out.println("El caracter ingresado no se encuentra en la palabra");
    }
}

private static void ConversionMayusculasMinusculas(Scanner scannerEntrada){
    System.out.println("Ingrese una cadena de texto: ");
    String cadenaTexto = scannerEntrada.nextLine();

    System.out.println("Cadena en mayusculas: " + cadenaTexto.toUpperCase());
    System.out.println("Cadena en minusculas: " + cadenaTexto.toLowerCase());
}

private static void ReemplazoDeCaracteres(Scanner scannerEntrada){
    System.out.println("Ingrese una frase: ");
    String frase = scannerEntrada.nextLine();

    System.out.println("Ingrese el caracter que desea reemplazar: ");
    char primerCaracter = scannerEntrada.next().charAt(0);

    System.out.println("Ingrese el caracter a reemplazar: ");
    char segundoCaracter = scannerEntrada.next().charAt(0);

    frase = frase.replace(primerCaracter, segundoCaracter);

    System.out.println("La nueva frase es: " + frase);
}

private static void EliminacionEspaciosEnBlanco(Scanner scannerEntrada){
    System.out.println("Ingrese frase con espacios en blanco al principio y final: ");
    String cadena = scannerEntrada.nextLine();

    cadena = cadena.trim();

    System.out.println("La nueva cadena es: "+cadena);
}

private static void ComparacionDeCadenas(Scanner scannerEntrada){
    System.out.println("Ingrese una primera palabra: ");
    String primeraPalabra = scannerEntrada.nextLine();

    System.out.println("Ingrese una segunda palabra: ");
    String segundaPalabra = scannerEntrada.nextLine();

    Boolean iguales = primeraPalabra.equals(segundaPalabra);

    Boolean igualesSinMayusculas = primeraPalabra.equalsIgnoreCase(segundaPalabra);

    if (iguales){
        System.out.println("Equals: Las palabras son iguales");
    } else {
        System.out.println("Equals: Las palabras son diferentes");
    }

    if(igualesSinMayusculas){
        System.out.println("Equals Ignore Case: Las palabras son iguales");
    } else {
        System.out.println("Equals Ignore Case: Las palabras son diferentes");
    }
}

private static void LongitudDeCadenasSinEspacios (Scanner scannerEntrada){
    System.out.println("Ingrese la cadena de texto: ");
    String cadenaTexto = scannerEntrada.nextLine();

    String cadenaTextoSinEspacios = cadenaTexto.replace(" ", "");
    int longitudCadenaTextoSinEspacios = cadenaTextoSinEspacios.length();

    System.out.println("La longitud de la cadena de texto sin espacio es: "+longitudCadenaTextoSinEspacios);
    System.out.println("Cadena de texto sin espacios: "+cadenaTextoSinEspacios);
}

}