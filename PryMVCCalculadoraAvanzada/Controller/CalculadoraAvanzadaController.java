package PryMVCCalculadoraAvanzada.Controller;

import PryMVCCalculadoraAvanzada.Model.CalculadoraAvanzadaModel;
import PryMVCCalculadoraAvanzada.View.CalculadoraAvanzadaView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraAvanzadaController {
    private CalculadoraAvanzadaModel modelo;
    private CalculadoraAvanzadaView vista;
    private Scanner scanner = new Scanner(System.in);
    private String verificador;

    public CalculadoraAvanzadaController (CalculadoraAvanzadaModel modelo, CalculadoraAvanzadaView vista)
    {
        this.modelo=modelo;
        this.vista=vista;
    }
    
    public void Iniciar ()
    {
        boolean repeticion = false;
        System.out.println("\t\tBIENVENIDO");
        System.out.println("1. DESEAS REALIZAR UN OPERACION");
        System.out.println("2. SALIR");
        System.out.print("INGRESA UNA DE LAS OPCIONES: ");
        try {
            int opcion1 = scanner.nextInt();
            if(opcion1>0 && opcion1<3)
            {
                do {
                    switch (opcion1) {
                        case 1:
                                System.out.println("\t\tBIENVENIDO A NUESTRO APARTADO DE OPERACIONES");
                                int numero1 = vista.IngresaDatos("INGRESE EL PRIMER NUMERO: ");
                                int numero2 = vista.IngresaDatos("INGRESE EL SEGUNDO NUMERO: ");
                                System.out.println("1. SUMA");
                                System.out.println("2. RESTA");
                                System.out.println("3. MULTIPLICACION");
                                System.out.println("4. DIVICION");
                                System.out.println("5. POTENCIA");
                                System.out.println("6. RAIZ");
                                System.out.print("INGRESA UNA DE LAS OPCIONES: ");
                                try {
                                    int opcion = scanner.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            int resultado1 = modelo.Suma(numero1, numero2);
                                            vista.MostrarDatos(resultado1);
                                            break;
                                        case 2:
                                            int resultado2 = modelo.Resta(numero1, numero2);
                                            vista.MostrarDatos(resultado2);
                                            break;
                                        case 3:
                                            int resultado3 = modelo.Multiplicacion(numero1, numero2);
                                            vista.MostrarDatos(resultado3);
                                            break;
                                        case 4:
                                            int resultado4 = modelo.Dividir(numero1, numero2);
                                            if(resultado4==0)
                                            {
                                                System.out.println("ERROR. ES IMPOSIBLE DIVIDIR");
                                            }
                                            else
                                            {
                                                vista.MostrarDatos(resultado4);
                                            }
                                            break;
                                        case 5:
                                            int resultado5 = modelo.Potencia(numero1, numero2);
                                            vista.MostrarDatos(resultado5);
                                            break;
                                        case 6:
                                            int numero = vista.IngresaDatos("INGRESA EL NUMERO QUE SEAS SACAR LA RAIZ");
                                            int resultado6 = modelo.Raiz(numero);
                                            vista.MostrarDatos(resultado6);
                                            break;
                                        default:
                                            
                                            break;
                                    }
                                } catch (InputMismatchException e) {
                                    System.out.println("ERROR: INGRESE SOLO NUMERO ENTEROS");
                                }
                            break;
                        case 2:
                                repeticion=true;
                            break;
                        default:
                                System.out.println("\t\tBIENVENIDO\nLA OPCION QUE HA INGRESADO NO HA SIDO ENCONTRADA.\nELIGE NUEVAMENTE UNA DE LAS OPCIONES");
                                opcion1 = scanner.nextInt();
                            break;
                    }
    
                    System.out.print("DESEAS REALIZAR OTRA OPERACION: ");
                    verificador = scanner.next().toLowerCase();
                    scanner.nextLine();
                } while (verificador.equals("sí") || verificador.equals("si"));
            }
            else
            {
                System.out.println("LA OPCION ELIJIDA NO EXISTE");
            }

        } catch (InputMismatchException e) {
            System.out.println("ERROR: INGRESE SOLO NUMERO ENTEROS");
            scanner.next();
        } 
    }      
}
