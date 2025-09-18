import java.util.Scanner;

public class Practica_scanner {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("hola!, ingresa tu nombre y apellido por favor: ");
        nombre = scanner.nextLine();
        System.out.println("edad: ");
        edad = scanner.nextInt();
        scanner.close();
    }
}