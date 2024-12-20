package PryTablasMultiplicar;

public class Tablas extends Multiplicar{

    private int Numero;
    public Tablas(int Numero)
    {
        this.Numero=Numero;
    }
    
    @Override
    public void Multiplicar()
    {
        for (int i=2;i<Numero+1;i++)
        {
            System.out.println("TABLA DEL NUMERO; "+i);
            for (int j=1;j<11;j++)
            {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
}
