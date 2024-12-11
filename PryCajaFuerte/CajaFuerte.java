package PryCajaFuerte;

public class CajaFuerte {
    private double Saldo=0;

    public CajaFuerte(double SaldoInicial)
    {
        if (SaldoInicial>=0)
        {
            Saldo=SaldoInicial;
        }
        else 
        {
            System.err.println("El Saldo Inicial no puede ser negativo");
        }
    }

    public double GetSaldo()
    {
        return Saldo;
    }

    public void SetSaldo(double SaldoInicial)
    {
        if (SaldoInicial>=0)
        {
            Saldo+=SaldoInicial;
        }
        else 
        {
            System.err.println("LA CANRIDAD ES INVALIDA PARA AGREGAR A SU SALDO ACTUAL");
        }
    }

    public void Retirar(double retirar)
    {
        if (retirar>0 && retirar<Saldo)
        {
            Saldo-=retirar;
        }
        else
        {
            if (retirar>Saldo)
            {
                System.out.println("SALDO INSUFICIENTE:"+Saldo+"\nNO SE PUEDE HACER EL RETIRO: "+retirar);
            }
            if (retirar<0)
            {
                System.out.println("CANTIDAD INVALIDA: "+retirar);
            }
        }
    }
}
