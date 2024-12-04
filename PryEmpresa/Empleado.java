package PryEmpresa;

public class Empleado {
    private String NombreEmpleado;
    private long CI;
    private double Salario;

    public Empleado(String NombreEmpleado, long CI, double Salario)
    {
        this.NombreEmpleado=NombreEmpleado;
        this.CI=CI;
        this.Salario=Salario;
    }

    public String GetNombreEmpleado()
    {
        return NombreEmpleado;
    }

    public void SetNombreEmpleado(String NombreEmpleado)
    {
        this.NombreEmpleado=NombreEmpleado;
    }

    public long GetCI()
    {
        return CI;
    }

    public void SetCI(long CI)
    {
        this.CI=CI;
    }

    public double GetSalario()
    {
        return Salario;
    }
    public void SetSalario(double Salario)
    {
        this.Salario=Salario;
    }

    public void DatosEmpleado()
    {
        System.out.println("NOMBRE: "+GetNombreEmpleado());
        System.out.println("CI: "+GetCI());
        System.out.println("SALARIO: "+GetSalario());
    }

}
