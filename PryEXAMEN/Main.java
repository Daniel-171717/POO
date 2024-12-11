package PryEXAMEN;
import java.net.SocketTimeoutException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        BoletoVIP Cantidad1 = new BoletoVIP();
        int Opcion;
        double CANTIDAD,Precio;
        String Nombre;
        System.out.print("INGRESE NOMBRE DEL BOLETO GENERAL: ");
        Nombre = scanner.nextLine();
        System.out.print("INGRESE PRECIO DEL BOLETO GENERAL: ");
        Precio = scanner.nextDouble();
        BoletoGeneral Cantidad = new BoletoGeneral(Nombre, Precio);
        System.out.println("CONCIERTO BAD BUNNY");
        System.out.println("1. BOLETO GENERAL");
        System.out.println("2. BOLETO VIP");
        System.out.print("ELIJA UNA OPCION: ");
        Opcion = scanner.nextInt();

        switch (Opcion) {
            case 1:
                    BoletoGeneral general = new BoletoGeneral(Nombre, Precio);
                    System.out.print("INGRESE LA CANTIDAD DE BOLETOS: ");
                    CANTIDAD = scanner.nextDouble();
                    Cantidad.Calcular(CANTIDAD);
                break;
            case 2:
                    BoletoVIP vip = new BoletoVIP(); 
                    System.out.print("INGRESE LA CANTIDAD DE BOLETOS: ");
                    CANTIDAD = scanner.nextDouble();
                    Cantidad1.Calcular(CANTIDAD);
                break;
            default:
                break;
        }
    }
    
}
