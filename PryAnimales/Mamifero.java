package PryAnimales;

public class Mamifero extends Animal{

    private String TipoPelaje;

    public Mamifero(String Nombre, int Edad, String TipoPelaje)
    {
        super(Nombre, Edad);
        this.TipoPelaje=TipoPelaje;
    }

    public void Amamantar()
    {
        System.out.println("El "+Nombre+" ESTA AMAMANTANDO A SUS CRIAS");
    }
    
}
