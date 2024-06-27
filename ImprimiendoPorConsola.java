import java.time.LocalDate;

public class ImprimiendoPorConsola {
    public static void main(String[] args){
        System.out.println("\n"+"Bienvenido a tu curso de Java");
        //Sistem es una clase que representa al sistema
        //Out es un atributo de esa clase (objeto) que representa salida del sistema
        //Main es un método que publica línea en consola
        //printLn imprime
        String nombre = "Ruth";
        int edad= 26;

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi edad es "+ edad);


        //UTILIZANDO VARIABLES
        boolean booleano = true;
        char caracteres = 'A';
        String letras = "Hola mundo";
        Integer numero = 20;
        Long numeroLargo64Bits = 9L;
        float numeroDecimal = 3.14f;
        System.out.println(letras + ", mi nombre es " + caracteres + " y tengo " + numero + ". Estoy aprendiendo a programar y aprendí a poner el número pi en java: " + numeroDecimal);


        //SELECCIONAR TIPO DE DATO ADECUADO EN JAVA
        double temperatura = 20.6;
        double precioTienda = 15.250;
        String nombreCompletoPersona = "Nena Araujo Carhuancho";
        LocalDate fechaNacimiento = LocalDate.of(2017, 06, 24);
        Long numeroHabitantes = 30000000000000L;
        Integer duracionPeliculaMin = 95;
        boolean articuloDisponible = false;
        double distanciaEntreCiudades = 3.5;
        String numeroTelefono = "+51 95847633";
        Integer cantidadProductoTienda = 4;

        //EJERICIO COMPLEMENTARIO
        String mensajeBienvenida = "Bienvenida a Java";
        double temperaturaActual = 19;
        boolean dataLogico = true;

        System.out.println("Mensaje de bienvenida: " + mensajeBienvenida);
        System.out.println("Temperatura actual: "+ temperaturaActual);
        System.out.println("Data lógico: " + dataLogico);





    
    
    }
}