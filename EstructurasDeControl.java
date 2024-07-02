import java.util.Scanner;

public class EstructurasDeControl {
public static void main(String[] args) {
    Scanner dato = new Scanner (System.in);

    //CLASIFICACIÓN DE NÚMEROS
    /*
    System.out.println("Ingrese un número: ");
    if(dato.hasNextDouble()){
        Double numero = dato.nextDouble();

        if (numero>0){
            System.out.println("El número es positivo");
        } else if (numero<0){
            System.out.println("El número es negativo");
        } else if (numero ==0){
            System.out.println("El número es cero");
        } else {
            System.out.println("No es real");
        }
    } else {
        System.out.println("Dato ingresado no es numérico");
    }
        */
        
    //PRACTICANDO CON ESTRUCTURAS DE CONTROL
    /*
    System.out.println("Ingrese un número entre 1 y 100: ");
    if (dato.hasNextDouble()){
        Double numeroIngresado = dato.nextDouble();

        if(0<=numeroIngresado &&numeroIngresado<60){
            System.out.println("F");
            System.out.println("Su calificación es: " + numeroIngresado);
        } else if (60<=numeroIngresado && numeroIngresado<70){
            System.out.println("D");
            System.out.println("Su calificación es: " + numeroIngresado);
        } else if (70<=numeroIngresado && numeroIngresado<80){
            System.out.println("C");
            System.out.println("Su calificación es: " + numeroIngresado);
        } else if (80<=numeroIngresado && numeroIngresado<90){
            System.out.println("B");
            System.out.println("Su calificación es: " + numeroIngresado);
        } else if (90<=numeroIngresado && numeroIngresado<=100){
            System.out.println("A");
            System.out.println("Su calificación es: " + numeroIngresado);
        } else {
            System.out.println("Número fuera del rango");
        }

    } else {
        System.out.println("No ingresó dato numérico");
    }
        */
    
    //DIVISIBILIDAD
    /*
    System.out.println("Ingrese un número: ");
    if(dato.hasNextDouble()){
        Double numeroDivisible = dato.nextDouble();

        String numero5 = (numeroDivisible%5)==0 ? "Es divisible por 5 " : "No es divisible por 5";
        String numero3 = (numeroDivisible%3)==0 ? "Es divisible por 3 " : "No es divisible por 3";
        String numero15 = (numeroDivisible%15)==0 ? "Es divisible por 15 " : "No es divisible por 15";

        if(numeroDivisible%5==0 && numeroDivisible%3==0){
            System.out.println("Es divisible por 5 y 3");
        } else if (numeroDivisible%3==0){
            System.out.println("Es divisible por 3");
        } else if (numeroDivisible%5==0){
            System.out.println("Es divisible por 5");
        } else{
            System.out.println("No es divisible por 3, 5 ni ambos");
        }

    } else {
        System.out.println("Dato ingresado no es numérico");
    }
        */

    
    //VERIFICACIÓN DE CONTRASEÑA
    /*
    String passwordPredefinido = "password";
    System.out.println("Ingrese la contraseña: ");

    if(dato.hasNextLine()){
        String passwordIngresado = dato.nextLine();
        if (passwordIngresado.equals(passwordPredefinido)){
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    } else {
        System.out.println("Error");
    }
        */
    
    //CALCULO DE DESCUENTO
    /*
    System.out.println("Ingrese el precio del producto: ");
    if(dato.hasNextDouble()){
        Double precio = dato.nextDouble();

        if(precio>=100){
            precio = precio*0.90;
            System.out.println("El precio final es: "+ precio);
        } else{
            System.out.println("El precio final es: "+ precio);
        }

    } else {
        System.out.println("Dato ingresado no es numérico");
    }
        */

    
    //DETERMINACIÓN DE EDADES
    System.out.println("Ingrese su edad: ");
    if(dato.hasNextDouble()){
        Double edad = dato.nextDouble();

        if (0<=edad && edad<18){
            System.out.println("Eres menor de edad");
        } else if (18<=edad && edad<65){
            System.out.println("Eres adulto");
        } else if (edad>=65){
            System.out.println("Eres adulto mayor");
        } else {
            System.out.println("Edad no valida");
        }
    } else {
        System.out.println("Dato ingresado no es numérico");
    }

    dato.close();
}
}