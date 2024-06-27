import java.util.Scanner;

public class EjerciciosComplementariosScannerOperadores {
    public static void main(String[] args){
        //VERIFICACIÓN DE EDAD
        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese su año de nacimiento: ");
        Integer anioNacimiento = datos.nextInt();

        final Integer anioActual = 2024;

        String calculoEdad = ((anioActual-anioNacimiento)>=18) ? "mayor de edad" : "menor de edad";

        System.out.println("Usted es " + calculoEdad);
    
    

        //CALCULADORA AREA Y PERÍMETRO
        System.out.println("Ingrese la base del rectágulo: ");
        Double baseRectangulo = datos.nextDouble();
        System.out.println("Ingrese la altura del rectángulo: ");
        Double alturaRectangulo = datos.nextDouble();

        Double perimetro = (2*baseRectangulo) + (2*alturaRectangulo);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        Double area = baseRectangulo*alturaRectangulo;
        System.out.println("El área del rectángulo es: " + area);

    
        datos.close();
    }    
}
