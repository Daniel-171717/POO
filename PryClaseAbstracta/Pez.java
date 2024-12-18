package PryClaseAbstracta;

public class Pez extends Animal {

    public Pez (String Nombre, int Edad)
    {
        super(Nombre, Edad);
    }

    @Override
    public void Comer()
    {
        System.out.println("AL PEX LE GUSTAR COMER");
    }

    @Override
    public void Dormir()
    {
        System.out.println("EL PEZ DUERME MUCHO");
    }
    
}
