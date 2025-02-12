
package View;

import java.util.Scanner;

public class VistaView {
    
    Scanner scanner = new Scanner(System.in);
    
    public int IngresarCI (String mensaje)
    {
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    
    public String IngresarDatos (String mensaje)
    {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    
    public int Opciones()
    {
        System.out.println("\t\tELIGE UN CANDIDATO");
        System.out.println("1. DANIEL NOBOA DEL PATIDO ADN");
        System.out.println("2. LUIZA GONZALES DEL R5");
        System.out.println("3. ANDREA GONZALES DEL SOCIAL CRISTIANO");
        System.out.println("4. MOSTRAR GANADOR");
        System.out.println("5. CERRAR");
        return scanner.nextInt();
    }
}
