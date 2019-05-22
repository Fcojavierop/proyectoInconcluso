/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author FcoJavier
 */
public class UsuarioDAO extends Conexion {

    public ArrayList<Usuario> getUsuarios() {
          ArrayList<Usuario> listaUsuarios = new ArrayList();

        Usuario usuario;
        Connection con = getConexion();

        try {
            PreparedStatement ps = con.prepareStatement("select * from usuario");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(Integer.parseInt(rs.getString(1)));
                usuario.setNombre(rs.getString(2));

                listaUsuarios.add(usuario);

            }
        } catch (SQLException e) {
        } finally {
            try {
                con.close();
            } catch (Exception o) {
                System.err.println(o);
            }
        }

        return listaUsuarios;}

   

}
