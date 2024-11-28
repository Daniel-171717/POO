package PryCalculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        System.out.print("Ingresa Numero 1: ");
        numero1 = scanner.nextDouble();
        System.out.print("Ingresa Numero 2: ");
        numero2= scanner.nextDouble();
        operacion.Suma(numero1, numero2);
        operacion.Restar(numero1, numero2);
        operacion.Multiplicar(numero1, numero2);
        operacion.Dividir(numero1, numero2);
    }
}