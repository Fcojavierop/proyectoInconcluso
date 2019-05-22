/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Mensaje;
import modelo.Usuario;


/**
 *
 * @author FcoJavier
 */
public class MensajeDAO extends Conexion{
    public ArrayList<Mensaje> getMensajes() {
       ArrayList<Mensaje> listaMensajes = new ArrayList();

        Mensaje mensaje;
        com.mysql.jdbc.Connection con = getConexion();

        try {
            PreparedStatement ps = con.prepareStatement("select * from usuario"); //WHERE id= "+id_usuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                mensaje = new Mensaje();
                mensaje.setId_mensaje(Integer.parseInt(rs.getString(1)));
                //mensaje.setEmisor(rs.getUsuario(2));
                //mensaje.setReceptor(rs.getUsuario(3));
                mensaje.setContenido(rs.getString(4));
                
                
               

                listaMensajes.add(mensaje);

            }
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
            } catch (Exception o) {
                System.err.println(o);
            }
        }

        return listaMensajes;}
}
