package PryClaseAbstracta;


public class Perro extends Animal implements Mascota{

    public Perro(String Nombre, int Edad)
    {
        super(Nombre,Edad);
    }

    @Override
    public void Comer()
    {
        System.out.println("EL PERRO LE GUSTAR COMER CROQUETAS");
    }

    @Override
    public void Dormir()
    {
        System.out.println("AL PERRO LE GUSTAR DORMIR TODA LA MAÑANA");
    }

    @Override
    public void Jugar()
    {
        System.out.println("EL PERRO DEBE JUGAR TODO EL DIA EN EL PARQUE");
    }

    @Override
    public void MostrarCarino()
    {
        System.out.println("AL PERRO LE GUSTA MOSTRAR CARIÑO TODOS LOS DIAS");
    }
    
}
