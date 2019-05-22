/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Usuario;
import vista.BandejaEntrada;
import vista.Login;
import vista.NuevoMensaje;

/**
 *
 * @author FcoJavier
 */
public class BandejaEntradaController implements ActionListener {

    private BandejaEntrada bandeja;

    public BandejaEntradaController(BandejaEntrada bandeja) {
        this.bandeja = bandeja;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Nuevo Mensaje")) {
            NuevoMensaje mensajeNuevo = new NuevoMensaje();

            mensajeNuevo.setVisible(true);

        }
    }

}
