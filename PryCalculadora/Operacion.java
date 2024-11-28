package PryCalculadora;

public class Operacion {
    public void Suma(double numero1, double numero2)
    {
        double resultado=numero1+numero2;
        System.out.println("La suma de los dos numeros es: "+resultado);
    }

    public void Restar(double numero1, double numero2)
    {
        double resultado=numero1-numero2;
        System.out.println("La resta de los dos numeros es: "+resultado);
    }

    public void Multiplicar(double numero1, double numero2)
    {
        double resultado=numero1*numero2;
        System.out.println("la multiplicacion de los dos numeros es: "+resultado);
    }

    public void Dividir(double numero1,double numero2)
    {
        double resultado=(numero1/numero2);
        System.out.println("La divicion de los dos numeros es: "+resultado);
    }
}
