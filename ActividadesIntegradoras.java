import java.util.Scanner;

public class ActividadesIntegradoras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Identificador de número par o impar
        /*
        System.out.println("Ingrese un número: ");
        
        if(entrada.hasNextInt()){
            int numeroDado = entrada.nextInt();

            if (numeroDado>0){
                String comprobacion = (numeroDado % 2) == 0 ? "El número es par":"El número es impar";
            System.out.println(comprobacion);
            } else if (numeroDado == 0){
                System.out.println("El número es 0, el resto sería indefinido");
            } 
            else{
                System.out.println("El número es negativo, sorry bro");
            }
        } else {
            System.out.println("No ingresó un número");
        }
        */


        //Calculadora básica
        System.out.println("Ingrese el primer número a caluclar: ");
        if(entrada.hasNextInt()){
            int primerNumero = entrada.nextInt();
            System.out.println("Ingrese el segundo número a calcular: ");
            if (entrada.hasNextInt()){
                int segundoNumero=entrada.nextInt();
                int resultadoOperacion;

                System.out.println("Escoga la opción:" + "\n" + "1.Suma"+ "\n" + "2.Resta"+ "\n" + "3.Multiplicación"+ "\n" + "4.División ");
                if(entrada.hasNextInt()){
                    int opcionEscogida = entrada.nextInt();
                    if(opcionEscogida==1){
                        resultadoOperacion=primerNumero+segundoNumero;
                        System.out.println("La suma de los números es: " + resultadoOperacion);
                    } else if (opcionEscogida == 2){
                        resultadoOperacion=primerNumero-segundoNumero;
                        System.out.println("La rest de los números es: " + resultadoOperacion);
                    } else if (opcionEscogida == 3){
                        resultadoOperacion=primerNumero*segundoNumero;
                        System.out.println("La multiplicación de los números es: " + resultadoOperacion);
                    }else if (opcionEscogida == 4){
                        if (segundoNumero != 0){
                            resultadoOperacion=primerNumero/segundoNumero;
                            System.out.println("La división de los números es: " + resultadoOperacion);
                        } else {
                            System.out.println("No se puede dividir entre 0 amix :D");
                        }
                    } else {
                        System.out.println("Opción no valida");
                    }
                } else {
                    System.out.println("Opción no valida");
                }
            } else {
                System.out.println("No es un número, dato invalido");
            }
        } else {
            System.out.println("No es un número, dato invalido");
        }


    
        entrada.close();

    }

}