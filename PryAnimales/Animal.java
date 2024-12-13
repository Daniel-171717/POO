package PryAnimales;

public class Animal {
    public String Nombre;
    public int Edad;

    public Animal(String Nombre, int Edad)
    {
        this.Nombre=Nombre;
        this.Edad=Edad;
    }

    public void Comer()
    {
        System.out.println( Nombre +" ESTA COMIENDO");
    }
    
    public void Dormir()
    {
        System.out.println("El "+Nombre+" ESTA DURMIENDO");
    }
}
