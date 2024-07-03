import java.util.Scanner;

public class EstructurasDeControl2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        //DIAS DE LA SEMANA + VERIFICACIÓN DÍA HABIL
        /*
        System.out.println("Ingrese el número correspondiente al día de la semana");
        if(entrada.hasNextInt()){
            int diaSemana = entrada.nextInt();
            
            switch (diaSemana) {
                case 1:
                    System.out.println("Lunes");
                    System.out.println("Es día habil");
                    break;
                case 2:
                    System.out.println("Martes");
                    System.out.println("Es día habil");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    System.out.println("Es día habil");
                    break;
                case 4:
                    System.out.println("Jueves");
                    System.out.println("Es día habil");
                    break;
                case 5:
                    System.out.println("Viernes");
                    System.out.println("Es día habil");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } else {
            System.out.println("No ingresó el dato correctamente");
        }
        */

        
        //CONVERSIÓN DE CALIFICACIONES
        /*
        System.out.println("Ingrese la calificación numérica: ");
        if(entrada.hasNextInt()){
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
        } else {
            System.out.println("No ingresó dato numérico");
        }
            */

        //SELECCIÓN DE OPCIÓN
        /*
        System.out.println("Ingrese una opción: ");
        System.out.println("Opción 1: Guardar");
        System.out.println("Opción 2: Cargar");
        System.out.println("Opción 3: Salir");

        if(entrada.hasNextInt()){
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("Seleccionó la opción GUARDAR");
                case 2 -> System.out.println("Selecciono la opción CARGAR");
                case 3 -> System.out.println("Seleccionó la opción SALIR");
                default -> System.out.println("Opción no valida");
            }
        } else {
            System.out.println("Ingresó una opción no valida");
        }
            */
        
        
        //SELECCIÓN DE FIGURA GEOMÉTRICA Y PERIMETRO
        System.out.println("Ingrese la opción de la figura geométrica: ");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");

        Double area;
        Double perimetro;

        if (entrada.hasNextInt()){
            int opcionGeometrica = entrada.nextInt();

            switch (opcionGeometrica) {
                case 1:
                    System.out.println("ESCOGIÓ CIRCULO");
                    System.out.println("Escoga la opción: ");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro");
                    if(entrada.hasNextInt()){
                        int opcionOperacion = entrada.nextInt();
                        switch (opcionOperacion) {
                            case 1:
                                System.out.println("ESCOGIÓ AREA DEL CIRCULO");
                                System.out.println("Ingrese el radio del circulo: ");
                                if (entrada.hasNextDouble()){
                                    Double radio = entrada.nextDouble();
                                    if(radio>=0){
                                        area = Math.PI*radio;
                                        System.out.println("El area del circulo es: " + area);
                                    } else {
                                        System.out.println("El radio no puede ser negativo");
                                    }
                                } else {
                                    System.out.println("Ingresó dato no válido");
                                }
                                break;
                            case 2:
                                System.out.println("ESCOGIÓ PERÍMETRO DEL CIRCULO");
                                System.out.println("Ingrese el diametro del circulo");
                                if(entrada.hasNextDouble()){
                                    Double diametro = entrada.nextDouble();
                                    if(diametro>=0){
                                        perimetro = diametro*Math.PI;
                                        System.out.println("El perímetro del circulo es " + perimetro);
                                    } else {
                                        System.out.println("El diametro no puede ser negativo");
                                    }
                                } else {
                                    System.out.println("Ingresó dato no valido");
                                }
                                break;
                            default:
                            System.out.println("Opción no valida");
                                break;
                        }
                    }  else {
                        System.out.println("Escoga perimetro o area");
                    }   
                    break;
                case 2:
                    System.out.println("ESCOGIÓ CUADRADO");
                    System.out.println("Escoga la opción: ");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro");
                    if(entrada.hasNextInt()){
                        int opcionOperacion = entrada.nextInt();
                        switch (opcionOperacion){
                            case 1:
                                System.out.println("ESCOGIÓ AREA DEL CUADRADO");
                                System.out.println("Ingrese el lado del cuadrado: ");
                                if (entrada.hasNextDouble()){
                                    Double lado = entrada.nextDouble();
                                    if(lado>=0){
                                        area = lado*lado;
                                        System.out.println("El area del cuadrado es: " + area);
                                    } else {
                                        System.out.println("El lado no puede ser negativo");
                                    }
                                } else {
                                    System.out.println("Ingresó dato no válido");
                                }
                                break;
                            case 2:
                                System.out.println("ESCOGIÓ PERÍMETRO DEL CUADRADO");
                                System.out.println("Ingrese el lado del cuadrado: ");
                                if (entrada.hasNextDouble()){
                                    Double lado = entrada.nextDouble();
                                    if(lado>=0){
                                        perimetro = 4*lado;
                                        System.out.println("El perimetro del cuadrado es: " + perimetro);
                                    } else {
                                        System.out.println("El lado no puede ser negativo");
                                    }
                                } else {
                                    System.out.println("Ingresó dato no válido");
                                }
                                break;
                            default:
                            System.out.println("Debe escoger entre perímetro o area");
                                break;
                            }
                    }
                    else {
                        System.out.println("Opción no valida");
                    }
                    break;
                case 3:
                    System.out.println("ESCOGIÓ TRIANGULO");
                    System.out.println("Escoga la opción: ");
                    System.out.println("1. Area");
                    System.out.println("2. Perimetro");
                    if(entrada.hasNextInt()){
                        int opcionOperacion = entrada.nextInt();
                        switch (opcionOperacion){
                            case 1:
                                System.out.println("ESCOGIÓ EL AREA DEL TRIANGULO");
                                System.out.println("Ingrese la base del triangulo: ");
                                if (entrada.hasNextDouble()){
                                    Double base = entrada.nextDouble();
                                    if(base>=0){
                                        System.out.println("Ingrese la altura del triangulo: ");
                                        if(entrada.hasNextDouble()){
                                            Double altura = entrada.nextDouble();
                                            if(altura>=0){
                                                area = (base*altura)/2;
                                                System.out.println("El area del triangulo es: " + area);
                                            } else {
                                                System.out.println("La altura no puede ser negativa");
                                            }
                                        } else {
                                            System.out.println("Ingresó dato no valido");
                                        }
                                    } else {
                                        System.out.println("La base no puede ser negativa");
                                    }
                                } else {
                                    System.out.println("Ingresó dato no válido");
                                }
                                break;
                            case 2:
                                System.out.println("ESCOGIÓ EL PERIMETRO DEL TRIANGULO");
                                System.out.println("Ingrese el primer lado del triangulo");
                                if(entrada.hasNextDouble()){
                                    Double lado1 = entrada.nextDouble();
                                    if(lado1>=0){
                                        System.out.println("Ingrese el segundo lado: ");
                                        if(entrada.hasNextDouble()){
                                            Double lado2 = entrada.nextDouble();
                                            if (lado2>=0){
                                                System.out.println("Ingrese el tercer lado: ");
                                                if(entrada.hasNextDouble()){
                                                    Double lado3=entrada.nextDouble();
                                                    if(lado3>=0){
                                                        perimetro = lado1 + lado2 + lado3;
                                                        System.out.println("El perimetro del triangulo es: " + perimetro);
                                                    } else {
                                                        System.out.println("El lado no puede ser negativo");
                                                    }
                                                } else {
                                                    System.out.println("El lado debe ser un numero");
                                                }
                                            } else {
                                                System.out.println("El lado no puede ser negativo");
                                            }
                                        } else {
                                            System.out.println("El lado debe ser numerico");
                                        }
                                    } else {
                                        System.out.println("El lado no puede ser negativo");
                                    }
                                } else {
                                    System.out.println("El lado debe ser numerico");
                                }
                                break;
                            default:
                                System.out.println("Debe escoger entre el area o el perimetro");
                                break;
                        }
                    } else {
                        System.out.println("Escoga entre las opciones");
                    }
                    break;
                default:
                    System.out.println("No es opción valida");
                    break;
            }
        } else {
            System.out.println("Ingresó una opción no valida");
        }

        entrada.close();
    }
}
