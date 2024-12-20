package PryTablasMultiplicar;

public class TablasS extends Multiplicar{
    private int Numero;
    private int Suma=0;
    private int SumaT=0;
    public TablasS(int Numero)
    {
        this.Numero=Numero;
    }
    
    @Override
    public void Multiplicar()
    {
        for (int i=2;i<Numero+1;i++)
        {
            System.out.println("TABLA DEL NUMERO: "+i);
            for (int j=1;j<11;j++)
            {
                System.out.println(i+" * "+j+" = "+(i*j));
                Suma+=(i*j);
            }
        System.out.println("LA SUMA DE LA TABLA DEL: "+Suma);
        SumaT+=Suma;
        }
        System.out.println("LA SUMA TOTAL DE LAS TABLAS: "+SumaT);
    }

}
