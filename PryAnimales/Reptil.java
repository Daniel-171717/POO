package PryAnimales;

public class Reptil extends Animal{
    private String TipoEscamas;

    public Reptil(String Nombre, int Edad, String TipoEscamas)
    {
        super(Nombre,Edad);
        this.TipoEscamas=TipoEscamas;
    }

    public void Arrastrar()
    {
        System.out.println("LA "+Nombre+" SE ESTA ARRASTRANDO CON SUS ESCAMAS DE TIPO "+TipoEscamas);
    }
    
}
