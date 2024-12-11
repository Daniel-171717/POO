package PryCajaFuerte;

public class Main {
    public static void main(String[] args) {
        CajaFuerte cajafuerte = new CajaFuerte(100);
        System.out.println("SALDO: "+cajafuerte.GetSaldo());
        cajafuerte.SetSaldo(500);
        System.out.println("SALDO ACTUAL: "+cajafuerte.GetSaldo());
        cajafuerte.Retirar(700);
        System.out.println("SALDO ACTUAL: "+cajafuerte.GetSaldo());
    }
}
