package Persona;

public class Hijo {
        private double Altura;
        private int Edad;
        private String Nombre;
        private String Profecion;

    public void SetNombreHijo (String Nombre)
    {
        this.Nombre=Nombre;
    }
    public String  GetNombreHijo()
    {
        return Nombre;
    }

    public void SetEdadHijo (int Edad)
    {
        this.Edad=Edad;
    }
    public int GetEdadHijo()
    {
        return Edad;
    }

    public void SetAlturaHijo (double Altura)
    {
        this.Altura=Altura;
    }
    public double  GetAlturaHijo()
    {
        return Altura;
    }

    public void SetProfecionHijo (String Profecion)
    {
        this.Profecion=Profecion;
    }
    public String GetProfecionHijo()
    {
        return Profecion;
    }

}
