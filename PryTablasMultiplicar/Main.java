package PryTablasMultiplicar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Numero;
        int Opcion;
        System.out.println("\t\tBIENVENIDO");
        System.out.print("INGRESE EL NUMERO HASTA EL CUAL DESEAS MULTPIlICAR: ");
        Numero=scanner.nextInt();
        System.out.println("1. MOSTRAR TABLAS DE MULTIPLICAR EN ORDEN DECENDENTE.");
        System.out.println("2. MOSTRAR TABLAS DE MILTIPLICAR.");
        System.out.println("3. MOSTRAR SIMA DE CADA RESULTADP DE LAS TABLAS Y LA SUMA TOTAL DE TODAS LAS TABLAS");
        System.out.print("ELIJA UUNA DE MUESTRAS OPCIONES: ");
        Opcion=scanner.nextInt();
        switch (Opcion) {
            case 1:
                    Multiplicar tablasI = new TablasI(Numero);
                    tablasI.Multiplicar();
                break;
            case 2:
                    Multiplicar tablas = new Tablas(Numero);
                    tablas.Multiplicar();
                break;
            case 3:
                    Multiplicar tablasS = new TablasS(Numero);
                    tablasS.Multiplicar();
                break;
            default:
                break;
        }
    }
}
