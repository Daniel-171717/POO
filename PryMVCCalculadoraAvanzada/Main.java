package PryMVCCalculadoraAvanzada;

import PryMVCCalculadoraAvanzada.Controller.CalculadoraAvanzadaController;
import PryMVCCalculadoraAvanzada.Model.CalculadoraAvanzadaModel;
import PryMVCCalculadoraAvanzada.View.CalculadoraAvanzadaView;

public class Main {
    public static void main(String[] args) {
        CalculadoraAvanzadaModel modelo = new CalculadoraAvanzadaModel();
        CalculadoraAvanzadaView vista = new CalculadoraAvanzadaView();
        CalculadoraAvanzadaController control = new CalculadoraAvanzadaController(modelo, vista);
        control.Iniciar();
    }
}
