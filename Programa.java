/**
 * Programa.java
 * Autor: Linus Torvalds
**/
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
				    verInforme();
                    break;
                case "X":
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
				
				if (numero.isEmpty()) {
					break;
				}

                System.out.print("\tPrecio: ");
                Float precio = Float.valueOf(teclado.nextLine());

                Envio envio = new Envio(numero, precio);
                envios[iEnvios++] = envio;

                System.out.println("Registro OK");
            } catch (Exception excepcion) {
                System.out.println("Registro KO");
            }
        }
    }
	
	public static void verInforme (){
        Float suma = 0f;
		System.out.println ("\nINFORME DE ENVÍOS");
		for (int i = 0; i < iEnvios; i++){
			System.out.println ("\t" + (i + 1) + ". " + envios[i].verComoString());
            suma += envios[i].precio;
		}
		System.out.println ("\t---------------------");
		System.out.println ("\tTOTAL:\t\t" + suma + "€\n");
    }

    public static String verMenu(){
        System.out.println("APLICACIÓN DE PaqueteMetes versión 1.0");
        System.out.println("\t1. Registrar envío");
        System.out.println("\t2. Ver Informe de Envío");
        System.out.println("\tX. Salir");
        System.out.print("\tOpción: ");
        return teclado.nextLine();
    }
}