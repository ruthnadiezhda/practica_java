import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadesIntegradoras2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //DESAFIO 1
        //ConversionUnidadesTemperatura(entrada);

        //DESAFIO 2
        ValidacionDeContraseña (entrada);
    }

    private static void ConversionUnidadesTemperatura(Scanner scannerEntrada){
        try {
            System.out.println("Ingrese la temperatura: ");
            double temperatura = scannerEntrada.nextDouble();
            
            System.out.println("Ingrese la unidad de medida: ");
            String unidad = scannerEntrada.next();

            if (unidad.equals("C") || unidad.equals("F")){
                if(unidad.equals("C")){
                    double temperaturaFinal = ((temperatura*9)/5)+32;
                    System.out.println(temperatura+" grados Celcius equivale a " + temperaturaFinal +" grados Fahrenheit");
                } else if (unidad.equals("F")){
                    double temperaturaFinal = ((temperatura-32)*5)/9;
                    System.out.println(temperatura + " grados Fahrenheit equivale a " + temperaturaFinal + " grados Celcius");
                } else {
                    System.out.println("Error: No ingresó bien la unidad de medida");
                }
            } else{
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit");
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Temperatura no valida. Debe ingresar una temperatura numerica, no una cadena");
        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no valida. Ingrese una temperatura numerica");
        }catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    private static void ValidacionDeContraseña(Scanner scannerEntrada){
        
        System.out.println("Ingrese su contraseña: ");
        String contraseña = scannerEntrada.nextLine();

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caracterEspecial = false;

        for (char letra : contraseña.toCharArray()) {
            if (Character.isUpperCase(letra)) {
                mayuscula = true;
            } else if (Character.isLowerCase(letra)) {
                minuscula = true;
            } else if (Character.isDigit(letra)) {
                numero = true;
            } else if (!Character.isLetterOrDigit(letra)) {
                caracterEspecial = true;
            }
        }

        if(contraseña.length()<8){
            System.out.println("Contraseña no segura. Debe tener al menos 8 caracteres");
        } 
        if (!mayuscula){
            System.out.println("Contraseña no segura. Debe contener al menos una letra mayúscula");
        } 
        if (!minuscula){
            System.out.println("Contraseña no segura. Debe contener al menos una letra minúscula");
        } 
        if(!numero){
            System.out.println("Contraseña no segura. Debe contener al menos un número");
        } 
        if (!caracterEspecial){
            System.out.println("Contraseña no segura. Debe contener al enos un carácter especial");
        }
        if(contraseña.length()>=8 && mayuscula && minuscula && numero && caracterEspecial){
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        }


    }
}
