package PryAnimales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Opciones;
        Scanner scanner= new Scanner(System.in);

        System.out.println("BIENVENIDO");
        System.out.println("ELIGE UNA DE LAS OPCIONES CON LAS QUE QUIERAS TRABAJAR");
        System.out.println("1. MAMIFEROS");
        System.out.println("2. AVES");
        System.out.println("3. REPTILES");
        System.out.print("ELIGE UNA DE LAS OPCIONES: ");
        Opciones= scanner.nextInt();
        scanner.nextLine();

      switch (Opciones) {
        case 1:
                String NombreM;
                int EdadM;
                String PelajeM;
                System.out.print("INGRESA EL NOMBRE DEL MAMIFERO: ");
                NombreM=scanner.nextLine();
                System.out.print("INGRESA LA EDAD DEL MAMIFERO: ");
                EdadM=scanner.nextInt();
                scanner.nextLine();
                System.out.print("INGRESA EL TIPO DE PELAJE DEL MAMIFERO: ");
                PelajeM=scanner.nextLine();
                Mamifero mamifero = new Mamifero(NombreM, EdadM, PelajeM);
                mamifero.Comer();
                mamifero.Amamantar();
            break;
        case 2:
                String NombreA;
                int EdadA;
                System.out.print("INGRESA EL NOMBRE DEL AVE: ");
                NombreA=scanner.nextLine();
                System.out.print("INGRESA LA EDAD DEL AVE: ");
                EdadA=scanner.nextInt();
                scanner.nextLine();
                System.out.print("INGRESA LA ENVERGADURA DE LAS ALAS DEL AVE: ");
                double Envergadura = scanner.nextDouble();
                Ave ave = new Ave(NombreA, EdadA, Envergadura);
                ave.Comer();
                ave.Volar();
            break;
        case 3:
                String NombreR;
                int EdadR;
                String TipoScamas;
                System.out.print("INGRESA EL NOMBRE DEL REPTIL: ");
                NombreR=scanner.nextLine();
                System.out.print("INGRESA LA EDAD DEL REPTIL: ");
                EdadR=scanner.nextInt();
                scanner.nextLine();
                System.out.print("INGRESA EL TIPO DE ESCAMAS DEL REPTIL: ");
                TipoScamas = scanner.nextLine();
                Reptil reptil = new Reptil(NombreR, EdadR, TipoScamas);
                reptil.Comer();
                reptil.Arrastrar();
                break;
        default:
            break;
      }

    }
    
}
