import java.util.InputMismatchException;
import java.util.Scanner;

public class ClaseWrappers {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //VERIFICANDO SI UNA CADENA REPRESENTA UN NUMERO VALIDO
        //VerificandoCadenaNumeroValido(entrada);

        //CONVERSIÓN DE CADENA A NUMERO
        //ConversionCadenaNumero(entrada);

        //VERIFICANDO SI UNA CADENA CONTIENE SOLO LETRAS
        //VerificandoCadenaSoloLetras(entrada);

        //CONTANDOESPACIOSENBLANCO
        //ContandoEspaciosEnBlanco(entrada);

        //SUMA DE NUMEROS
        //SumaDeNumeros(entrada);

        //CONTANDO LOS DIGITOS DE UN NUMERO
        ContandoDigitosNumero(entrada);
    }

    private static void VerificandoCadenaNumeroValido(Scanner scannerEntrada){
        try {
            System.out.println("Introduzca una cadena: ");
            String cadena = scannerEntrada.nextLine();

            double numeroCadena = Double.valueOf(cadena);
            System.out.println("Número decimal obtenido: " + numeroCadena);

        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no es un número válido");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void ConversionCadenaNumero(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese una cadena que represente un número: ");
            String cadenaNumerica = scannerEntrada.nextLine();

            int numeroCadenaNumerica = Integer.parseInt(cadenaNumerica);
            System.out.println("Numero entero obtenido: " + numeroCadenaNumerica);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no es un número válido");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void VerificandoCadenaSoloLetras(Scanner scannerEntrada){
        System.out.println("Ingrese una cadena: ");
        String cadenaLetras = scannerEntrada.nextLine();

        boolean esLetra = true;

        for (int i=0; i<cadenaLetras.length();i++){
            char caracterCadena = cadenaLetras.charAt(i);

            if(!Character.isLetter(caracterCadena)){
                esLetra=false;
                break;
            }
        }

        if(esLetra){
            System.out.println("La cadena solo tiene letras");
        } else {
            System.out.println("La cadena no solo tiene letras");
        }
    }

    private static void ContandoEspaciosEnBlanco(Scanner scannerEntrada){
        System.out.println("Introduzca una cadena: ");
        String cadenaEspacioBlanco = scannerEntrada.nextLine();

        int numeroEspacioBlanco =0;

        for (int j=0;j<cadenaEspacioBlanco.length();j++){
            char caracterCadenaEspacioBlanco = cadenaEspacioBlanco.charAt(j);
            
            if(Character.isWhitespace(caracterCadenaEspacioBlanco)){
                numeroEspacioBlanco++;
            }
        }

        if(numeroEspacioBlanco==0){
            System.out.println("La cadena " + "'"+ cadenaEspacioBlanco +"'"+ " no tiene espacios en blanco");
        } else {
            System.out.println("La cadena " +"'"+ cadenaEspacioBlanco + "'"+" tiene " + numeroEspacioBlanco + " espacios en blanco");
        }
    }

    private static void SumaDeNumeros(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese una cadena que represente un número entero: ");
            String numeroEntero = scannerEntrada.nextLine();

            System.out.println("Ingrese una cadena que represente un número decimal: ");
            String numeroDecimal = scannerEntrada.nextLine();

            double sumaNumeros = Double.valueOf(numeroDecimal)+Integer.valueOf(numeroEntero);;

            System.out.println("La suma de los valores " + numeroDecimal + " y " + numeroEntero + " es: " + sumaNumeros);

        } catch (InputMismatchException e) {
            System.out.println("Error: Valor ingresado no es numerico");
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no es un número válido");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void ContandoDigitosNumero(Scanner scannerEntrada){
        System.out.println("Introduzca un numero: ");
        String numeroIntroducido = scannerEntrada.nextLine();

        int digitosNumero=0;
        
        for (int k=0; k<numeroIntroducido.length();k++){
            if(Character.isDigit(numeroIntroducido.charAt(k))){
                digitosNumero++;
            }
        }
        System.out.println("El numero de digitos de " + numeroIntroducido + " es: " + digitosNumero);

    }
}