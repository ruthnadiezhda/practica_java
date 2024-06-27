import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args){
        //New crea una nueva instancia de la clase
        Scanner pepe = new Scanner(System.in);
        
        //Usuario ingrese su nombre
        System.out.println("Por favor ingrese un nombre: ");
        String nombre = pepe.nextLine();

        //Usuario ingrese su edad
        System.out.println("Por favor ingrese una edad: ");
        Integer edad = pepe.nextInt();

        //Impresión
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);

    }
    
}

