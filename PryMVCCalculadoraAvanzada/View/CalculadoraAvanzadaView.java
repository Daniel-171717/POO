package PryMVCCalculadoraAvanzada.View;

import java.util.Scanner;

public class CalculadoraAvanzadaView {
    Scanner scanner = new Scanner(System.in);

    public int IngresaDatos(String mensaje)
    {
        System.out.print(mensaje);

        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR. DEBE INGRESAR NUMEROS");
            scanner.next();
        }
        return (Integer) null;
        
    }

    public void MostrarDatos (int resultado)
    {
        System.out.println("EL RESULTADO ES: "+resultado);
    }
}
