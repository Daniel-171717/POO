package PryClaseAbstracta;

public abstract class Animal {
    protected String Nombre;
    protected int Edad;

    public Animal (String Nombre, int Edad)
    {
        this.Nombre=Nombre;
        this.Edad=Edad;
    }

    public abstract void Comer();
    public abstract void Dormir();
    
}
