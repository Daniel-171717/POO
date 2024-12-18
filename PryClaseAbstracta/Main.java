package PryClaseAbstracta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Perro;
        String Pez;
        int EdadP;
        int EdadPZ;
        System.out.print("INGRESA EL NOMBRE DEL PERRO: ");
        Perro=scanner.nextLine();
        System.out.print("INGRESA LA EDAD DE LA MASCOTA: ");
        EdadP=scanner.nextInt();
        while(EdadP<0)
        {
            System.out.println("ERROR: INGRESE SOLO NUMEROS MATORES A CERO");
            System.out.print("INGRESA LA EDAD DE LA MASCOTA: ");
            EdadP=scanner.nextInt();
        }
        Perro perro = new Perro(Perro, EdadP);

        System.out.print("INGRESA EL NOMBRE DEL PEZ: " );
        Pez=scanner.nextLine();
        scanner.nextLine();
        System.out.print("INGRESA LA EDAD DE LA MASCOTA: ");
        EdadPZ=scanner.nextInt();
        while(EdadPZ<0)
        {
            System.out.println("ERROR: INGRESE SOLO NUMEROS MATORES A CERO");
            System.out.print("INGRESA LA EDAD DE LA MASCOTA: ");
            EdadPZ=scanner.nextInt();
        }
        Pez pez = new Pez(Pez, EdadPZ);

        perro.Jugar();
        perro.MostrarCarino();
        pez.Comer();
        pez.Dormir();

    }
}
