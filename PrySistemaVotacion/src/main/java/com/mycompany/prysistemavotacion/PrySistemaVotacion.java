
package com.mycompany.prysistemavotacion;

import Controller.Controlador;
import Model.CiudadanoModel;
import View.VistaView;

public class PrySistemaVotacion {

    public static void main(String[] args) {
        VistaView vista = new VistaView();
        CiudadanoModel ciudadano = new CiudadanoModel();
        Controlador control = new Controlador(ciudadano, vista);
        control.Iniciar();
    }
}
