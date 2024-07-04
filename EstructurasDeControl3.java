import java.util.Scanner;
import java.util.InputMismatchException;

public class EstructurasDeControl3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //DIVISIÓN SEGURA
        /*
        try {
            System.out.println("Ingrese el primer numero: ");
            Double numero1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo numero");
            Double numero2 = entrada.nextDouble();

            Double resultado = numero1/numero2;

            System.out.println("El resultado es: "+ resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre 0");
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresó formato incorrecto");
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresó letras o formato invalido");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally{
            entrada.close();
        }

        */

        //RESTA CON MANEJO DE EXCEPCIONES
        /*
        try {
            System.out.println("Ingrese el primer numero: ");
            Double numero1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo numero");
            Double numero2 = entrada.nextDouble();

            Double resultado = numero1-numero2;

            System.out.println("El resultado es: "+ resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: Numérico ");
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresó formato incorrecto");
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingresó letras o formato invalido");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally{
            entrada.close();
        }
            */

        
        //CONVERSIÓN CADENA A ENTERO
        /*
        try {
            System.out.println("Ingrese la cadena de caracteres que representa el númemro entero: ");
            String cadena = entrada.nextLine();
            int numerocadena=Integer.parseInt(cadena);
            System.out.println("El número ingresado es: "+numerocadena);
        } catch (NumberFormatException e){
            System.out.println("Error: La cadena no tiene el formato adecuado");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally{
            entrada.close();
        }
            */


        //EJERCICIO COMPLEMENTARIO: CONVERSIÓN DE CALIFICACIONES
        System.out.println("Ingrese la calificación numérica: ");
        try{
            int calificacion = entrada.nextInt();
            switch (calificacion) {
                case 1:
                    System.out.println("Muy deficiente");
                    break;
                case 2:
                    System.out.println("Deficiente");
                    break;
                case 3:
                    System.out.println("Suficiente");
                    break;
                case 4:
                    System.out.println("Notable");
                    break;
                case 5:
                    System.out.println("Sobresaliente");
                    break;
                default:
                System.out.println("Calificación fuera del rango");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresó formato incorrecto");
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        } finally{
            entrada.close();
        }
    }
    
}
