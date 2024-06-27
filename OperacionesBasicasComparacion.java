import java.util.Scanner;

public class OperacionesBasicasComparacion {
    public static void main(String[] args){
        //Operadpres básicos: +,-,*,/,%

        Scanner operaciones = new Scanner (System.in);
        /*
        System.out.println("1. Suma, 2. Resta, 3. Multiplicación, 4. División, 5. Modulo");
        System.out.println("Por favor ingrese la opción a operar: ");
        Integer opcion = operaciones.nextInt();
        System.out.println("Ingrese el primer número a operar: ");
        Double primernum = operaciones.nextDouble();
        System.out.println("Ingrse el segundo número a operar: ");
        Double segundonum = operaciones.nextDouble();

        if (opcion ==1){
            System.out.println("La suma es: " +(primernum+segundonum));
        } else if (opcion ==2){
            System.out.println(("La resta es: ") + (primernum-segundonum));
        } else if (opcion == 3){
            System.out.println("La multiplicación es: " + (primernum*segundonum));
        } else if (opcion == 4){
            System.out.println("La división es: " + (primernum/segundonum));
        } else if (opcion == 5){
            System.out.println("El módulo es: " + (primernum%segundonum));
        } else {
            System.out.println("Ingresó opción no valida");
        }
        */

        //Operadores de comparación: ==, !=, >, <, >=, =<, &&, ||, !, ?:

        System.out.println("Ingrese dos números: ");
        System.out.println("Primer número a: ");
        Integer a = operaciones.nextInt();
        System.out.println("Segundo número b: ");
        Integer b = operaciones.nextInt();

        //El primer número es mayor al segundo número
        System.out.println("a > b: " + (a>b));
        //El primer número es distinto al segundo número
        System.out.println("a != b: " + (a != b));
        //El primer número es divisible por 2
        System.out.println("a % 2: " + (a%2));

        System.out.println("Ingrese dos números más: ");
        System.out.println("Tercer número c: ");
        Integer c = operaciones.nextInt();
        System.out.println("Cuarto número d: ");
        Integer d = operaciones.nextInt();

        //El primer número es mayor al segundo número y el tercer número es mayor al cuarto
        System.out.println("a > b && c > d: " + ((a > b)&&(c >d)));
        //El primer número es mayor al segundo número o el tercer número es mayor al cuarto
        System.out.println("a > b || c > d: "+ ((a>b)||(c>d)));

        operaciones.close();
    }



} 
