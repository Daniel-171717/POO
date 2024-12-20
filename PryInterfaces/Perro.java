package PryInterfaces;

public class Perro implements Mamifero{

    @Override
    public void HacerSonido() {
        System.out.println("EL PERRO HACE GUAU");
    }

    @Override
    public void Amamantar() {
        System.out.println("EL PERRO AMAMANTA A SUS CRIAS");
    }
    
}
