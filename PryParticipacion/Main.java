package PryParticipacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio;
        int tronco;
        System.out.println("\t\tBIENVENIDO A LA CREACION DE NUESTRO ARBOL DE NAVIDAD");
        System.out.print("INGRESA UN NUMERO PARA CREAR EL ARBOL: ");
        inicio=scanner.nextInt();

        ArbolNavidad forma = new ArbolNavidad(inicio);
        forma.forma();
    }
}
