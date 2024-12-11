package PryEXAMEN;

public class BoletoVIP {
    public String Nombre;
    public double Precio;
    public BoletoVIP()
    {
        Nombre = "BAD BUNNY";
        Precio = 250;
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
        this.Precio=Precio;
    }

    public void Calcular(double Dato)
    {
        double Total = Dato*Precio;
        System.out.println("EL PRECIO TOTAL DEL BOLETO VIP "+Nombre+" ES: "+Total);
    }
}