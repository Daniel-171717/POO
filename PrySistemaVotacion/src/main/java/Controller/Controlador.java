
package Controller;

import Model.CiudadanoModel;
import Model.RegistroModel;
import View.VistaView;
import java.util.Scanner;

public class Controlador {
    
    private CiudadanoModel ciudadano;
    private RegistroModel registro = new RegistroModel() ;
    private VistaView vista;
    Scanner scanner = new Scanner(System.in);

    public Controlador() {
    }
    
    public Controlador(CiudadanoModel ciudadano, VistaView vista) {
        this.ciudadano = ciudadano;
        this.vista = vista;
    }
    
    public void Iniciar()
    {
        boolean repetidor = true;
        int opcion1;
        int contador1 = 0, contador2 = 0, contador3 =0;
        int ci;
        String datos;
        do {    
            
            ci = vista.IngresarCI("INGRESE SU NUMERO DE CEDULA: ");
            datos = vista.IngresarDatos("INGRESE SU NOMBRE Y APELLIDO: ");
            scanner.nextLine();
            System.out.println("INGRESE UNA DE LAS OPCIONES");
            opcion1=vista.Opciones();
            switch (opcion1) {
                case 1:
                        ciudadano = new CiudadanoModel(datos, ci);
                        registro.RegistroCiudadano(ciudadano);
                        registro.RegistroVotos(1);
                        contador1++;
                        
                    break;
                case 2:
                        ciudadano = new CiudadanoModel(datos, ci);
                        registro.RegistroCiudadano(ciudadano);
                        registro.RegistroVotos(2);
                        contador2++;
                        
                    break;
                case 3:
                        ciudadano = new CiudadanoModel(datos, ci);
                        registro.RegistroCiudadano(ciudadano);
                        registro.RegistroVotos(3);
                        contador3++;
                       
                    break;
                case 4:
                        if(contador1>contador2 && contador1>contador3)
                        {
                            System.out.println("EL GANADOR ES DANIEL NOBOA");
                            System.out.println("CON ESTE NUMERO DE VOTOS: "+contador1);
                            System.out.println("CON UN PORCENTAJE DE: "+(contador1/registro.Porcentaje())*100);
                            repetidor = false;
                        }
                        
                        if(contador2>contador1 && contador2>contador3)
                        {
                            System.out.println("EL GANADOR ES LUIZA GONZALES");
                            System.out.println("CON ESTE NUMERO DE VOTOS: "+contador2);
                            System.out.println("CON UN PORCENTAJE DE: "+(contador2/registro.Porcentaje())*100);
                            repetidor = false;
                        }
                        
                        if(contador3>contador2 && contador3>contador1)
                        {
                            System.out.println("EL GANADOR ES ANDREA GONZALEZ");
                            System.out.println("CON ESTE NUMERO DE VOTOS: "+contador3);
                            System.out.println("CON UN PORCENTAJE DE: "+(contador3/registro.Porcentaje())*100);
                            repetidor = false;
                        }
                    break;
                case 5:
                        repetidor = false;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (repetidor);
        
    }
}
