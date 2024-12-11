package PryEXAMEN;

public class BoletoGeneral {
    public String Nombre;
    public double Precio;

    public BoletoGeneral(String Nombre, double Precio)
    {
        this.Nombre=Nombre;
        this.Precio=Precio;
    }

    public String GetNombre()
    {
        return Nombre;
    }

    public void SetNombre(String Nombre)
    {
        this.Nombre=Nombre;
    }

    public double GetPrecio()
    {
        return Precio;
    }

    public void SetPrecio(double Precio)
    {
        this.Precio = Precio;
    }

    public void Calcular(double Dato)
    {
        double Total = Dato*Precio;
        System.out.println("EL PRECIO TOTAL DEL BOLETO GENERAL "+Nombre+" ES: "+Total);
    }

}
