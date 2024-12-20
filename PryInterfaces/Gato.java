package PryInterfaces;

public class Gato implements Mamifero{
    @Override
    public void HacerSonido()
    {
        System.out.println("EL GATO HACE MIAU");
    }

    @Override
    public void Amamantar()
    {
        System.out.println("EL GATO AMAMANTA A SUS CRIAS");
    }
}
