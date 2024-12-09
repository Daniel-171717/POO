package PryRecuerdos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String participante1= new String();
        String partisioante2= new String();
        int opcion;
        System.out.print("INGRESA PARTICIPANTE 1: ");
        participante1=scanner.nextLine();
        System.out.print("INGRESA PARTICIOANTE 2: ");
        partisioante2=scanner.nextLine();

        System.out.print("INGRESA EL NUMERO DE RECUERDOS QUE DESEAN GUARDAR: ");
        opcion=scanner.nextInt();
        scanner.nextLine();
        String [] recuerdosP1 = new String[opcion];
        System.out.println("\t\tRECUERDOS PARTICIPANTE 1");
        int count1=0;
        for(int i=0;i<opcion;i++)
        {
            System.out.print("INGRESA TUS RECUERDOS: ");
            recuerdosP1[i]=scanner.nextLine();
            count1++;
        }
        String [] recuerdosP2 = new String[opcion];
        System.out.println("\t\tRECUERDOS PARTICIPANTE 2");
        int count2 =0;
        for(int i=0;i<opcion;i++)
        {
            System.out.print("INGRESA TUS RECUERDOS ["+(i+1)+"]: ");
            recuerdosP2[i]=scanner.nextLine();
            count2++;
        }

        System.out.println("\t\tRECUERDOS CONVINADOS");
        for (int i=0;i<opcion;i++)
        {
            System.out.println("TUS RECUERDOS CONVINADOS SON: "+recuerdosP1[i]+","+recuerdosP2[i]);
        }
    }
}
