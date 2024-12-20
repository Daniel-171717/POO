package PryTablasMultiplicar;

public class TablasI extends Multiplicar{

    private int Numero1;

    public TablasI(int Numero1)
    {
        this.Numero1=Numero1;
    }
    
    @Override
    public void Multiplicar()
    {
        for (int i=2;i<Numero1+1;i++)
        {
            System.out.println("TABLA DEL NUMERO: "+i);
            for (int j=10;j<11 && j>0;j--)
            {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
        }
    }
}
