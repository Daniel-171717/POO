package PryEmpresa;
import PryEmpresa.Empleado;
public class Main {
    public static void main(String[] args)
    {
        Empresa empresa = new Empresa("Fire of Death", "Av. Gonzalo Plata", "FireofDeath@gmail.com", 1937284650);
        Empleado empleado1 = new Empleado("Alvaro Diaz", 1658479123, 875.90);
        Empleado empleado2 = new Empleado("Angel Cardenas", 1245789632, 1255.75);
        empresa.AgregarEmpleado(empleado1);
        empresa.AgregarEmpleado(empleado2);
        empresa.DatosEmpresa();
        System.out.println("\t\tINFORMACION DE EMPLEADO");
        empleado1.DatosEmpleado();
        empleado2.DatosEmpleado();
    
    }
}
