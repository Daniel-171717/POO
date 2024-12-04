package PryEmpresa;
import java.util.ArrayList;
import java.util.List;
import PryEmpresa.Empleado;;

public class Empresa {
    private String NombreEmpresa;
    private String Direccion;
    private String Email;
    private long RUC;
    private Empleado empleado;
    private List<Empleado> empleados;

    public Empresa(String NombreEmpresa, String Direccion, String Email, int RUC)
    {
        this.NombreEmpresa=NombreEmpresa;
        this.Direccion=Direccion;
        this.Email=Email;
        this.RUC=RUC; 
        empleados=new ArrayList<Empleado>();
    }

    public void AgregarEmpleado(Empleado empleado)
    {
        empleados.add(empleado);
    }

    public List<Empleado> ImprimirEmpleado()
    {

        return empleados;
    }

    public String GetNombreEmpresa()
    {
        return NombreEmpresa;
    }

    public void SetNombreEmpresa(String NombreEmpresa)
    {
        this.NombreEmpresa=NombreEmpresa;
    }

    public String GetDireccion()
    {
        return Direccion;
    }

    public void SetDireccion(String Direccion)
    {
        this.Direccion=Direccion;
    }

    public String GetEmail()
    {
        return Email;
    }

    public void SetEmail(String Email)
    {
        this.Email=Email;
    }

    public long GetRUC()
    {
        return RUC;
    }

    public void SetRUC(long RUC)
    {
        this.RUC=RUC;
    }

    public void DatosEmpresa()
    {
        System.out.println("\t\tINFORMACION DE LA EMPRESA");
        System.out.println("NOMBRE DE LA EMPRESA: "+GetNombreEmpresa());
        System.out.println("DIRECCION: "+GetDireccion());
        System.out.println("EMAIL: "+GetEmail());
        System.out.println("RUC: "+GetRUC());
    }
}
