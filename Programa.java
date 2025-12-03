import java.util.Scanner;

public class Programa {
    static Scanner teclado = new Scanner(System.in);
    static Envio[] envios = new Envio[50];
    static Integer iEnvios = 0;
    public static void main(String[] args) {
        Boolean repetirMenu = true;

        // Menú
        do {
            switch (verMenu()) {
                case "1":
                    resgistrarEnvio();
                    break;
                case "2": 
                    break;
                case "X":
                    break;
                case "x":
                    repetirMenu = false;
                    break;
                default:
                    System.out.println("Opción desconocida.");
            }
        } while (repetirMenu);

        teclado.close();
        System.out.println("Fin del programa.");
    }

    public static void resgistrarEnvio (){
        while (true) {
            try {
                System.out.println("\nRegistro de envío");
                System.out.print("\tNúmero: ");
                String numero = teclado.nextLine();

                System.out.print("\tPrecio: ");
                Float precio = Float.valueOf(teclado.nextLine());

                Envio envio = new Envio();
                envio.numero = numero;
                envio.precio = precio;
                envios[iEnvios++] = envio;

                System.out.println("Registro OK");
            } catch (Exception excepcion) {
                System.out.println("Registro KO");
            }
        }
    }

    public static String verMenu(){
        System.out.println("APLICACIÓN DE PaqueteMetes versión 1.0");
        System.out.println("\t1. Registrar envío");
        System.out.println("\t2. Ver Informe de Envío");
        System.out.println("\tX. Salir");
        System.out.print("\tOpción: ");
        return teclado.nextLine();
    }

    public static void verInforme (){
        
    }
}