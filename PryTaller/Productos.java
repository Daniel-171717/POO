package PryTaller;

public class Productos {
    private String nombre;
    private int cantidad;
    private double precio;

    public Productos (String nombre, int cantidad, double precio)
    {
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }

    public String GetProducto()
    {
        return nombre;
    }

    public void SetProducto (String nombre)
    {
        this.nombre=nombre;
    }

    public int GetCantidad()
    {
        return cantidad;
    }

    public void SetCantidad (int cantidad)
    {
        this.cantidad=cantidad;
    }

    public double GetPrecio()
    {
        return precio;
    }

    public void SetPrecio (double precio)
    {
        this.precio=precio;
    }

    public String ImprimirProducto()
    {
        return "Nombre: "+GetProducto()+"\nCantidad: "+GetCantidad()+""+"\nPrecio: "+GetPrecio();
    }
}
