package PryMVCCalculadoraAvanzada.Model;

public class CalculadoraAvanzadaModel {
    
    public int Suma (int a, int b)
    {
        return a+b;
    }

    public int Resta (int a, int b)
    {
        return a-b;
    }

    public int Multiplicacion (int a, int b)
    {
        return a*b;
    }

    public int Dividir (int a, int b)
    {
        if(b==0){
            return 0;
        }
        return a/b;
    }

    public int Potencia (int a, int Exponente)
    {
        if(Exponente==0)
        {
            return 1;
        }
        if (Exponente<0)
        {
            System.out.println("EL EXPONENTE DEBE SER UN ENTERO POSITIVO");
        }
        int resultado = 1;
        for(int i=0;i<Exponente;i++)
        {
            resultado *= a;
        }

        return resultado;
    }

    public int Raiz (int a)
    {
        return (int) Math.sqrt(a);
    }
}
