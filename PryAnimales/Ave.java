package PryAnimales;

public class Ave extends Animal{
    private double EnvergaduraAla;

    public Ave(String Nombre, int Edad, double EnvergaduraAla)
    {
        super(Nombre,Edad);
        this.EnvergaduraAla=EnvergaduraAla;
    }

    public void Volar()
    {
        System.out.println("El "+Nombre+" ESTA VOLANDO CON UNA ENVERGADURA DE "+EnvergaduraAla);
    }
}
