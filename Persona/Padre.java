package Persona;

public class Padre{
        private double Altura;
        private int Edad;
        private String Nombre;
        private String Profecion;

    public void SetNombre (String Nombre)
    {
        this.Nombre=Nombre;
    }
    public String  GetNombre()
    {
        return Nombre;
    }

    public void SetEdad (int Edad)
    {
        this.Edad=Edad;
    }
    public int GetEdad()
    {
        return Edad;
    }

    public void SetAltura (double Altura)
    {
        this.Altura=Altura;
    }
    public double  GetAltura()
    {
        return Altura;
    }

    public void SetProfecion(String Profecion)
    {
        this.Profecion=Profecion;
    }
    public String GetProfecion()
    {
        return Profecion;
    }

}